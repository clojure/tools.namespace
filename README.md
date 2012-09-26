clojure.tools.namespace
========================================

Tools for managing namespaces in Clojure. Parse `ns` declarations from
source files, extract their dependencies, build a graph of namespace
dependencies within a project, update that graph as files change, and
reload files in the correct order.

This is only about namespace dependencies *within* a single project.
It has nothing to do with Leiningen, Maven, JAR files, or
repositories.


Releases and Dependency Information
========================================

* Git master branch is **0.2.0-SNAPSHOT**

* [Latest stable release is 0.1.3](https://github.com/clojure/tools.namespace/tree/tools.namespace-0.1.3)

* [All Released Versions](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.clojure%22%20AND%20a%3A%22tools.namespace%22)

* [Development Snapshot Versions](https://oss.sonatype.org/content/groups/public/org/clojure/tools.namespace/0.2.0-SNAPSHOT/)

[Leiningen](https://github.com/technomancy/leiningen) configuration for development snapshots:

    :dependencies [ ;; ...
                   [org.clojure/tools.namespace "0.2.0-SNAPSHOT"]]
    :repositories {"sonatype-oss-public"
                   "https://oss.sonatype.org/content/groups/public/"}

[Maven](http://maven.apache.org/) configuration for development snapshots:

    <dependencies>
      <!-- ... -->
      <dependency>
        <groupId>org.clojure</groupId>
        <artifactId>tools.namespace</artifactId>
        <version>0.2.0-SNAPSHOT</version>
      </dependency>
    </dependencies>
    <repositories>
      <repository>
        <id>sonatype-oss-public</id>
        <url>https://oss.sonatype.org/content/groups/public/</url>
        <snapshots>
          <enabled>true</enabled>
        </snapshots>
      </repository>
    </repositories>


Usage
========================================

[API Documentation](http://clojure.github.com/tools.namespace/)

tools.namespace consists of several parts:

**clojure.tools.namespace.parse:** A parser for namespace declarations
in Clojure source files. Given a stream of characters from a Clojure
source file, it can find the `ns` declaration and parse the `:require`
and `:use` clauses to find the names of other namespaces that file
depends on. This is all syntactic analysis: it does not 
evaluate any code.

**clojure.tools.namespace.find:** Utilities to search for Clojure
namespaces on the filesystem, in directories or JAR files. Combined
with [java.classpath](http://clojure.github.com/java.classpath/), it
can search for namespaces on the Java classpath. This namespace
contains most of the functions in clojure.tools.namespace version
0.1.x.

**clojure.tools.namespace.repl:** Utilities to load and reload code
based on the namespace dependency graph. This takes some explaining,
see below. c.t.n.repl is built out of smaller parts:

* c.t.n.dependency - generic dependency graph data structure
* c.t.n.track - namespace dependency tracker
* c.t.n.file - file-reader extension to tracker
* c.t.n.dir - directory-scanner extension to tracker
* c.t.n.reload - namespace-reloading extension to tracker

You can recombine these parts in other ways, but c.t.n.repl is the
primary public entry-point to their functionality.


Reloading Code: Motivation
----------------------------

c.t.n.repl is a smarter way to reload code. 

The traditional way to reload Clojure code without restarting the JVM
is `(require ... :reload)` or `:reload-all` or an editor/IDE feature
that does the same thing. This has several problems:

* If you modify two namespaces which depend on each other, you must
  remember to reload them in the correct order to avoid compilation
  errors.

* If you remove definitions from a source file and then reload it,
  those definitions are still available in memory. If other code
  depends on those definitions, it will continue to work but will
  break the next time you restart the JVM.

* If the reloaded namespace contains `defmulti`, you must also reload
  all of the associated `defmethod` expressions.

* If the reloaded namespace contains `defprotocol`, you must also
  reload any records or types implementing that protocol and create
  new instances.

* If the reloaded namespace contains macros, you must also reload any
  namespaces which use those macros.

* If the running program contains functions which close over values in
  the reloaded namespace, those closed-over values are not updated.
  (This is common in web applications which construct the "handler
  stack" as a composition of functions.)

Often the only surefire way to reload Clojure code is to restart the
JVM. A large Clojure application can take 20 seconds or more just to
compile. I wrote tools.namespace to help speed up this development
cycle.


Reloading Code: Usage
-----------------------

There's only one important function, `refresh`:

    user=> (use '[clojure.tools.namespace.repl :only (refresh)])
    nil

    user=> (refresh)
    :reloading (com.example.util com.example.app com.example.app-test)
    :ok

The `refresh` function will scan all the directories on the classpath
for Clojure source files, read their `ns` declarations, build a graph
of their dependencies, and load them in dependency order. (You can
change the directories it scans with `set-refresh-dirs`.)

Later on, after you have changed and saved a few files in your editor,
run it again:

    user=> (refresh)
    :reloading (com.example.app com.example.app-test)
    :ok

Based on file modification timestamps and the graph of dependencies,
the `refresh` function will reload *only* the namespaces that have
changed, in dependency order. But first, it will *unload* the
namespaces that changed to clear out any old definitions. 

This is quite unlike `(require ... :reload)`. Calling `refresh` will
*blow away your old code*. Sometimes this is helpful: it can catch
trivial mistakes like deleting a function that another piece of code
depends on. But sometimes it hurts when you have built-up application
state stored in a Var that got deleted by `refresh`.

This brings us to the next section:


Reloading Code: Preparing Your Application
--------------------------------------------

Being able to safely destroy and reload namespaces without breaking
your application requires some discipline and careful design. It won't
"just work" on any Clojure project.

### No Global State

The first rule for making your application reload-safe is **no global
state**. That means you should avoid things like this:

    (def state-of-world (ref {}))
    (def object-handle (atom nil))

c.t.n.repl/refresh will destroy those Vars when it reloads the
namespace (even if you used `defonce`).

Instead of storing your state in global Vars, store it *locally* in an
object that represents the running state of your application. Then
provide a constructor function to initialize that state:

    (defn create-application []
      {:state-of-world (ref {})
       :object-handle (atom nil)})

You can choose what representation works best for your application:
map, vector, record, or even just a single Ref by itself.

Typically you'll still need one global `def` somewhere, perhaps in the
REPL itself, to hold the current application instance. See "Managing
Reloads" below.

### Managed Lifecycle

The second rule for making your application reload-safe is having a
consistent way to **start and stop the entire system**. I like to do
this with a protocol implemented by each major component in the
system:

    (defprotocol Lifecycle
      (start [component])
      (stop [component]))

Smaller applications can probably get along fine with just a pair of
functions.

The point is that you need a convenient way to destroy all the
built-up state of your application and then *recreate it from
scratch*. The "stop" function should stop any running processes,
release all external resources, and zero-out any internal state. The
"start" function should create internal state, acquire resources, and
start processes.

It might take a few tries to get it right, but once you have a working
start/stop you can have a workflow like this:

Step 1. Start up a REPL.

Step 2. Load the app:

    user=> (use '[clojure.tools.namespace.repl :only (refresh)])
    user=> (refresh)
    user=> (def my-app (create-application))
    user=> (start my-app)

Step 3. Test it out.

Step 4. Modify some source files.

Step 5. Restart:

    user=> (stop my-app)
    user=> (refresh)
    user=> (def my-app (create-application))
    user=> (start my-app)

(You could also combine all those steps in a single utility function.)

After that, you've got a squeaky-clean new instance of your app
running, in a fraction of the time it takes to restart the JVM.

### Handling Errors

If an exception is thrown while loading a namespace, `refresh` stops,
prints the namespace that caused the exception, and returns the
exception. You can print the rest of the stacktrace with
`clojure.repl/pst`; the exception itself is bound to `*e`.

    user=> (refresh)
    :reloading (com.example.app com.example.app-test)
    :error-while-loading com.example.app
    #<IllegalArgumentException java.lang.IllegalArgumentException:
      Parameter declaration cond should be a vector>

    user=> (clojure.repl/pst)
    IllegalArgumentException Parameter declaration cond should be a vector
            clojure.core/assert-valid-fdecl (core.clj:6567)
            clojure.core/sigs (core.clj:220)
            clojure.core/defn (core.clj:294)
            clojure.lang.Var.invoke (Var.java:427)
            ...

Remember that any namespaces which depend on the namespace that caused
the exception *do not exist* at this point: they have been removed but
not yet reloaded. 

After you fix the problem, call `refresh` again and it will resume
reloading where it left off. If your current REPL namespace is one of
those that has not yet been reloaded, then you will need to call
`refresh` by its fully-qualified name
`clojure.tools.namespace.repl/refresh`.

    user=> (refresh)
    :reloading (com.example.app com.example.app-test)
    :ok

### Managing Reloads

Some projects have a "project REPL" or a "scratch" namespace where you
want keep state during development. You can use the functions
`disable-unload!` and `disable-reload!` in
`clojure.tools.namespace.repl` to prevent `refresh` from automatically
un/reloading those namespaces.

Use this feature sparingly: it exists as a development-time
convenience, not a work-around for code that is not reload-safe. Also,
see the warnings about aliases, below. Aliases to reloaded namespaces
will break if the namespace *containing* the alias is not reloaded
also.


Warnings
--------------------

Be careful when reloading the namespace in which you run your REPL.
Because namespaces are removed when reloading, all your past
definitions are lost. Either keep your REPL in a namespace which has
no file associated with it, such as `user`, or put all your REPL
definitions in a "scratch" namespace that can be reloaded.

Be careful when using fully-qualified symbol names without namespace
aliases (`require` with no `:as`). If the namespace happens to be
loaded already, it will not necessarily cause an error if you forget
to `require` it, but the dependency graph of namespaces will be
incorrect.

Beware of code which has references to old definitions, especially
references to things you created in the REPL.

If you create your own instance of the dependency tracker, do not
store it in a namespace which gets reloaded.

### Warnings for Aliases

Namespace aliases created at the REPL will still refer to the *old* namespace  after `refresh`. For example:

    user=> (require '[com.example.foo :as foo])
    
    user=> foo/bar

    user=> (refresh)
    :reloading (com.example.foo)
    :ok

    user=> foo/bar   ; this is the *old* foo/bar

If you try to recreate the alias with the new namespace, you will get an error:

    user=> (require '[com.example.foo :as foo])
    IllegalStateException Alias foo already exists in
    namespace user, aliasing com.example.foo
    clojure.lang.Namespace.addAlias (Namespace.java:224)

The only way out is to remove the alias before recreating it:

    user=> (ns-unalias *ns* 'foo)
    nil
    user=> (alias 'foo 'com.example.foo)

### Warnings for Protocols

When reloading namespaces which contain protocols, be careful that you
do not leave any old instances of records or types implementing those
protocols.

For example, if you have a namespace like this:

    (ns com.example.foo)
    
    (defprotocol IFoo
      (foo [this]))
    
    (defrecord FooRecord []
      IFoo (foo [this] nil))

And you do something like the following at the REPL:

    user=> (def my-foo (->FooRecord))
    user=> (clojure.tools.namespace.repl/refresh)
    user=> (foo my-foo)

You will get a confusing error message like this:

    IllegalArgumentException
    No implementation of method: :foo
    of protocol: #'com.example.foo/IFoo
    found for class: com.example.foo.FooRecord
    clojure.core/-cache-protocol-fn (core_deftype.clj:527)

That's because `my-foo` is an **instance** of the **old** version of
`FooRecord`, implementing the **old** version of `IFoo`. As far as the
JVM is concerned, the old `IFoo` and the new `IFoo` are completely
different classes.

To avoid this problem, always create new instances of records after a
refresh.


Copyright and License
========================================

Copyright © 2012 Stuart Sierra

Licensed under the [Eclipse Public License Version 1.0](https://github.com/clojure/tools.namespace/blob/master/epl.html).


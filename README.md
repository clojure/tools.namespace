clojure.tools.namespace
========================================

Tools for managing namespaces in Clojure. It can parse `ns`
declarations from source files, extract their dependencies, build a
graph of inter-namespace dependencies within a project, update that
graph as files change, and reload files in the correct order.


Releases and Dependency Information
========================================

*Current master branch is an unstable work-in-progress*

[Latest stable release is 0.1.3](https://github.com/clojure/tools.namespace/tree/tools.namespace-0.1.3)

* [All Released Versions](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.clojure%22%20AND%20a%3A%22tools.namespace%22)

* [Development Snapshot Versions](https://oss.sonatype.org/index.html#nexus-search;gav~org.clojure~tools.namespace~~~)

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


Warnings
========================================

* Do not store the dependency tracker in a namespace which gets reloaded.

* If you reload the REPL's current namespace, call `in-ns` after reloading.

* Beware code which has references to old definitions.


Warnings for Protocols
----------------------

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



## License

Copyright Stuart Sierra

Licensed under the EPL. (See the file epl.html.)


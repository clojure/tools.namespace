# Change Log for tools.namespace


## 0.3.x series

### Version 0.3.0-alpha3 on 5-Jan-2016

  * Ignore `:require-macros` and `:use-macros` when parsing namespace
    dependencies. This is a change in behavior from previous 0.3
    alphas and is a more robust fix for [TNS-38]. tools.namespace
    currently only models one dependency graph at a time, so it treats
    Clojure and ClojureScript as separate worlds and will not attempt
    to analyze dependency relationships which cross that boundary.

  * Fix [TNS-40]: do not catch exceptions in `c.t.n.file`. Instead,
    catch and ignore only syntax exceptions (identified by `ex-data`
    from [tools.reader]). This is a change in behavior from
    0.3.0-alpha2 and 0.2. It should have minimal impact on users but
    make some errors (such as an incompatible version of tools.reader)
    more obvious.

  * Known bugs not yet fixed: [TNS-42] When the same namespace is
    defined in both `.clj` and `.cljc` files, dependencies may be read
    from either, when it should prefer the `.clj` file.

### Version 0.3.0-alpha2 on 13-Nov-2015

  * Fix [TNS-38]: ignore circular dependency from `.cljs` file to
    `.clj` file in `:require-macros`

  * [tools.reader] version 0.10.0

  * [java.classpath] version 0.2.3

  * Add `clojure.tools.namespace.parse/name-from-ns-decl`

### Version 0.3.0-alpha1 on 14-Aug-2015

  * **Partial ClojureScript Support** [TNS-35]

      * Platform-neutral namespaces were converted to conditional-read
        (`.cljc`) files: c.t.n.dependency, c.t.n.track, and
        c.t.n.parse. These namespaces can be used in ClojureScript
        programs.

      * Added support for finding, parsing, and analyzing
        ClojureScript source files (`.cljs` and `.cljc`) in
        c.t.n.file, c.t.n.parse, c.t.n.dir, and c.t.n.find with
        optional "platform" arguments. These namespaces still only
        **run** on the Clojure(JVM) platform.

      * Reloading and interactive features remain Clojure(JVM) only
        for now: c.t.n.move, c.t.n.reload, and c.t.n.repl

      * Uses [tools.reader] for platform-independent parsing and
        conditional-reader support.

  * Minimum Clojure version is 1.7.0

  * Breaking change: `c.t.n.parse/read-ns-decl` no longer returns
    `nil` on syntax errors. Instead, exceptions are allowed to
    propagate up from tools.reader. This change only affects code
    which calls `read-ns-decl` directly. c.t.n.file and c.t.n.find
    will catch and ignore reader exeptions when trying to read
    namespace declarations.

  * Enhancement [TNS-36]: Use java.classpath for better JVM classpath
    resolution

  * Possible breaking change: parse/read-ns-decl does not capture
    reader errors

  * Some definitions deprecated; see source code or Var metadata for
    details.

  * Adds dependency on [java.classpath]



## 0.2.x series

### Version 0.2.11 on 19-Jun-2015

  * [TNS-34] Allow reader conditionals in parsed source files

### Version 0.2.10 on 26-Feb-2015

  * Widen existing functions to handle both clj and cljc files in
    advance of reader conditional support in Clojure 1.7.

### Version 0.2.9 on 31-Jan-2015

  * Fix [TNS-20]: Undefined 'unload' order after namespaces are first
    added to an new, empty tracker.

  * Improvement [TNS-21]: Support `ns` clauses which use vectors
    instead of lists for clauses, contrary to docs.

  * Improvement [TNS-32]: Support `ns` clauses which use symbols as
    clause heads instead of keywords, contrary to docs.

### Version 0.2.8 on 19-Dec-2014

  * Improvement [TNS-31]: Specific error message when `:after` symbol
    passed to `refresh` cannot be resolved.

  * Fix [TNS-26]: namespace alias recovery after failed reload did not
    work due to local binding shadowing global Var

### Version 0.2.7 on 19-Sept-2014

  * [Revert bad commit](https://github.com/clojure/tools.namespace/commit/27194f2edfe3f5f9e1343f993beca4b43f0bafe8)
    mistakenly included in 0.2.6 which could cause the tracker's
    'unload' order to be incorrect. See discussion at [TNS-20].

### **BROKEN** Version 0.2.6 on 7-Sept-2014 **DO NOT USE**

  * `clojure.tools.namespace.parse/read-ns-decl` asserts that its
    argument is a PushbackReader, instead of silently returning nil

  * Fix [TNS-22]: broken `clojure.string/replace` with Windows path
    separator

### Version 0.2.5 on 15-Jul-2014

  * New `clojure.tools.namespace.repl/clear` empties the state of the
    REPL dependency tracker. This can help repair the dependency
    tracker after a failed load or a circular dependency error.

  * Enhancement [TNS-19]: `deps-from-ns-decl` should return an empty
    set instead of nil. This may be a breaking change for some but
    is consistent with the original docstring.

  * Enhancement [TNS-18]: Compute transitive dependencies in linear time.

  * Enhancement [TNS-17]: The `ns` form doesn't need to be the first
    top-level form in a file.

  * Fix [TNS-16]: Don't depend on specific hash ordering in tests.
    Exposed by new hash functions in Clojure 1.6.0.

  * Fix [TNS-15]: Handle spaces in classpath directories (old
    `clojure.tools.namespace`)

  * Fix [TNS-12]: Duplicate definition of `jar-file?`

### Version 0.2.4 on 19-Jul-2013

  * Fix [TNS-10]: Forbid circular dependency when a namespace depends
    on itself

  * Fix [TNS-9] and [TNS-11]: support other prefix-list forms

  * Fix [TNS-8]: In `move-ns`, do not modify files whose contents does
    not change

### Version 0.2.3 on 01-Apr-2013

  * New: Attempt recovery of aliases/refers in REPL after error

### Version 0.2.2 on 14-Dec-2012

  * New: Add `:after` option to `refresh`

  * New: Add `clojure.tools.namespace.move`

  * Fix [TNS-4], reflection warnings

### Version 0.2.1 on 26-Oct-2012

  * Fix: Restore deprecated 0.1.x APIs in `clojure.tools.namespace`

  * Fix [TNS-3], actually use `refresh-dirs`

### **BROKEN** Version 0.2.0 on 05-Oct-2012 **DO NOT USE**

  * Not recommended for use: this release introduced breaking API
    changes (renaming core namespaces and functions) without
    backwards-compatibility. Applications with dependencies on both
    the 0.2.x and 0.1.x APIs cannot use this version.

  * New dependency tracking & reloading features

  * Eliminate dependency on [java.classpath]



## 0.1.x series

### Version 0.1.3 on 24-Apr-2012

  * Fix [TNS-1] Workaround for Clojure 1.2 reader bug

### Version 0.1.2 on 10-Feb-2012

  * Fix: Eliminate reflection warnings

### Version 0.1.1 on 18-May-2011

### Version 0.1.0 on 24-Apr-2011

  * Source-compatible with clojure.contrib.find-namespaces in old
    clojure-contrib 1.2.0


[TNS-1]: http://dev.clojure.org/jira/browse/TNS-1
[TNS-3]: http://dev.clojure.org/jira/browse/TNS-3
[TNS-4]: http://dev.clojure.org/jira/browse/TNS-4
[TNS-8]: http://dev.clojure.org/jira/browse/TNS-8
[TNS-9]: http://dev.clojure.org/jira/browse/TNS-9
[TNS-10]: http://dev.clojure.org/jira/browse/TNS-10
[TNS-11]: http://dev.clojure.org/jira/browse/TNS-11
[TNS-12]: http://dev.clojure.org/jira/browse/TNS-12
[TNS-15]: http://dev.clojure.org/jira/browse/TNS-15
[TNS-16]: http://dev.clojure.org/jira/browse/TNS-16
[TNS-17]: http://dev.clojure.org/jira/browse/TNS-17
[TNS-18]: http://dev.clojure.org/jira/browse/TNS-18
[TNS-19]: http://dev.clojure.org/jira/browse/TNS-19
[TNS-20]: http://dev.clojure.org/jira/browse/TNS-20
[TNS-21]: http://dev.clojure.org/jira/browse/TNS-21
[TNS-22]: http://dev.clojure.org/jira/browse/TNS-22
[TNS-23]: http://dev.clojure.org/jira/browse/TNS-23
[TNS-24]: http://dev.clojure.org/jira/browse/TNS-24
[TNS-25]: http://dev.clojure.org/jira/browse/TNS-25
[TNS-26]: http://dev.clojure.org/jira/browse/TNS-26
[TNS-27]: http://dev.clojure.org/jira/browse/TNS-27
[TNS-28]: http://dev.clojure.org/jira/browse/TNS-28
[TNS-29]: http://dev.clojure.org/jira/browse/TNS-29
[TNS-30]: http://dev.clojure.org/jira/browse/TNS-30
[TNS-31]: http://dev.clojure.org/jira/browse/TNS-31
[TNS-32]: http://dev.clojure.org/jira/browse/TNS-32
[TNS-33]: http://dev.clojure.org/jira/browse/TNS-33
[TNS-34]: http://dev.clojure.org/jira/browse/TNS-34
[TNS-35]: http://dev.clojure.org/jira/browse/TNS-35
[TNS-36]: http://dev.clojure.org/jira/browse/TNS-36
[TNS-37]: http://dev.clojure.org/jira/browse/TNS-37
[TNS-38]: http://dev.clojure.org/jira/browse/TNS-38
[TNS-39]: http://dev.clojure.org/jira/browse/TNS-39
[TNS-40]: http://dev.clojure.org/jira/browse/TNS-40
[TNS-41]: http://dev.clojure.org/jira/browse/TNS-41
[TNS-42]: http://dev.clojure.org/jira/browse/TNS-42
[java.classpath]: https://github.com/clojure/java.classpath
[tools.reader]: https://github.com/clojure/tools.reader
[JEP 122]: http://openjdk.java.net/jeps/122

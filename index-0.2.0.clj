{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace-api.html",
   :name "clojure.tools.namespace",
   :author "Stuart Sierra",
   :doc "Search for ns declarations in dirs, JARs, or CLASSPATH"}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.dependency-api.html",
   :name "clojure.tools.namespace.dependency",
   :doc
   "Bidirectional graphs of dependencies and dependent objects."}),
 :vars
 ({:arglists ([file]),
   :name "clojure-source-file?",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L59",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/clojure-source-file?",
   :doc "Returns true if file is a normal file with a .clj extension.",
   :var-type "function",
   :line 59,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jar-file]),
   :name "clojure-sources-in-jar",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L120",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/clojure-sources-in-jar",
   :doc
   "Returns a sequence of filenames ending in .clj found in the JAR file.",
   :var-type "function",
   :line 120,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([form]),
   :name "comment?",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L73",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/comment?",
   :doc "Returns true if form is a (comment ...)",
   :var-type "function",
   :line 73,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([decl]),
   :name "deps-from-ns-decl",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L191",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/deps-from-ns-decl",
   :doc
   "Given an (ns...) declaration form (unevaluated), returns a set of\nsymbols naming the dependencies of that namespace.  Handles :use and\n:require clauses but not :load.",
   :var-type "function",
   :line 191,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-clojure-sources-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L65",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-clojure-sources-in-dir",
   :doc
   "Searches recursively under dir for Clojure source files (.clj).\nReturns a sequence of File objects, in breadth-first sort order.",
   :var-type "function",
   :line 65,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([files]),
   :name "find-namespaces",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L163",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces",
   :doc
   "Searches a sequence of java.io.File objects (both directories and\nJAR files) for .clj source files containing (ns...) declarations.\nReturns a sequence of the symbol names of the declared\nnamespaces. Use with clojure.java.classpath to search Clojure's\nclasspath.",
   :var-type "function",
   :line 163,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-namespaces-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L111",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-in-dir",
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the symbol names of the declared namespaces.",
   :var-type "function",
   :line 111,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile]),
   :name "find-namespaces-in-jarfile",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L143",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-in-jarfile",
   :doc
   "Searches the JAR file for Clojure source files containing (ns ...)\ndeclarations.  Returns a sequence of the symbol names of the\ndeclared namespaces.",
   :var-type "function",
   :line 143,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([files]),
   :name "find-ns-decls",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L153",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls",
   :doc
   "Searches a sequence of java.io.File objects (both directories and\nJAR files) for .clj source files containing (ns...) declarations.\nReturns a sequence of the unevaluated ns declaration forms. Use with\nclojure.java.classpath to search Clojure's classpath.",
   :var-type "function",
   :line 153,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-ns-decls-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L105",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-in-dir",
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the unevaluated ns declarations.",
   :var-type "function",
   :line 105,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile]),
   :name "find-ns-decls-in-jarfile",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L135",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-in-jarfile",
   :doc
   "Searches the JAR file for Clojure source files containing (ns ...)\ndeclarations; returns the unevaluated ns declarations.",
   :var-type "function",
   :line 135,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([form]),
   :name "ns-decl?",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L78",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/ns-decl?",
   :doc "Returns true if form is a (ns ...) declaration.",
   :var-type "function",
   :line 78,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([file]),
   :name "read-file-ns-decl",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L97",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-file-ns-decl",
   :doc
   "Attempts to read a (ns ...) declaration from file, and returns the\nunevaluated form.  Returns nil if read fails, or if the first form\nis not a ns declaration.",
   :var-type "function",
   :line 97,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([rdr]),
   :name "read-ns-decl",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L83",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-ns-decl",
   :doc
   "Attempts to read a (ns ...) declaration from rdr, and returns the\nunevaluated form.  Returns nil if read fails or if a ns declaration\ncannot be found.  The ns declaration must be the first Clojure form\nin the file, except for (comment ...)  forms.",
   :var-type "function",
   :line 83,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile entry-name]),
   :name "read-ns-decl-from-jarfile-entry",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj#L125",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-ns-decl-from-jarfile-entry",
   :doc
   "Attempts to read a (ns ...) declaration from the named entry in the\nJAR file, and returns the unevaluated form.  Returns nil if the read\nfails, or if the first form is not a ns declaration.",
   :var-type "function",
   :line 125,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([graph x y]),
   :name "dependent?",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj#L78",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/dependent?",
   :doc "True if y is a dependent of x.",
   :var-type "function",
   :line 78,
   :file "src/main/clojure/clojure/tools/namespace/dependency.clj"}
  {:arglists ([graph x y]),
   :name "depends?",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj#L73",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/depends?",
   :doc "True if x is directly or transitively dependent on y.",
   :var-type "function",
   :line 73,
   :file "src/main/clojure/clojure/tools/namespace/dependency.clj"}
  {:arglists ([]),
   :name "graph",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj#L70",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/graph",
   :doc "Returns a new, empty, dependency graph.",
   :var-type "function",
   :line 70,
   :file "src/main/clojure/clojure/tools/namespace/dependency.clj"}
  {:arglists ([graph]),
   :name "topo-comparator",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj#L83",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/topo-comparator",
   :doc
   "Returns a comparator which produces a topographical sort based on\nthe dependencies in graph.",
   :var-type "function",
   :line 83,
   :file "src/main/clojure/clojure/tools/namespace/dependency.clj"}
  {:arglists ([graph coll]),
   :name "topo-sort",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj#L89",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/topo-sort",
   :doc
   "Returns a topographically-sorted sequence of the items in coll\nusing dependencies in graph.",
   :var-type "function",
   :line 89,
   :file "src/main/clojure/clojure/tools/namespace/dependency.clj"}
  {:arglists ([graph keyfn coll]),
   :name "topo-sort-by",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj#L95",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/topo-sort-by",
   :doc
   "Returns a topographically-sorted sequence of the items in coll by\ncomparing (keyfn item) using dependencies in graph.",
   :var-type "function",
   :line 95,
   :file "src/main/clojure/clojure/tools/namespace/dependency.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/MapDependencyGraph",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "type",
   :name "MapDependencyGraph"}
  {:file "src/main/clojure/clojure/tools/namespace/dependency.clj",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj#L5",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/DependencyGraph",
   :namespace "clojure.tools.namespace.dependency",
   :line 5,
   :var-type "protocol",
   :doc nil,
   :name "DependencyGraph"}
  {:file "src/main/clojure/clojure/tools/namespace/dependency.clj",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/33ef950d8cf1ca38c64fe55aca50afdc9fd838cc/src/main/clojure/clojure/tools/namespace/dependency.clj#L17",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/DependencyGraphUpdate",
   :namespace "clojure.tools.namespace.dependency",
   :line 17,
   :var-type "protocol",
   :doc nil,
   :name "DependencyGraphUpdate"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/immediate-dependencies",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph key]),
   :doc "Returns the set of immediate dependencies of key.",
   :name "immediate-dependencies"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/immediate-dependents",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph key]),
   :doc "Returns the set of immediate dependents of key.",
   :name "immediate-dependents"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/transitive-dependencies",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph key]),
   :doc
   "Returns the set of all things which key depends on, directly or\ntransitively.",
   :name "transitive-dependencies"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/transitive-dependents",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph key]),
   :doc
   "Returns the set of all things which depend upon key, directly or\ntransitively.",
   :name "transitive-dependents"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/depend",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph key dep]),
   :doc
   "Returns a new graph with a dependency from key to dep (\"key depends\non dep\"). Forbids circular dependencies.",
   :name "depend"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/remove-all",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph key]),
   :doc
   "Returns a new dependency graph with all references to key removed.",
   :name "remove-all"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/remove-key",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph key]),
   :doc
   "Removes the key from the dependency graph without removing it as a\ndependency of other keys.",
   :name "remove-key"})}

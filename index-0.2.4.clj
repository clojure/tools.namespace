{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace-api.html",
   :name "clojure.tools.namespace",
   :author "Stuart Sierra",
   :doc
   "This namespace is DEPRECATED; most functions have been moved to\nother namespaces"}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.dependency-api.html",
   :name "clojure.tools.namespace.dependency",
   :author "Stuart Sierra",
   :doc "Bidirectional graphs of dependencies and dependent objects."}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dir.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.dir-api.html",
   :name "clojure.tools.namespace.dir",
   :author "Stuart Sierra",
   :doc
   "Track namespace dependencies and changes by monitoring\nfile-modification timestamps"}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/file.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.file-api.html",
   :name "clojure.tools.namespace.file",
   :author "Stuart Sierra",
   :doc "Read and track namespace information from files"}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.find-api.html",
   :name "clojure.tools.namespace.find",
   :author "Stuart Sierra",
   :doc
   "Search for namespace declarations in directories and JAR files."}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/ca860fc9a8d760970e249ecd105b6b16e127b5c1/src/main/clojure/clojure/tools/namespace/move.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.move-api.html",
   :name "clojure.tools.namespace.move",
   :author "Stuart Sierra",
   :doc
   "Refactoring tool to move a Clojure namespace from one name/file to\nanother, and update all references to that namespace in your other\nClojure source files.\n\nWARNING: This code is ALPHA and subject to change. It also modifies\nand deletes your source files! Make sure you have a backup or\nversion control."}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/4850d4aa3b5b4c990be0958065dcf6b94bb55004/src/main/clojure/clojure/tools/namespace/parse.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.parse-api.html",
   :name "clojure.tools.namespace.parse",
   :author "Stuart Sierra",
   :doc
   "Parse Clojure namespace (ns) declarations and extract\ndependencies."}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/f192aadc659c0685522ae508a3038e704d7ae10d/src/main/clojure/clojure/tools/namespace/reload.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.reload-api.html",
   :name "clojure.tools.namespace.reload",
   :author "Stuart Sierra",
   :doc
   "Force reloading namespaces on demand or through a\ndependency tracker"}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/37dae6b34983d513d7b7489e58b94c18f1da2fbb/src/main/clojure/clojure/tools/namespace/repl.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.repl-api.html",
   :name "clojure.tools.namespace.repl",
   :author "Stuart Sierra",
   :doc "REPL utilities for working with namespaces"}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/14a2522106979225793e790323a35921410afc07/src/main/clojure/clojure/tools/namespace/track.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.track-api.html",
   :name "clojure.tools.namespace.track",
   :author "Stuart Sierra",
   :doc
   "Dependency tracker which can compute which namespaces need to be\nreloaded after files have changed. This is the low-level\nimplementation that requires you to find the namespace dependencies\nyourself: most uses will interact with the wrappers in\nclojure.tools.namespace.file and clojure.tools.namespace.dir or the\npublic API in clojure.tools.namespace.repl."}),
 :vars
 ({:arglists ([file]),
   :name "clojure-source-file?",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj#L22",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/clojure-source-file?",
   :doc
   "DEPRECATED; trivial to implement locally\n\nReturns true if file is a normal file with a .clj extension.",
   :var-type "function",
   :line 22,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jar-file]),
   :name "clojure-sources-in-jar",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj#L134",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/clojure-sources-in-jar",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nReturns a sequence of filenames ending in .clj found in the JAR file.",
   :var-type "function",
   :line 134,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([form]),
   :name "comment?",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj#L40",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/comment?",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.parse\n\nReturns true if form is a (comment ...)",
   :var-type "function",
   :line 40,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-clojure-sources-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj#L30",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-clojure-sources-in-dir",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches recursively under dir for Clojure source files (.clj).\nReturns a sequence of File objects, in breadth-first sort order.",
   :var-type "function",
   :line 30,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-namespaces-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj#L88",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-in-dir",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the symbol names of the declared namespaces.",
   :var-type "function",
   :line 88,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile]),
   :name "find-namespaces-in-jarfile",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj#L164",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-in-jarfile",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches the JAR file for Clojure source files containing (ns ...)\ndeclarations.  Returns a sequence of the symbol names of the\ndeclared namespaces.",
   :var-type "function",
   :line 164,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([]),
   :name "find-namespaces-on-classpath",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj#L187",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-on-classpath",
   :doc
   "DEPRECATED; use clojure.tools.namespace.find/find-namespaces\nand clojure.java.classpath/classpath from\nhttp://github.com/clojure/java.classpath\n\nSearches CLASSPATH (both directories and JAR files) for Clojure\nsource files containing (ns ...) declarations.  Returns a sequence\nof the symbol names of the declared namespaces.",
   :var-type "function",
   :line 187,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-ns-decls-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj#L80",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-in-dir",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the unevaluated ns declarations.",
   :var-type "function",
   :line 80,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile]),
   :name "find-ns-decls-in-jarfile",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj#L154",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-in-jarfile",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches the JAR file for Clojure source files containing (ns ...)\ndeclarations; returns the unevaluated ns declarations.",
   :var-type "function",
   :line 154,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([]),
   :name "find-ns-decls-on-classpath",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj#L175",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-on-classpath",
   :doc
   "DEPRECATED; use clojure.tools.namespace.find/find-ns-decls\nand clojure.java.classpath/classpath from\nhttp://github.com/clojure/java.classpath\n\nSearches CLASSPATH (both directories and JAR files) for Clojure\nsource files containing (ns ...) declarations. Returns a sequence of\nthe unevaluated ns declaration forms.",
   :var-type "function",
   :line 175,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([form]),
   :name "ns-decl?",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj#L47",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/ns-decl?",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.parse\n\nReturns true if form is a (ns ...) declaration.",
   :var-type "function",
   :line 47,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([file]),
   :name "read-file-ns-decl",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj#L70",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-file-ns-decl",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.file\n\nAttempts to read a (ns ...) declaration from file, and returns the\nunevaluated form.  Returns nil if read fails, or if the first form\nis not a ns declaration.",
   :var-type "function",
   :line 70,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([rdr]),
   :name "read-ns-decl",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj#L54",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-ns-decl",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.parse\n\nAttempts to read a (ns ...) declaration from rdr, and returns the\nunevaluated form.  Returns nil if read fails or if a ns declaration\ncannot be found.  The ns declaration must be the first Clojure form\nin the file, except for (comment ...)  forms.",
   :var-type "function",
   :line 54,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile entry-name]),
   :name "read-ns-decl-from-jarfile-entry",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj#L141",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-ns-decl-from-jarfile-entry",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nAttempts to read a (ns ...) declaration from the named entry in the\nJAR file, and returns the unevaluated form.  Returns nil if the read\nfails, or if the first form is not a ns declaration.",
   :var-type "function",
   :line 141,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([graph x y]),
   :name "dependent?",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj#L102",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/dependent?",
   :doc "True if y is a dependent of x.",
   :var-type "function",
   :line 102,
   :file "src/main/clojure/clojure/tools/namespace/dependency.clj"}
  {:arglists ([graph x y]),
   :name "depends?",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj#L97",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/depends?",
   :doc "True if x is directly or transitively dependent on y.",
   :var-type "function",
   :line 97,
   :file "src/main/clojure/clojure/tools/namespace/dependency.clj"}
  {:arglists ([]),
   :name "graph",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj#L94",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/graph",
   :doc "Returns a new, empty, dependency graph.",
   :var-type "function",
   :line 94,
   :file "src/main/clojure/clojure/tools/namespace/dependency.clj"}
  {:arglists ([graph]),
   :name "topo-comparator",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj#L132",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/topo-comparator",
   :doc
   "Returns a comparator fn which produces a topological sort based on\nthe dependencies in graph. Nodes not present in the graph will sort\nafter nodes in the graph.",
   :var-type "function",
   :line 132,
   :file "src/main/clojure/clojure/tools/namespace/dependency.clj"}
  {:arglists ([graph]),
   :name "topo-sort",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj#L107",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/topo-sort",
   :doc "Returns a topologically-sorted list of nodes in graph.",
   :var-type "function",
   :line 107,
   :file "src/main/clojure/clojure/tools/namespace/dependency.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/MapDependencyGraph",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "record",
   :name "MapDependencyGraph"}
  {:file "src/main/clojure/clojure/tools/namespace/dependency.clj",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj#L14",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/DependencyGraph",
   :namespace "clojure.tools.namespace.dependency",
   :line 14,
   :var-type "protocol",
   :doc nil,
   :name "DependencyGraph"}
  {:file "src/main/clojure/clojure/tools/namespace/dependency.clj",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dependency.clj#L28",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/DependencyGraphUpdate",
   :namespace "clojure.tools.namespace.dependency",
   :line 28,
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
   :arglists ([graph node]),
   :doc "Returns the set of immediate dependencies of node.",
   :name "immediate-dependencies"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/immediate-dependents",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node]),
   :doc "Returns the set of immediate dependents of node.",
   :name "immediate-dependents"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/nodes",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph]),
   :doc "Returns the set of all nodes in graph.",
   :name "nodes"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/transitive-dependencies",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node]),
   :doc
   "Returns the set of all things which node depends on, directly or\ntransitively.",
   :name "transitive-dependencies"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/transitive-dependents",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node]),
   :doc
   "Returns the set of all things which depend upon node, directly or\ntransitively.",
   :name "transitive-dependents"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/depend",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node dep]),
   :doc
   "Returns a new graph with a dependency from node to dep (\"node depends\non dep\"). Forbids circular dependencies.",
   :name "depend"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/remove-all",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node]),
   :doc
   "Returns a new dependency graph with all references to node removed.",
   :name "remove-all"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/remove-edge",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node dep]),
   :doc
   "Returns a new graph with the dependency from node to dep removed.",
   :name "remove-edge"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/remove-node",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node]),
   :doc
   "Removes the node from the dependency graph without removing it as a\ndependency of other nodes. That is, removes all outgoing edges from\nnode.",
   :name "remove-node"}
  {:arglists ([tracker & dirs]),
   :name "scan",
   :namespace "clojure.tools.namespace.dir",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dir.clj#L50",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dir.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dir/scan",
   :doc
   "Scans directories for files which have changed since the last time\n'scan' was run; update the dependency tracker with\nnew/changed/deleted files.\n\nIf no dirs given, defaults to all directories on the classpath.",
   :var-type "function",
   :line 50,
   :file "src/main/clojure/clojure/tools/namespace/dir.clj"}
  {:arglists ([tracker & dirs]),
   :name "scan-all",
   :namespace "clojure.tools.namespace.dir",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dir.clj#L65",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/dir.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dir/scan-all",
   :doc
   "Scans directories for all Clojure source files and updates the\ndependency tracker to reload files. If no dirs given, defaults to\nall directories on the classpath.",
   :var-type "function",
   :line 65,
   :file "src/main/clojure/clojure/tools/namespace/dir.clj"}
  {:arglists ([tracker files]),
   :name "add-files",
   :namespace "clojure.tools.namespace.file",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/file.clj#L45",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/file.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/add-files",
   :doc
   "Reads ns declarations from files; returns an updated dependency\ntracker with those files added.",
   :var-type "function",
   :line 45,
   :file "src/main/clojure/clojure/tools/namespace/file.clj"}
  {:arglists ([file]),
   :name "clojure-file?",
   :namespace "clojure.tools.namespace.file",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/file.clj#L25",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/file.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/clojure-file?",
   :doc
   "Returns true if the java.io.File represents a normal Clojure source\nfile.",
   :var-type "function",
   :line 25,
   :file "src/main/clojure/clojure/tools/namespace/file.clj"}
  {:arglists ([file]),
   :name "read-file-ns-decl",
   :namespace "clojure.tools.namespace.file",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/file.clj#L17",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/file.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/read-file-ns-decl",
   :doc
   "Attempts to read a (ns ...) declaration from file, and returns the\nunevaluated form.  Returns nil if read fails, or if the first form\nis not a ns declaration.",
   :var-type "function",
   :line 17,
   :file "src/main/clojure/clojure/tools/namespace/file.clj"}
  {:arglists ([tracker files]),
   :name "remove-files",
   :namespace "clojure.tools.namespace.file",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/file.clj#L54",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ada4479c4a22daf0410ca51fac0c09a26ab8e9ae/src/main/clojure/clojure/tools/namespace/file.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/remove-files",
   :doc
   "Returns an updated dependency tracker with files removed. The files\nmust have been previously added with add-files.",
   :var-type "function",
   :line 54,
   :file "src/main/clojure/clojure/tools/namespace/file.clj"}
  {:arglists ([jar-file]),
   :name "clojure-sources-in-jar",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj#L77",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/clojure-sources-in-jar",
   :doc
   "Returns a sequence of filenames ending in .clj found in the JAR file.",
   :var-type "function",
   :line 77,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([dir]),
   :name "find-clojure-sources-in-dir",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj#L55",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-clojure-sources-in-dir",
   :doc
   "Searches recursively under dir for Clojure source files (.clj).\nReturns a sequence of File objects, in breadth-first sort order.",
   :var-type "function",
   :line 55,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([files]),
   :name "find-namespaces",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj#L120",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-namespaces",
   :doc
   "Searches a sequence of java.io.File objects (both directories and\nJAR files) for .clj source files containing (ns...) declarations.\nReturns a sequence of the symbol names of the declared\nnamespaces. Use with clojure.java.classpath to search Clojure's\nclasspath.",
   :var-type "function",
   :line 120,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([dir]),
   :name "find-namespaces-in-dir",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj#L69",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-namespaces-in-dir",
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the symbol names of the declared namespaces.",
   :var-type "function",
   :line 69,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([jarfile]),
   :name "find-namespaces-in-jarfile",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj#L100",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-namespaces-in-jarfile",
   :doc
   "Searches the JAR file for Clojure source files containing (ns ...)\ndeclarations.  Returns a sequence of the symbol names of the\ndeclared namespaces.",
   :var-type "function",
   :line 100,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([files]),
   :name "find-ns-decls",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj#L110",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-ns-decls",
   :doc
   "Searches a sequence of java.io.File objects (both directories and\nJAR files) for .clj source files containing (ns...) declarations.\nReturns a sequence of the unevaluated ns declaration forms. Use with\nclojure.java.classpath to search Clojure's classpath.",
   :var-type "function",
   :line 110,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([dir]),
   :name "find-ns-decls-in-dir",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj#L63",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-ns-decls-in-dir",
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the unevaluated ns declarations.",
   :var-type "function",
   :line 63,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([jarfile]),
   :name "find-ns-decls-in-jarfile",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj#L92",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-ns-decls-in-jarfile",
   :doc
   "Searches the JAR file for Clojure source files containing (ns ...)\ndeclarations; returns the unevaluated ns declarations.",
   :var-type "function",
   :line 92,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([jarfile entry-name]),
   :name "read-ns-decl-from-jarfile-entry",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj#L82",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/708cbf7d75e955b39a86bf615f8e348673ed0213/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/read-ns-decl-from-jarfile-entry",
   :doc
   "Attempts to read a (ns ...) declaration from the named entry in the\nJAR file, and returns the unevaluated form.  Returns nil if the read\nfails, or if the first form is not a ns declaration.",
   :var-type "function",
   :line 82,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([old-sym new-sym source-path dirs]),
   :name "move-ns",
   :namespace "clojure.tools.namespace.move",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ca860fc9a8d760970e249ecd105b6b16e127b5c1/src/main/clojure/clojure/tools/namespace/move.clj#L82",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ca860fc9a8d760970e249ecd105b6b16e127b5c1/src/main/clojure/clojure/tools/namespace/move.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.move/move-ns",
   :doc
   "ALPHA: subject to change. Moves the .clj source file (found relative\nto source-path) for the namespace named old-sym to new-sym and\nreplace all occurances of the old name with the new name in all\nClojure source files found in dirs.\n\nWARNING: This function modifies and deletes your source files! Make\nsure you have a backup or version control.",
   :var-type "function",
   :line 82,
   :file "src/main/clojure/clojure/tools/namespace/move.clj"}
  {:arglists ([old-sym new-sym source-path]),
   :name "move-ns-file",
   :namespace "clojure.tools.namespace.move",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ca860fc9a8d760970e249ecd105b6b16e127b5c1/src/main/clojure/clojure/tools/namespace/move.clj#L64",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ca860fc9a8d760970e249ecd105b6b16e127b5c1/src/main/clojure/clojure/tools/namespace/move.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.move/move-ns-file",
   :doc
   "ALPHA: subject to change. Moves the .clj source file (found relative\nto source-path) for the namespace named old-sym to a file for a\nnamespace named new-sym.\n\nWARNING: This function moves and deletes your source files! Make\nsure you have a backup or version control.",
   :var-type "function",
   :line 64,
   :file "src/main/clojure/clojure/tools/namespace/move.clj"}
  {:arglists ([source old-sym new-sym]),
   :name "replace-ns-symbol",
   :namespace "clojure.tools.namespace.move",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/ca860fc9a8d760970e249ecd105b6b16e127b5c1/src/main/clojure/clojure/tools/namespace/move.clj#L50",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/ca860fc9a8d760970e249ecd105b6b16e127b5c1/src/main/clojure/clojure/tools/namespace/move.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.move/replace-ns-symbol",
   :doc
   "ALPHA: subject to change. Given Clojure source as a string, replaces\nall occurances of the namespace name old-sym with new-sym and\nreturns modified source as a string.",
   :var-type "function",
   :line 50,
   :file "src/main/clojure/clojure/tools/namespace/move.clj"}
  {:arglists ([form]),
   :name "comment?",
   :namespace "clojure.tools.namespace.parse",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/4850d4aa3b5b4c990be0958065dcf6b94bb55004/src/main/clojure/clojure/tools/namespace/parse.clj#L15",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/4850d4aa3b5b4c990be0958065dcf6b94bb55004/src/main/clojure/clojure/tools/namespace/parse.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/comment?",
   :doc "Returns true if form is a (comment ...)",
   :var-type "function",
   :line 15,
   :file "src/main/clojure/clojure/tools/namespace/parse.clj"}
  {:arglists ([decl]),
   :name "deps-from-ns-decl",
   :namespace "clojure.tools.namespace.parse",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/4850d4aa3b5b4c990be0958065dcf6b94bb55004/src/main/clojure/clojure/tools/namespace/parse.clj#L65",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/4850d4aa3b5b4c990be0958065dcf6b94bb55004/src/main/clojure/clojure/tools/namespace/parse.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/deps-from-ns-decl",
   :doc
   "Given an (ns...) declaration form (unevaluated), returns a set of\nsymbols naming the dependencies of that namespace.  Handles :use and\n:require clauses but not :load.",
   :var-type "function",
   :line 65,
   :file "src/main/clojure/clojure/tools/namespace/parse.clj"}
  {:arglists ([form]),
   :name "ns-decl?",
   :namespace "clojure.tools.namespace.parse",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/4850d4aa3b5b4c990be0958065dcf6b94bb55004/src/main/clojure/clojure/tools/namespace/parse.clj#L20",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/4850d4aa3b5b4c990be0958065dcf6b94bb55004/src/main/clojure/clojure/tools/namespace/parse.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/ns-decl?",
   :doc "Returns true if form is a (ns ...) declaration.",
   :var-type "function",
   :line 20,
   :file "src/main/clojure/clojure/tools/namespace/parse.clj"}
  {:arglists ([rdr]),
   :name "read-ns-decl",
   :namespace "clojure.tools.namespace.parse",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/4850d4aa3b5b4c990be0958065dcf6b94bb55004/src/main/clojure/clojure/tools/namespace/parse.clj#L25",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/4850d4aa3b5b4c990be0958065dcf6b94bb55004/src/main/clojure/clojure/tools/namespace/parse.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/read-ns-decl",
   :doc
   "Attempts to read a (ns ...) declaration from a\njava.io.PushbackReader, and returns the unevaluated form. Returns\nnil if read fails or if a ns declaration cannot be found. The ns\ndeclaration must be the first Clojure form in the file, except for\n(comment ...) forms.",
   :var-type "function",
   :line 25,
   :file "src/main/clojure/clojure/tools/namespace/parse.clj"}
  {:arglists ([lib]),
   :name "remove-lib",
   :namespace "clojure.tools.namespace.reload",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/f192aadc659c0685522ae508a3038e704d7ae10d/src/main/clojure/clojure/tools/namespace/reload.clj#L15",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/f192aadc659c0685522ae508a3038e704d7ae10d/src/main/clojure/clojure/tools/namespace/reload.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.reload/remove-lib",
   :doc
   "Remove lib's namespace and remove lib from the set of loaded libs.",
   :var-type "function",
   :line 15,
   :file "src/main/clojure/clojure/tools/namespace/reload.clj"}
  {:arglists ([tracker]),
   :name "track-reload",
   :namespace "clojure.tools.namespace.reload",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/f192aadc659c0685522ae508a3038e704d7ae10d/src/main/clojure/clojure/tools/namespace/reload.clj#L43",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/f192aadc659c0685522ae508a3038e704d7ae10d/src/main/clojure/clojure/tools/namespace/reload.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.reload/track-reload",
   :doc
   "Executes all pending unload/reload operations on dependency tracker\nuntil either an error is encountered or there are no more pending\noperations.",
   :var-type "function",
   :line 43,
   :file "src/main/clojure/clojure/tools/namespace/reload.clj"}
  {:arglists ([tracker]),
   :name "track-reload-one",
   :namespace "clojure.tools.namespace.reload",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/f192aadc659c0685522ae508a3038e704d7ae10d/src/main/clojure/clojure/tools/namespace/reload.clj#L21",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/f192aadc659c0685522ae508a3038e704d7ae10d/src/main/clojure/clojure/tools/namespace/reload.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.reload/track-reload-one",
   :doc
   "Executes the next pending unload/reload operation in the dependency\ntracker. Returns the updated dependency tracker. If reloading caused\nan error, it is captured as ::error and the namespace which caused\nthe error is ::error-ns.",
   :var-type "function",
   :line 21,
   :file "src/main/clojure/clojure/tools/namespace/reload.clj"}
  {:arglists ([] [namespace]),
   :name "disable-reload!",
   :namespace "clojure.tools.namespace.repl",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/37dae6b34983d513d7b7489e58b94c18f1da2fbb/src/main/clojure/clojure/tools/namespace/repl.clj#L117",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/37dae6b34983d513d7b7489e58b94c18f1da2fbb/src/main/clojure/clojure/tools/namespace/repl.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/disable-reload!",
   :doc
   "Adds metadata to namespace (or *ns* if unspecified) telling\n'refresh' not to load it. Implies disable-unload! also.\n\nWarning: Aliases to reloaded namespaces will break.",
   :var-type "function",
   :line 117,
   :file "src/main/clojure/clojure/tools/namespace/repl.clj"}
  {:arglists ([] [namespace]),
   :name "disable-unload!",
   :namespace "clojure.tools.namespace.repl",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/37dae6b34983d513d7b7489e58b94c18f1da2fbb/src/main/clojure/clojure/tools/namespace/repl.clj#L108",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/37dae6b34983d513d7b7489e58b94c18f1da2fbb/src/main/clojure/clojure/tools/namespace/repl.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/disable-unload!",
   :doc
   "Adds metadata to namespace (or *ns* if unspecified) telling\n'refresh' not to unload it. The namespace may still be reloaded, it\njust won't be removed first.\n\nWarning: Aliases to reloaded namespaces will break.",
   :var-type "function",
   :line 108,
   :file "src/main/clojure/clojure/tools/namespace/repl.clj"}
  {:arglists ([& options]),
   :name "refresh",
   :namespace "clojure.tools.namespace.repl",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/37dae6b34983d513d7b7489e58b94c18f1da2fbb/src/main/clojure/clojure/tools/namespace/repl.clj#L125",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/37dae6b34983d513d7b7489e58b94c18f1da2fbb/src/main/clojure/clojure/tools/namespace/repl.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/refresh",
   :doc
   "Scans source code directories for files which have changed (since\nthe last time this function was run) and reloads them in dependency\norder. Returns :ok or an error; sets the latest exception to\nclojure.core/*e (if *e is thread-bound).\n\nThe directories to be scanned are controlled by 'set-refresh-dirs';\ndefaults to all directories on the Java classpath.\n\nOptions are key-value pairs. Valid options are:\n\n    :after   Namespace-qualified symbol naming a zero-argument\n             function to be invoked after a successful refresh. This\n             symbol will be resolved *after* all namespaces have\n             been reloaded.",
   :var-type "function",
   :line 125,
   :file "src/main/clojure/clojure/tools/namespace/repl.clj"}
  {:arglists ([& options]),
   :name "refresh-all",
   :namespace "clojure.tools.namespace.repl",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/37dae6b34983d513d7b7489e58b94c18f1da2fbb/src/main/clojure/clojure/tools/namespace/repl.clj#L144",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/37dae6b34983d513d7b7489e58b94c18f1da2fbb/src/main/clojure/clojure/tools/namespace/repl.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/refresh-all",
   :doc
   "Scans source code directories for all Clojure source files and\nreloads them in dependency order.\n\nThe directories to be scanned are controlled by 'set-refresh-dirs';\ndefaults to all directories on the Java classpath.\n\nOptions are key-value pairs. Valid options are:\n\n    :after   Namespace-qualified symbol naming a zero-argument\n             function to be invoked after a successful refresh. This\n             symbol will be resolved *after* all namespaces have\n             been reloaded.",
   :var-type "function",
   :line 144,
   :file "src/main/clojure/clojure/tools/namespace/repl.clj"}
  {:arglists ([& dirs]),
   :name "set-refresh-dirs",
   :namespace "clojure.tools.namespace.repl",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/37dae6b34983d513d7b7489e58b94c18f1da2fbb/src/main/clojure/clojure/tools/namespace/repl.clj#L161",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/37dae6b34983d513d7b7489e58b94c18f1da2fbb/src/main/clojure/clojure/tools/namespace/repl.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/set-refresh-dirs",
   :doc
   "Sets the directories which are scanned by 'refresh'. Supports the\nsame types as clojure.java.io/file.",
   :var-type "function",
   :line 161,
   :file "src/main/clojure/clojure/tools/namespace/repl.clj"}
  {:arglists ([tracker depmap]),
   :name "add",
   :namespace "clojure.tools.namespace.track",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/14a2522106979225793e790323a35921410afc07/src/main/clojure/clojure/tools/namespace/track.clj#L40",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/14a2522106979225793e790323a35921410afc07/src/main/clojure/clojure/tools/namespace/track.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.track/add",
   :doc
   "Returns an updated dependency tracker with new/updated namespaces.\n\nDepmap is a map describing the new or modified namespaces. Keys in\nthe map are namespace names (symbols). Values in the map are sets of\nsymbols naming the birect dependencies of each namespace. For\nexample, assuming these ns declarations:\n\n    (ns alpha (:require beta))\n    (ns beta (:require gamma delta))\n\nthe depmap would look like this:\n\n    {alpha #{beta}\n     beta  #{gamma delta}}\n\nAfter adding new/updated namespaces, the dependency tracker will\nhave two lists associated with the following keys:\n\n    :clojure.tools.namespace.track/unload\n        is the list of namespaces that need to be removed\n\n    :clojure.tools.namespace.track/load\n        is the list of namespaces that need to be reloaded\n\nTo reload namespaces in the correct order, first remove/unload all\nnamespaces in the 'unload' list, then (re)load all namespaces in the\n'load' list. The clojure.tools.namespace.reload namespace has\nfunctions to do this.",
   :var-type "function",
   :line 40,
   :file "src/main/clojure/clojure/tools/namespace/track.clj"}
  {:arglists ([tracker names]),
   :name "remove",
   :namespace "clojure.tools.namespace.track",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/14a2522106979225793e790323a35921410afc07/src/main/clojure/clojure/tools/namespace/track.clj#L85",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/14a2522106979225793e790323a35921410afc07/src/main/clojure/clojure/tools/namespace/track.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.track/remove",
   :doc
   "Returns an updated dependency tracker from which the namespaces\n(symbols) have been removed. The ::unload and ::load lists are\npopulated as with 'add'.",
   :var-type "function",
   :line 85,
   :file "src/main/clojure/clojure/tools/namespace/track.clj"}
  {:arglists ([]),
   :name "tracker",
   :namespace "clojure.tools.namespace.track",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/14a2522106979225793e790323a35921410afc07/src/main/clojure/clojure/tools/namespace/track.clj#L108",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/14a2522106979225793e790323a35921410afc07/src/main/clojure/clojure/tools/namespace/track.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.track/tracker",
   :doc "Returns a new, empty dependency tracker",
   :var-type "function",
   :line 108,
   :file "src/main/clojure/clojure/tools/namespace/track.clj"})}

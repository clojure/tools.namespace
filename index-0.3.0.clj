{:namespaces
 ({:doc
   "This namespace is DEPRECATED; most functions have been moved to\nother namespaces",
   :author "Stuart Sierra",
   :name "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace-api.html",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj"}
  {:doc "Bidirectional graphs of dependencies and dependent objects.",
   :author "Stuart Sierra",
   :name "clojure.tools.namespace.dependency",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.dependency-api.html",
   :source-url nil}
  {:doc
   "Track namespace dependencies and changes by monitoring\nfile-modification timestamps",
   :author "Stuart Sierra",
   :name "clojure.tools.namespace.dir",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.dir-api.html",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj"}
  {:doc "Read and track namespace information from files",
   :author "Stuart Sierra",
   :name "clojure.tools.namespace.file",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.file-api.html",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj"}
  {:doc
   "Search for namespace declarations in directories and JAR files.",
   :author "Stuart Sierra",
   :name "clojure.tools.namespace.find",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.find-api.html",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj"}
  {:doc
   "Refactoring tool to move a Clojure namespace from one name/file to\nanother, and update all references to that namespace in your other\nClojure source files.\n\nWARNING: This code is ALPHA and subject to change. It also modifies\nand deletes your source files! Make sure you have a backup or\nversion control.",
   :author "Stuart Sierra",
   :name "clojure.tools.namespace.move",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.move-api.html",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/09e1e1fd81faed4e24399bf68bf78e87b32eb68b/src/main/clojure/clojure/tools/namespace/move.clj"}
  {:doc
   "Parse Clojure namespace (ns) declarations and extract\ndependencies.",
   :author "Stuart Sierra",
   :name "clojure.tools.namespace.parse",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.parse-api.html",
   :source-url nil}
  {:doc
   "Force reloading namespaces on demand or through a\ndependency tracker",
   :author "Stuart Sierra",
   :name "clojure.tools.namespace.reload",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.reload-api.html",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/27194f2edfe3f5f9e1343f993beca4b43f0bafe8/src/main/clojure/clojure/tools/namespace/reload.clj"}
  {:doc "REPL utilities for working with namespaces",
   :author "Stuart Sierra",
   :name "clojure.tools.namespace.repl",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.repl-api.html",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj"}
  {:doc
   "Dependency tracker which can compute which namespaces need to be\nreloaded after files have changed. This is the low-level\nimplementation that requires you to find the namespace dependencies\nyourself: most uses will interact with the wrappers in\nclojure.tools.namespace.file and clojure.tools.namespace.dir or the\npublic API in clojure.tools.namespace.repl.",
   :author "Stuart Sierra",
   :name "clojure.tools.namespace.track",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.track-api.html",
   :source-url nil}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :added "0.1.0",
   :name "clojure-source-file?",
   :file "src/main/clojure/clojure/tools/namespace.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L24",
   :line 24,
   :deprecated "0.2.1",
   :var-type "function",
   :arglists ([file]),
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.file\n\nReturns true if file is a normal file with a .clj or .cljc extension.",
   :namespace "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/clojure-source-file?"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :added "0.1.0",
   :name "clojure-sources-in-jar",
   :file "src/main/clojure/clojure/tools/namespace.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L154",
   :line 154,
   :deprecated "0.2.1",
   :var-type "function",
   :arglists ([jar-file]),
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nReturns a sequence of filenames ending in .clj or .cljc found in the JAR file.",
   :namespace "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/clojure-sources-in-jar"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :added "0.1.0",
   :name "comment?",
   :file "src/main/clojure/clojure/tools/namespace.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L48",
   :line 48,
   :deprecated "0.2.1",
   :var-type "function",
   :arglists ([form]),
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.parse\n\nReturns true if form is a (comment ...)",
   :namespace "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/comment?"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :added "0.1.0",
   :name "find-clojure-sources-in-dir",
   :file "src/main/clojure/clojure/tools/namespace.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L36",
   :line 36,
   :deprecated "0.2.1",
   :var-type "function",
   :arglists ([dir]),
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches recursively under dir for Clojure source files (.clj, .cljc).\nReturns a sequence of File objects, in breadth-first sort order.",
   :namespace "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-clojure-sources-in-dir"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :added "0.1.0",
   :name "find-namespaces-in-dir",
   :file "src/main/clojure/clojure/tools/namespace.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L106",
   :line 106,
   :deprecated "0.2.1",
   :var-type "function",
   :arglists ([dir]),
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the symbol names of the declared namespaces.",
   :namespace "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-in-dir"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :added "0.1.0",
   :name "find-namespaces-in-jarfile",
   :file "src/main/clojure/clojure/tools/namespace.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L191",
   :line 191,
   :deprecated "0.2.1",
   :var-type "function",
   :arglists ([jarfile]),
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches the JAR file for Clojure source files containing (ns ...)\ndeclarations.  Returns a sequence of the symbol names of the\ndeclared namespaces.",
   :namespace "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-in-jarfile"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :added "0.1.0",
   :name "find-namespaces-on-classpath",
   :file "src/main/clojure/clojure/tools/namespace.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L219",
   :line 219,
   :deprecated "0.2.1",
   :var-type "function",
   :arglists ([]),
   :doc
   "DEPRECATED; use clojure.tools.namespace.find/find-namespaces\nand clojure.java.classpath/classpath from\nhttp://github.com/clojure/java.classpath\n\nSearches CLASSPATH (both directories and JAR files) for Clojure\nsource files containing (ns ...) declarations.  Returns a sequence\nof the symbol names of the declared namespaces.",
   :namespace "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-on-classpath"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :added "0.1.0",
   :name "find-ns-decls-in-dir",
   :file "src/main/clojure/clojure/tools/namespace.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L96",
   :line 96,
   :deprecated "0.2.1",
   :var-type "function",
   :arglists ([dir]),
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the unevaluated ns declarations.",
   :namespace "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-in-dir"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :added "0.1.0",
   :name "find-ns-decls-in-jarfile",
   :file "src/main/clojure/clojure/tools/namespace.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L179",
   :line 179,
   :deprecated "0.2.1",
   :var-type "function",
   :arglists ([jarfile]),
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches the JAR file for Clojure source files containing (ns ...)\ndeclarations; returns the unevaluated ns declarations.",
   :namespace "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-in-jarfile"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :added "0.1.0",
   :name "find-ns-decls-on-classpath",
   :file "src/main/clojure/clojure/tools/namespace.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L204",
   :line 204,
   :deprecated "0.2.1",
   :var-type "function",
   :arglists ([]),
   :doc
   "DEPRECATED; use clojure.tools.namespace.find/find-ns-decls\nand clojure.java.classpath/classpath from\nhttp://github.com/clojure/java.classpath\n\nSearches CLASSPATH (both directories and JAR files) for Clojure\nsource files containing (ns ...) declarations. Returns a sequence of\nthe unevaluated ns declaration forms.",
   :namespace "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-on-classpath"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :added "0.1.0",
   :name "ns-decl?",
   :file "src/main/clojure/clojure/tools/namespace.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L57",
   :line 57,
   :deprecated "0.2.1",
   :var-type "function",
   :arglists ([form]),
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.parse\n\nReturns true if form is a (ns ...) declaration.",
   :namespace "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/ns-decl?"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :added "0.1.0",
   :name "read-file-ns-decl",
   :file "src/main/clojure/clojure/tools/namespace.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L84",
   :line 84,
   :deprecated "0.2.1",
   :var-type "function",
   :arglists ([file]),
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.file\n\nAttempts to read a (ns ...) declaration from file, and returns the\nunevaluated form.  Returns nil if read fails, or if the first form\nis not a ns declaration.",
   :namespace "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-file-ns-decl"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :added "0.1.0",
   :name "read-ns-decl",
   :file "src/main/clojure/clojure/tools/namespace.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L66",
   :line 66,
   :deprecated "0.2.1",
   :var-type "function",
   :arglists ([rdr]),
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.parse\n\nAttempts to read a (ns ...) declaration from rdr, and returns the\nunevaluated form.  Returns nil if read fails or if a ns declaration\ncannot be found.  The ns declaration must be the first Clojure form\nin the file, except for (comment ...)  forms.",
   :namespace "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-ns-decl"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :added "0.1.0",
   :name "read-ns-decl-from-jarfile-entry",
   :file "src/main/clojure/clojure/tools/namespace.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L164",
   :line 164,
   :deprecated "0.2.1",
   :var-type "function",
   :arglists ([jarfile entry-name]),
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nAttempts to read a (ns ...) declaration from the named entry in the\nJAR file, and returns the unevaluated form.  Returns nil if the read\nfails, or if the first form is not a ns declaration.",
   :namespace "clojure.tools.namespace",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-ns-decl-from-jarfile-entry"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :name "->MapDependencyGraph",
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L69",
   :line 69,
   :var-type "function",
   :arglists ([dependencies dependents]),
   :doc
   "Positional factory function for class clojure.tools.namespace.dependency.MapDependencyGraph.",
   :namespace "clojure.tools.namespace.dependency",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/->MapDependencyGraph"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :name "dependent?",
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L118",
   :line 118,
   :var-type "function",
   :arglists ([graph x y]),
   :doc "True if y is a dependent of x.",
   :namespace "clojure.tools.namespace.dependency",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/dependent?"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :name "depends?",
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L113",
   :line 113,
   :var-type "function",
   :arglists ([graph x y]),
   :doc "True if x is directly or transitively dependent on y.",
   :namespace "clojure.tools.namespace.dependency",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/depends?"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :name "graph",
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L110",
   :line 110,
   :var-type "function",
   :arglists ([]),
   :doc "Returns a new, empty, dependency graph.",
   :namespace "clojure.tools.namespace.dependency",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/graph"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :name "map->MapDependencyGraph",
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L69",
   :line 69,
   :var-type "function",
   :arglists ([m#]),
   :doc
   "Factory function for class clojure.tools.namespace.dependency.MapDependencyGraph, taking a map of keywords to field values.",
   :namespace "clojure.tools.namespace.dependency",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/map->MapDependencyGraph"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :name "topo-comparator",
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L152",
   :line 152,
   :var-type "function",
   :arglists ([graph]),
   :doc
   "Returns a comparator fn which produces a topological sort based on\nthe dependencies in graph. Nodes not present in the graph will sort\nafter nodes in the graph.",
   :namespace "clojure.tools.namespace.dependency",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/topo-comparator"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :name "topo-sort",
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L123",
   :line 123,
   :var-type "function",
   :arglists ([graph]),
   :doc "Returns a topologically-sorted list of nodes in graph.",
   :namespace "clojure.tools.namespace.dependency",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/topo-sort"}
  {:name "MapDependencyGraph",
   :var-type "record",
   :namespace "clojure.tools.namespace.dependency",
   :arglists nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/MapDependencyGraph",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :name "DependencyGraph",
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L14",
   :line 14,
   :var-type "protocol",
   :arglists nil,
   :doc nil,
   :namespace "clojure.tools.namespace.dependency",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/DependencyGraph"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :name "DependencyGraphUpdate",
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L34",
   :line 34,
   :var-type "protocol",
   :arglists nil,
   :doc nil,
   :namespace "clojure.tools.namespace.dependency",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/DependencyGraphUpdate"}
  {:name "immediate-dependencies",
   :doc "Returns the set of immediate dependencies of node.",
   :var-type "function",
   :namespace "clojure.tools.namespace.dependency",
   :arglists ([graph node]),
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/immediate-dependencies",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "immediate-dependents",
   :doc "Returns the set of immediate dependents of node.",
   :var-type "function",
   :namespace "clojure.tools.namespace.dependency",
   :arglists ([graph node]),
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/immediate-dependents",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "nodes",
   :doc "Returns the set of all nodes in graph.",
   :var-type "function",
   :namespace "clojure.tools.namespace.dependency",
   :arglists ([graph]),
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/nodes",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "transitive-dependencies",
   :doc
   "Returns the set of all things which node depends on, directly or\ntransitively.",
   :var-type "function",
   :namespace "clojure.tools.namespace.dependency",
   :arglists ([graph node]),
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/transitive-dependencies",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "transitive-dependencies-set",
   :doc
   "Returns the set of all things which any node in node-set depends\non, directly or transitively.",
   :var-type "function",
   :namespace "clojure.tools.namespace.dependency",
   :arglists ([graph node-set]),
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/transitive-dependencies-set",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "transitive-dependents",
   :doc
   "Returns the set of all things which depend upon node, directly or\ntransitively.",
   :var-type "function",
   :namespace "clojure.tools.namespace.dependency",
   :arglists ([graph node]),
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/transitive-dependents",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "transitive-dependents-set",
   :doc
   "Returns the set of all things which depend upon any node in\nnode-set, directly or transitively.",
   :var-type "function",
   :namespace "clojure.tools.namespace.dependency",
   :arglists ([graph node-set]),
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/transitive-dependents-set",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "depend",
   :doc
   "Returns a new graph with a dependency from node to dep (\"node depends\non dep\"). Forbids circular dependencies.",
   :var-type "function",
   :namespace "clojure.tools.namespace.dependency",
   :arglists ([graph node dep]),
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/depend",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "remove-all",
   :doc
   "Returns a new dependency graph with all references to node removed.",
   :var-type "function",
   :namespace "clojure.tools.namespace.dependency",
   :arglists ([graph node]),
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/remove-all",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "remove-edge",
   :doc
   "Returns a new graph with the dependency from node to dep removed.",
   :var-type "function",
   :namespace "clojure.tools.namespace.dependency",
   :arglists ([graph node dep]),
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/remove-edge",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "remove-node",
   :doc
   "Removes the node from the dependency graph without removing it as a\ndependency of other nodes. That is, removes all outgoing edges from\nnode.",
   :var-type "function",
   :namespace "clojure.tools.namespace.dependency",
   :arglists ([graph node]),
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/remove-node",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj",
   :added "0.2.0",
   :name "scan",
   :file "src/main/clojure/clojure/tools/namespace/dir.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj#L92",
   :line 92,
   :deprecated "0.3.0",
   :var-type "function",
   :arglists ([tracker & dirs]),
   :doc
   "DEPRECATED: replaced by scan-dirs.\n\nScans directories for Clojure (.clj, .cljc) source files which have\nchanged since the last time 'scan' was run; update the dependency\ntracker with new/changed/deleted files.\n\nIf no dirs given, defaults to all directories on the classpath.",
   :namespace "clojure.tools.namespace.dir",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dir/scan"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj",
   :added "0.2.0",
   :name "scan-all",
   :file "src/main/clojure/clojure/tools/namespace/dir.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj#L105",
   :line 105,
   :deprecated "0.3.0",
   :var-type "function",
   :arglists ([tracker & dirs]),
   :doc
   "DEPRECATED: replaced by scan-dirs.\n\nScans directories for all Clojure source files and updates the\ndependency tracker to reload files. If no dirs given, defaults to\nall directories on the classpath.",
   :namespace "clojure.tools.namespace.dir",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dir/scan-all"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj",
   :added "0.3.0",
   :name "scan-dirs",
   :file "src/main/clojure/clojure/tools/namespace/dir.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj#L69",
   :line 69,
   :var-type "function",
   :arglists
   ([tracker]
    [tracker dirs]
    [tracker dirs {:keys [platform add-all?], :as options}]),
   :doc
   "Scans directories for files which have changed since the last time\n'scan-dirs' or 'scan-files' was run; updates the dependency tracker\nwith new/changed/deleted files.\n\ndirs is the collection of directories to scan, defaults to all\ndirectories on Clojure's classpath.\n\nOptional third argument is map of options:\n\n  :platform  Either clj (default) or cljs, both defined in \n             clojure.tools.namespace.find, controls file extensions \n             and reader options.\n\n  :add-all?  If true, assumes all extant files are modified regardless\n             of filesystem timestamps.",
   :namespace "clojure.tools.namespace.dir",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dir/scan-dirs"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj",
   :added "0.3.0",
   :name "scan-files",
   :file "src/main/clojure/clojure/tools/namespace/dir.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj#L43",
   :line 43,
   :var-type "function",
   :arglists
   ([tracker files] [tracker files {:keys [platform add-all?]}]),
   :doc
   "Scans files to find those which have changed since the last time\n'scan-files' was run; updates the dependency tracker with\nnew/changed/deleted files.\n\nfiles is the collection of files to scan.\n\nOptional third argument is map of options:\n\n  :platform  Either clj (default) or cljs, both defined in\n             clojure.tools.namespace.find, controls reader options for \n             parsing files.\n\n  :add-all?  If true, assumes all extant files are modified regardless\n             of filesystem timestamps.",
   :namespace "clojure.tools.namespace.dir",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dir/scan-files"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj",
   :name "add-files",
   :file "src/main/clojure/clojure/tools/namespace/file.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj#L76",
   :line 76,
   :var-type "function",
   :arglists ([tracker files] [tracker files read-opts]),
   :doc
   "Reads ns declarations from files; returns an updated dependency\ntracker with those files added. read-opts is passed through to\ntools.reader.",
   :namespace "clojure.tools.namespace.file",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/add-files"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj",
   :added "0.3.0",
   :name "clojure-extensions",
   :file "src/main/clojure/clojure/tools/namespace/file.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj#L38",
   :line 38,
   :var-type "var",
   :arglists nil,
   :doc "File extensions for Clojure (JVM) files.",
   :namespace "clojure.tools.namespace.file",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/clojure-extensions"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj",
   :name "clojure-file?",
   :file "src/main/clojure/clojure/tools/namespace/file.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj#L48",
   :line 48,
   :var-type "function",
   :arglists ([file]),
   :doc
   "Returns true if the java.io.File represents a file which will be\nread by the Clojure (JVM) compiler.",
   :namespace "clojure.tools.namespace.file",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/clojure-file?"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj",
   :added "0.3.0",
   :name "clojurescript-extensions",
   :file "src/main/clojure/clojure/tools/namespace/file.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj#L43",
   :line 43,
   :var-type "var",
   :arglists nil,
   :doc "File extensions for ClojureScript files.",
   :namespace "clojure.tools.namespace.file",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/clojurescript-extensions"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj",
   :added "0.3.0",
   :name "clojurescript-file?",
   :file "src/main/clojure/clojure/tools/namespace/file.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj#L54",
   :line 54,
   :var-type "function",
   :arglists ([file]),
   :doc
   "Returns true if the java.io.File represents a file which will be\nread by the ClojureScript compiler.",
   :namespace "clojure.tools.namespace.file",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/clojurescript-file?"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj",
   :added "0.3.0",
   :name "file-with-extension?",
   :file "src/main/clojure/clojure/tools/namespace/file.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj#L29",
   :line 29,
   :var-type "function",
   :arglists ([file extensions]),
   :doc
   "Returns true if the java.io.File represents a file whose name ends\nwith one of the Strings in extensions.",
   :namespace "clojure.tools.namespace.file",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/file-with-extension?"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj",
   :name "read-file-ns-decl",
   :file "src/main/clojure/clojure/tools/namespace/file.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj#L17",
   :line 17,
   :var-type "function",
   :arglists ([file] [file read-opts]),
   :doc
   "Attempts to read a (ns ...) declaration from file, and returns the\nunevaluated form. Returns nil if read fails due to invalid syntax or\nif a ns declaration cannot be found. read-opts is passed through to\ntools.reader/read.",
   :namespace "clojure.tools.namespace.file",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/read-file-ns-decl"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj",
   :name "remove-files",
   :file "src/main/clojure/clojure/tools/namespace/file.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/file.clj#L88",
   :line 88,
   :var-type "function",
   :arglists ([tracker files]),
   :doc
   "Returns an updated dependency tracker with files removed. The files\nmust have been previously added with add-files.",
   :namespace "clojure.tools.namespace.file",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/remove-files"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj",
   :added "0.3.0",
   :name "clj",
   :file "src/main/clojure/clojure/tools/namespace/find.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj#L22",
   :line 22,
   :var-type "var",
   :arglists nil,
   :doc
   "Platform definition of file extensions and reader options for\nClojure (.clj and .cljc) source files.",
   :namespace "clojure.tools.namespace.find",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/clj"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj",
   :added "0.3.0",
   :name "cljs",
   :file "src/main/clojure/clojure/tools/namespace/find.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj#L29",
   :line 29,
   :var-type "var",
   :arglists nil,
   :doc
   "Platform definition of file extensions and reader options for\nClojureScript (.cljs and .cljc) source files.",
   :namespace "clojure.tools.namespace.find",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/cljs"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj",
   :added "0.2.0",
   :name "clojure-sources-in-jar",
   :file "src/main/clojure/clojure/tools/namespace/find.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj#L109",
   :line 109,
   :deprecated "0.3.0",
   :var-type "function",
   :arglists ([jar-file]),
   :doc
   "DEPRECATED: replaced by sources-in-jar\n\nReturns a sequence of filenames ending in .clj or .cljc found in the\nJAR file.",
   :namespace "clojure.tools.namespace.find",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/clojure-sources-in-jar"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj",
   :added "0.2.0",
   :name "find-clojure-sources-in-dir",
   :file "src/main/clojure/clojure/tools/namespace/find.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj#L57",
   :line 57,
   :deprecated "0.3.0",
   :var-type "function",
   :arglists ([dir]),
   :doc
   "DEPRECATED: replaced by find-sources-in-dir\n\nSearches recursively under dir for Clojure source files (.clj, .cljc).\nReturns a sequence of File objects, in breadth-first sort order.",
   :namespace "clojure.tools.namespace.find",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-clojure-sources-in-dir"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj",
   :name "find-namespaces",
   :file "src/main/clojure/clojure/tools/namespace/find.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj#L182",
   :line 182,
   :var-type "function",
   :arglists ([files] [files platform]),
   :doc
   "Searches a sequence of java.io.File objects (both directories and\nJAR files) for platform source files containing (ns...)\ndeclarations. Returns a sequence of the symbol names of the declared\nnamespaces. Use with clojure.java.classpath to search Clojure's\nclasspath.\n\nOptional second argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :namespace "clojure.tools.namespace.find",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-namespaces"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj",
   :added "0.3.0",
   :name "find-namespaces-in-dir",
   :file "src/main/clojure/clojure/tools/namespace/find.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj#L79",
   :line 79,
   :var-type "function",
   :arglists ([dir] [dir platform]),
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the symbol names of the declared namespaces.\n\nOptional second argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :namespace "clojure.tools.namespace.find",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-namespaces-in-dir"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj",
   :name "find-namespaces-in-jarfile",
   :file "src/main/clojure/clojure/tools/namespace/find.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj#L148",
   :line 148,
   :var-type "function",
   :arglists ([jarfile] [jarfile platform]),
   :doc
   "Searches the JAR file for platform source files containing (ns ...)\ndeclarations.  Returns a sequence of the symbol names of the\ndeclared namespaces.\n\nOptional second argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :namespace "clojure.tools.namespace.find",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-namespaces-in-jarfile"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj",
   :name "find-ns-decls",
   :file "src/main/clojure/clojure/tools/namespace/find.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj#L163",
   :line 163,
   :var-type "function",
   :arglists ([files] [files platform]),
   :doc
   "Searches a sequence of java.io.File objects (both directories and\nJAR files) for platform source files containing (ns...)\ndeclarations. Returns a sequence of the unevaluated ns declaration\nforms. Use with clojure.java.classpath to search Clojure's\nclasspath.\n\nOptional second argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :namespace "clojure.tools.namespace.find",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-ns-decls"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj",
   :added "0.2.0",
   :name "find-ns-decls-in-dir",
   :file "src/main/clojure/clojure/tools/namespace/find.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj#L67",
   :line 67,
   :var-type "function",
   :arglists ([dir] [dir platform]),
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the unevaluated ns declarations.\n\nOptional second argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :namespace "clojure.tools.namespace.find",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-ns-decls-in-dir"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj",
   :name "find-ns-decls-in-jarfile",
   :file "src/main/clojure/clojure/tools/namespace/find.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj#L136",
   :line 136,
   :var-type "function",
   :arglists ([jarfile] [jarfile platform]),
   :doc
   "Searches the JAR file for source files containing (ns ...)\ndeclarations; returns the unevaluated ns declarations.\n\nOptional second argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :namespace "clojure.tools.namespace.find",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-ns-decls-in-jarfile"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj",
   :added "0.3.0",
   :name "find-sources-in-dir",
   :file "src/main/clojure/clojure/tools/namespace/find.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj#L42",
   :line 42,
   :var-type "function",
   :arglists ([dir] [dir platform]),
   :doc
   "Searches recursively under dir for source files. Returns a sequence\nof File objects, in breadth-first sort order.\n\nOptional second argument is either clj (default) or cljs, both\ndefined in clojure.tools.namespace.find.",
   :namespace "clojure.tools.namespace.find",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-sources-in-dir"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj",
   :name "read-ns-decl-from-jarfile-entry",
   :file "src/main/clojure/clojure/tools/namespace/find.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj#L119",
   :line 119,
   :var-type "function",
   :arglists ([jarfile entry-name] [jarfile entry-name platform]),
   :doc
   "Attempts to read a (ns ...) declaration from the named entry in the\nJAR file, and returns the unevaluated form. Returns nil if read\nfails due to invalid syntax or if a ns declaration cannot be found.\n\nOptional third argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :namespace "clojure.tools.namespace.find",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/read-ns-decl-from-jarfile-entry"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj",
   :added "0.3.0",
   :name "sources-in-jar",
   :file "src/main/clojure/clojure/tools/namespace/find.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/68510af299aca151cf98705a73d1530f1ff6a736/src/main/clojure/clojure/tools/namespace/find.clj#L96",
   :line 96,
   :var-type "function",
   :arglists ([jar-file] [jar-file platform]),
   :doc
   "Returns a sequence of source file names found in the JAR file.\n\nOptional second argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :namespace "clojure.tools.namespace.find",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/sources-in-jar"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/09e1e1fd81faed4e24399bf68bf78e87b32eb68b/src/main/clojure/clojure/tools/namespace/move.clj",
   :name "move-ns",
   :file "src/main/clojure/clojure/tools/namespace/move.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/09e1e1fd81faed4e24399bf68bf78e87b32eb68b/src/main/clojure/clojure/tools/namespace/move.clj#L86",
   :line 86,
   :var-type "function",
   :arglists ([old-sym new-sym source-path dirs]),
   :doc
   "ALPHA: subject to change. Moves the .clj source file (found relative\nto source-path) for the namespace named old-sym to new-sym and\nreplace all occurrences of the old name with the new name in all\nClojure source files found in dirs.\n\nThis is a purely textual transformation. It does not work on\nnamespaces require'd or use'd from a prefix list.\n\nWARNING: This function modifies and deletes your source files! Make\nsure you have a backup or version control.",
   :namespace "clojure.tools.namespace.move",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.move/move-ns"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/09e1e1fd81faed4e24399bf68bf78e87b32eb68b/src/main/clojure/clojure/tools/namespace/move.clj",
   :name "move-ns-file",
   :file "src/main/clojure/clojure/tools/namespace/move.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/09e1e1fd81faed4e24399bf68bf78e87b32eb68b/src/main/clojure/clojure/tools/namespace/move.clj#L68",
   :line 68,
   :var-type "function",
   :arglists ([old-sym new-sym source-path]),
   :doc
   "ALPHA: subject to change. Moves the .clj source file (found relative\nto source-path) for the namespace named old-sym to a file for a\nnamespace named new-sym.\n\nWARNING: This function moves and deletes your source files! Make\nsure you have a backup or version control.",
   :namespace "clojure.tools.namespace.move",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.move/move-ns-file"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/09e1e1fd81faed4e24399bf68bf78e87b32eb68b/src/main/clojure/clojure/tools/namespace/move.clj",
   :name "replace-ns-symbol",
   :file "src/main/clojure/clojure/tools/namespace/move.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/09e1e1fd81faed4e24399bf68bf78e87b32eb68b/src/main/clojure/clojure/tools/namespace/move.clj#L54",
   :line 54,
   :var-type "function",
   :arglists ([source old-sym new-sym]),
   :doc
   "ALPHA: subject to change. Given Clojure source as a string, replaces\nall occurrences of the namespace name old-sym with new-sym and\nreturns modified source as a string.",
   :namespace "clojure.tools.namespace.move",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.move/replace-ns-symbol"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/5d6957ddb11d74fb54c92d2edccce65e8621a3f7/src/main/clojure/clojure/tools/namespace/parse.cljc",
   :name "clj-read-opts",
   :file "src/main/clojure/clojure/tools/namespace/parse.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/5d6957ddb11d74fb54c92d2edccce65e8621a3f7/src/main/clojure/clojure/tools/namespace/parse.cljc#L27",
   :line 27,
   :var-type "var",
   :arglists nil,
   :doc
   "Map of options for tools.reader/read allowing reader conditionals\nwith the :clj feature enabled.",
   :namespace "clojure.tools.namespace.parse",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/clj-read-opts"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/5d6957ddb11d74fb54c92d2edccce65e8621a3f7/src/main/clojure/clojure/tools/namespace/parse.cljc",
   :name "cljs-read-opts",
   :file "src/main/clojure/clojure/tools/namespace/parse.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/5d6957ddb11d74fb54c92d2edccce65e8621a3f7/src/main/clojure/clojure/tools/namespace/parse.cljc#L33",
   :line 33,
   :var-type "var",
   :arglists nil,
   :doc
   "Map of options for tools.reader/read allowing reader conditionals\nwith the :cljs feature enabled.",
   :namespace "clojure.tools.namespace.parse",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/cljs-read-opts"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/5d6957ddb11d74fb54c92d2edccce65e8621a3f7/src/main/clojure/clojure/tools/namespace/parse.cljc",
   :name "comment?",
   :file "src/main/clojure/clojure/tools/namespace/parse.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/5d6957ddb11d74fb54c92d2edccce65e8621a3f7/src/main/clojure/clojure/tools/namespace/parse.cljc#L17",
   :line 17,
   :var-type "function",
   :arglists ([form]),
   :doc "Returns true if form is a (comment ...)",
   :namespace "clojure.tools.namespace.parse",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/comment?"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/5d6957ddb11d74fb54c92d2edccce65e8621a3f7/src/main/clojure/clojure/tools/namespace/parse.cljc",
   :name "deps-from-ns-decl",
   :file "src/main/clojure/clojure/tools/namespace/parse.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/5d6957ddb11d74fb54c92d2edccce65e8621a3f7/src/main/clojure/clojure/tools/namespace/parse.cljc#L123",
   :line 123,
   :var-type "function",
   :arglists ([decl]),
   :doc
   "Given an (ns...) declaration form (unevaluated), returns a set of\nsymbols naming the dependencies of that namespace.  Handles :use and\n:require clauses but not :load.",
   :namespace "clojure.tools.namespace.parse",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/deps-from-ns-decl"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/5d6957ddb11d74fb54c92d2edccce65e8621a3f7/src/main/clojure/clojure/tools/namespace/parse.cljc",
   :name "name-from-ns-decl",
   :file "src/main/clojure/clojure/tools/namespace/parse.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/5d6957ddb11d74fb54c92d2edccce65e8621a3f7/src/main/clojure/clojure/tools/namespace/parse.cljc#L117",
   :line 117,
   :var-type "function",
   :arglists ([decl]),
   :doc
   "Given an (ns...) declaration form (unevaluated), returns the name\nof the namespace as a symbol.",
   :namespace "clojure.tools.namespace.parse",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/name-from-ns-decl"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/5d6957ddb11d74fb54c92d2edccce65e8621a3f7/src/main/clojure/clojure/tools/namespace/parse.cljc",
   :name "ns-decl?",
   :file "src/main/clojure/clojure/tools/namespace/parse.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/5d6957ddb11d74fb54c92d2edccce65e8621a3f7/src/main/clojure/clojure/tools/namespace/parse.cljc#L22",
   :line 22,
   :var-type "function",
   :arglists ([form]),
   :doc "Returns true if form is a (ns ...) declaration.",
   :namespace "clojure.tools.namespace.parse",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/ns-decl?"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/5d6957ddb11d74fb54c92d2edccce65e8621a3f7/src/main/clojure/clojure/tools/namespace/parse.cljc",
   :name "read-ns-decl",
   :file "src/main/clojure/clojure/tools/namespace/parse.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/5d6957ddb11d74fb54c92d2edccce65e8621a3f7/src/main/clojure/clojure/tools/namespace/parse.cljc#L39",
   :line 39,
   :var-type "function",
   :arglists ([rdr] [rdr read-opts]),
   :doc
   "Attempts to read a (ns ...) declaration from a reader, and returns\nthe unevaluated form. Returns the first top-level ns form found.\nReturns nil if ns declaration cannot be found. Throws exception on\ninvalid syntax.\n\nNote that read can execute code (controlled by\ntools.reader/*read-eval*), and as such should be used only with\ntrusted sources. read-opts is passed through to tools.reader/read,\ndefaults to clj-read-opts",
   :namespace "clojure.tools.namespace.parse",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/read-ns-decl"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/27194f2edfe3f5f9e1343f993beca4b43f0bafe8/src/main/clojure/clojure/tools/namespace/reload.clj",
   :name "remove-lib",
   :file "src/main/clojure/clojure/tools/namespace/reload.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/27194f2edfe3f5f9e1343f993beca4b43f0bafe8/src/main/clojure/clojure/tools/namespace/reload.clj#L15",
   :line 15,
   :var-type "function",
   :arglists ([lib]),
   :doc
   "Remove lib's namespace and remove lib from the set of loaded libs.",
   :namespace "clojure.tools.namespace.reload",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.reload/remove-lib"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/27194f2edfe3f5f9e1343f993beca4b43f0bafe8/src/main/clojure/clojure/tools/namespace/reload.clj",
   :name "track-reload",
   :file "src/main/clojure/clojure/tools/namespace/reload.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/27194f2edfe3f5f9e1343f993beca4b43f0bafe8/src/main/clojure/clojure/tools/namespace/reload.clj#L43",
   :line 43,
   :var-type "function",
   :arglists ([tracker]),
   :doc
   "Executes all pending unload/reload operations on dependency tracker\nuntil either an error is encountered or there are no more pending\noperations.",
   :namespace "clojure.tools.namespace.reload",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.reload/track-reload"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/27194f2edfe3f5f9e1343f993beca4b43f0bafe8/src/main/clojure/clojure/tools/namespace/reload.clj",
   :name "track-reload-one",
   :file "src/main/clojure/clojure/tools/namespace/reload.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/27194f2edfe3f5f9e1343f993beca4b43f0bafe8/src/main/clojure/clojure/tools/namespace/reload.clj#L21",
   :line 21,
   :var-type "function",
   :arglists ([tracker]),
   :doc
   "Executes the next pending unload/reload operation in the dependency\ntracker. Returns the updated dependency tracker. If reloading caused\nan error, it is captured as ::error and the namespace which caused\nthe error is ::error-ns.",
   :namespace "clojure.tools.namespace.reload",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.reload/track-reload-one"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj",
   :name "clear",
   :file "src/main/clojure/clojure/tools/namespace/repl.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj#L170",
   :line 170,
   :var-type "function",
   :arglists ([]),
   :doc
   "Clears all state from the namespace/file tracker. This may help\nrepair the namespace tracker when it gets into an inconsistent\nstate, without restarting the Clojure process. The next call to\n'refresh' will reload all source files, but may not completely\nremove stale code from deleted files.",
   :namespace "clojure.tools.namespace.repl",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/clear"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj",
   :name "disable-reload!",
   :file "src/main/clojure/clojure/tools/namespace/repl.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj#L120",
   :line 120,
   :var-type "function",
   :arglists ([] [namespace]),
   :doc
   "Adds metadata to namespace (or *ns* if unspecified) telling\n'refresh' not to load it. Implies disable-unload! also.\n\nWarning: Aliases to reloaded namespaces will break.",
   :namespace "clojure.tools.namespace.repl",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/disable-reload!"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj",
   :name "disable-unload!",
   :file "src/main/clojure/clojure/tools/namespace/repl.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj#L111",
   :line 111,
   :var-type "function",
   :arglists ([] [namespace]),
   :doc
   "Adds metadata to namespace (or *ns* if unspecified) telling\n'refresh' not to unload it. The namespace may still be reloaded, it\njust won't be removed first.\n\nWarning: Aliases to reloaded namespaces will break.",
   :namespace "clojure.tools.namespace.repl",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/disable-unload!"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj",
   :name "refresh",
   :file "src/main/clojure/clojure/tools/namespace/repl.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj#L128",
   :line 128,
   :var-type "function",
   :arglists ([& options]),
   :doc
   "Scans source code directories for files which have changed (since\nthe last time this function was run) and reloads them in dependency\norder. Returns :ok or an error; sets the latest exception to\nclojure.core/*e (if *e is thread-bound).\n\nThe directories to be scanned are controlled by 'set-refresh-dirs';\ndefaults to all directories on the Java classpath.\n\nOptions are key-value pairs. Valid options are:\n\n    :after   Namespace-qualified symbol naming a zero-argument\n             function to be invoked after a successful refresh. This\n             symbol will be resolved *after* all namespaces have\n             been reloaded.",
   :namespace "clojure.tools.namespace.repl",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/refresh"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj",
   :name "refresh-all",
   :file "src/main/clojure/clojure/tools/namespace/repl.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj#L147",
   :line 147,
   :var-type "function",
   :arglists ([& options]),
   :doc
   "Scans source code directories for all Clojure source files and\nreloads them in dependency order.\n\nThe directories to be scanned are controlled by 'set-refresh-dirs';\ndefaults to all directories on the Java classpath.\n\nOptions are key-value pairs. Valid options are:\n\n    :after   Namespace-qualified symbol naming a zero-argument\n             function to be invoked after a successful refresh. This\n             symbol will be resolved *after* all namespaces have\n             been reloaded.",
   :namespace "clojure.tools.namespace.repl",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/refresh-all"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj",
   :name "set-refresh-dirs",
   :file "src/main/clojure/clojure/tools/namespace/repl.clj",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj#L164",
   :line 164,
   :var-type "function",
   :arglists ([& dirs]),
   :doc
   "Sets the directories which are scanned by 'refresh'. Supports the\nsame types as clojure.java.io/file.",
   :namespace "clojure.tools.namespace.repl",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/set-refresh-dirs"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/e2c8dc5e8fbfdbe9ca24e9ec357dd1885d522c01/src/main/clojure/clojure/tools/namespace/track.cljc",
   :name "add",
   :file "src/main/clojure/clojure/tools/namespace/track.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/e2c8dc5e8fbfdbe9ca24e9ec357dd1885d522c01/src/main/clojure/clojure/tools/namespace/track.cljc#L39",
   :line 39,
   :var-type "function",
   :arglists ([tracker depmap]),
   :doc
   "Returns an updated dependency tracker with new/updated namespaces.\n\nDepmap is a map describing the new or modified namespaces. Keys in\nthe map are namespace names (symbols). Values in the map are sets of\nsymbols naming the direct dependencies of each namespace. For\nexample, assuming these ns declarations:\n\n    (ns alpha (:require beta))\n    (ns beta (:require gamma delta))\n\nthe depmap would look like this:\n\n    {alpha #{beta}\n     beta  #{gamma delta}}\n\nAfter adding new/updated namespaces, the dependency tracker will\nhave two lists associated with the following keys:\n\n    :clojure.tools.namespace.track/unload\n        is the list of namespaces that need to be removed\n\n    :clojure.tools.namespace.track/load\n        is the list of namespaces that need to be reloaded\n\nTo reload namespaces in the correct order, first remove/unload all\nnamespaces in the 'unload' list, then (re)load all namespaces in the\n'load' list. The clojure.tools.namespace.reload namespace has\nfunctions to do this.",
   :namespace "clojure.tools.namespace.track",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.track/add"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/e2c8dc5e8fbfdbe9ca24e9ec357dd1885d522c01/src/main/clojure/clojure/tools/namespace/track.cljc",
   :name "remove",
   :file "src/main/clojure/clojure/tools/namespace/track.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/e2c8dc5e8fbfdbe9ca24e9ec357dd1885d522c01/src/main/clojure/clojure/tools/namespace/track.cljc#L88",
   :line 88,
   :var-type "function",
   :arglists ([tracker names]),
   :doc
   "Returns an updated dependency tracker from which the namespaces\n(symbols) have been removed. The ::unload and ::load lists are\npopulated as with 'add'.",
   :namespace "clojure.tools.namespace.track",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.track/remove"}
  {:raw-source-url
   "https://github.com/clojure/tools.namespace/raw/e2c8dc5e8fbfdbe9ca24e9ec357dd1885d522c01/src/main/clojure/clojure/tools/namespace/track.cljc",
   :name "tracker",
   :file "src/main/clojure/clojure/tools/namespace/track.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/e2c8dc5e8fbfdbe9ca24e9ec357dd1885d522c01/src/main/clojure/clojure/tools/namespace/track.cljc#L111",
   :line 111,
   :var-type "function",
   :arglists ([]),
   :doc "Returns a new, empty dependency tracker",
   :namespace "clojure.tools.namespace.track",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.track/tracker"})}

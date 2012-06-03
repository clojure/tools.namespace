{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.namespace/blob/764958365870c15c67ff73871055431ae3e99fe5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace-api.html",
   :name "clojure.tools.namespace",
   :author "Stuart Sierra",
   :doc "Search for ns declarations in dirs, JARs, or CLASSPATH"}),
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
   :file "src/main/clojure/clojure/tools/namespace.clj"})}

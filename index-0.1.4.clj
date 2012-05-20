{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
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
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L28",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/clojure-source-file?",
   :doc "Returns true if file is a normal file with a .clj extension.",
   :var-type "function",
   :line 28,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jar-file]),
   :name "clojure-sources-in-jar",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L89",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/clojure-sources-in-jar",
   :doc
   "Returns a sequence of filenames ending in .clj found in the JAR file.",
   :var-type "function",
   :line 89,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([form]),
   :name "comment?",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L42",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/comment?",
   :doc "Returns true if form is a (comment ...)",
   :var-type "function",
   :line 42,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([decl]),
   :name "deps-from-ns-decl",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L159",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/deps-from-ns-decl",
   :doc
   "Given a (quoted) ns declaration, returns a set of symbols naming\nthe dependencies of that namespace.  Handles :use and :require\nclauses but not :load.",
   :var-type "function",
   :line 159,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-clojure-sources-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L34",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-clojure-sources-in-dir",
   :doc
   "Searches recursively under dir for Clojure source files (.clj).\nReturns a sequence of File objects, in breadth-first sort order.",
   :var-type "function",
   :line 34,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-namespaces-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L80",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-in-dir",
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the symbol names of the declared namespaces.",
   :var-type "function",
   :line 80,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile]),
   :name "find-namespaces-in-jarfile",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L113",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-in-jarfile",
   :doc
   "Searches the JAR file for Clojure source files containing (ns ...)\ndeclarations.  Returns a sequence of the symbol names of the\ndeclared namespaces.",
   :var-type "function",
   :line 113,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([]),
   :name "find-namespaces-on-classpath",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L132",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-on-classpath",
   :doc
   "Searches CLASSPATH (both directories and JAR files) for Clojure\nsource files containing (ns ...) declarations.  Returns a sequence\nof the symbol names of the declared namespaces.",
   :var-type "function",
   :line 132,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-ns-decls-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L74",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-in-dir",
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the unevaluated ns declarations.",
   :var-type "function",
   :line 74,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile]),
   :name "find-ns-decls-in-jarfile",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L105",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-in-jarfile",
   :doc
   "Searches the JAR file for Clojure source files containing (ns ...)\ndeclarations; returns the unevaluated ns declarations.",
   :var-type "function",
   :line 105,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([]),
   :name "find-ns-decls-on-classpath",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L123",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-on-classpath",
   :doc
   "Searches CLASSPATH (both directories and JAR files) for Clojure\nsource files containing (ns ...) declarations.  Returns a sequence\nof the unevaluated ns declaration forms.",
   :var-type "function",
   :line 123,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([form]),
   :name "ns-decl?",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L47",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/ns-decl?",
   :doc "Returns true if form is a (ns ...) declaration.",
   :var-type "function",
   :line 47,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([file]),
   :name "read-file-ns-decl",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L66",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-file-ns-decl",
   :doc
   "Attempts to read a (ns ...) declaration from file, and returns the\nunevaluated form.  Returns nil if read fails, or if the first form\nis not a ns declaration.",
   :var-type "function",
   :line 66,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([rdr]),
   :name "read-ns-decl",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L52",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-ns-decl",
   :doc
   "Attempts to read a (ns ...) declaration from rdr, and returns the\nunevaluated form.  Returns nil if read fails or if a ns declaration\ncannot be found.  The ns declaration must be the first Clojure form\nin the file, except for (comment ...)  forms.",
   :var-type "function",
   :line 52,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile entry-name]),
   :name "read-ns-decl-from-jarfile-entry",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj#L94",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/81a43a0c70537059cd05ecd6b67a5b67cc2af05d/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-ns-decl-from-jarfile-entry",
   :doc
   "Attempts to read a (ns ...) declaration from the named entry in the\nJAR file, and returns the unevaluated form.  Returns nil if the read\nfails, or if the first form is not a ns declaration.",
   :var-type "function",
   :line 94,
   :file "src/main/clojure/clojure/tools/namespace.clj"})}

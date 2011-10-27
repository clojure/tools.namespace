{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
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
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj#L27",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/clojure-source-file?",
   :doc "Returns true if file is a normal file with a .clj extension.",
   :var-type "function",
   :line 27,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jar-file]),
   :name "clojure-sources-in-jar",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj#L88",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/clojure-sources-in-jar",
   :doc
   "Returns a sequence of filenames ending in .clj found in the JAR file.",
   :var-type "function",
   :line 88,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([form]),
   :name "comment?",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj#L41",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/comment?",
   :doc "Returns true if form is a (comment ...)",
   :var-type "function",
   :line 41,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-clojure-sources-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj#L33",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-clojure-sources-in-dir",
   :doc
   "Searches recursively under dir for Clojure source files (.clj).\nReturns a sequence of File objects, in breadth-first sort order.",
   :var-type "function",
   :line 33,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-namespaces-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj#L79",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-in-dir",
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the symbol names of the declared namespaces.",
   :var-type "function",
   :line 79,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile]),
   :name "find-namespaces-in-jarfile",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj#L112",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-in-jarfile",
   :doc
   "Searches the JAR file for Clojure source files containing (ns ...)\ndeclarations.  Returns a sequence of the symbol names of the\ndeclared namespaces.",
   :var-type "function",
   :line 112,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([]),
   :name "find-namespaces-on-classpath",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj#L131",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-on-classpath",
   :doc
   "Searches CLASSPATH (both directories and JAR files) for Clojure\nsource files containing (ns ...) declarations.  Returns a sequence\nof the symbol names of the declared namespaces.",
   :var-type "function",
   :line 131,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-ns-decls-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj#L73",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-in-dir",
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the unevaluated ns declarations.",
   :var-type "function",
   :line 73,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile]),
   :name "find-ns-decls-in-jarfile",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj#L104",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-in-jarfile",
   :doc
   "Searches the JAR file for Clojure source files containing (ns ...)\ndeclarations; returns the unevaluated ns declarations.",
   :var-type "function",
   :line 104,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([]),
   :name "find-ns-decls-on-classpath",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj#L122",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-on-classpath",
   :doc
   "Searches CLASSPATH (both directories and JAR files) for Clojure\nsource files containing (ns ...) declarations.  Returns a sequence\nof the unevaluated ns declaration forms.",
   :var-type "function",
   :line 122,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([form]),
   :name "ns-decl?",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj#L46",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/ns-decl?",
   :doc "Returns true if form is a (ns ...) declaration.",
   :var-type "function",
   :line 46,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([file]),
   :name "read-file-ns-decl",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj#L65",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-file-ns-decl",
   :doc
   "Attempts to read a (ns ...) declaration from file, and returns the\nunevaluated form.  Returns nil if read fails, or if the first form\nis not a ns declaration.",
   :var-type "function",
   :line 65,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([rdr]),
   :name "read-ns-decl",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj#L51",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-ns-decl",
   :doc
   "Attempts to read a (ns ...) declaration from rdr, and returns the\nunevaluated form.  Returns nil if read fails or if a ns declaration\ncannot be found.  The ns declaration must be the first Clojure form\nin the file, except for (comment ...)  forms.",
   :var-type "function",
   :line 51,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile entry-name]),
   :name "read-ns-decl-from-jarfile-entry",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj#L93",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/d331440b6ae1923f0ed9aca410a176ae2ee11797/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-ns-decl-from-jarfile-entry",
   :doc
   "Attempts to read a (ns ...) declaration from the named entry in the\nJAR file, and returns the unevaluated form.  Returns nil if the read\nfails, or if the first form is not a ns declaration.",
   :var-type "function",
   :line 93,
   :file "src/main/clojure/clojure/tools/namespace.clj"})}

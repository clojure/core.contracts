{:namespaces
 ({:doc
   "The public contracts programming functions and macros for clojure.core.contracts.",
   :name "clojure.core.contracts",
   :wiki-url
   "http://clojure.github.com/core.contracts/clojure.core.contracts-api.html",
   :source-url
   "https://github.com/clojure/core.contracts/blob/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts.clj"}
  {:doc nil,
   :name "clojure.core.contracts.constraints",
   :wiki-url
   "http://clojure.github.com/core.contracts/clojure.core.contracts.constraints-api.html",
   :source-url
   "https://github.com/clojure/core.contracts/blob/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj"}
  {:doc nil,
   :name "clojure.core.contracts.impl.transformers",
   :wiki-url
   "http://clojure.github.com/core.contracts/clojure.core.contracts.impl.transformers-api.html",
   :source-url
   "https://github.com/clojure/core.contracts/blob/18c2ec806daa1cb22416e2a81faa24595761ecb8/src/main/clojure/clojure/core/contracts/impl/transformers.clj"}
  {:doc nil,
   :name "clojure.core.contracts.impl.utils",
   :wiki-url
   "http://clojure.github.com/core.contracts/clojure.core.contracts.impl.utils-api.html",
   :source-url
   "https://github.com/clojure/core.contracts/blob/fc6b92fbb9e061f105cb90092934aba1608e1945/src/main/clojure/clojure/core/contracts/impl/utils.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/core.contracts/raw/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts.clj",
   :name "provide",
   :file "src/main/clojure/clojure/core/contracts.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts.clj#L54",
   :line 54,
   :var-type "macro",
   :arglists ([& kontracts]),
   :doc
   "Provides the Var manipulation macro offering ex post facto application of contracts\nto existing functions.",
   :namespace "clojure.core.contracts",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts/provide"}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts.clj",
   :name "with-constraints",
   :file "src/main/clojure/clojure/core/contracts.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts.clj#L42",
   :line 42,
   :var-type "function",
   :arglists ([f] [f c] [f c & more]),
   :doc
   "A contract combinator.\n\n Takes a target function and a number of contracts and returns a function with the contracts\n applied to the original.  This is the preferred way to apply a contract previously created\n using `contract` as the use of `partial` may not work as implementation details change.\n",
   :namespace "clojure.core.contracts",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts/with-constraints"}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj",
   :name "<-",
   :file "src/main/clojure/clojure/core/contracts/constraints.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj#L42",
   :line 42,
   :var-type "function",
   :arglists ([p q]),
   :doc "Converse implication",
   :namespace "clojure.core.contracts.constraints",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/<-"}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj",
   :name "<=>",
   :file "src/main/clojure/clojure/core/contracts/constraints.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj#L52",
   :line 52,
   :var-type "function",
   :arglists ([p q]),
   :doc "Logical equality",
   :namespace "clojure.core.contracts.constraints",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/<=>"}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj",
   :name "=",
   :file "src/main/clojure/clojure/core/contracts/constraints.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj#L64",
   :line 64,
   :var-type "function",
   :arglists ([l__918__auto__] [l__918__auto__ r__919__auto__]),
   :doc "Curried version of #'clojure.core/=",
   :namespace "clojure.core.contracts.constraints",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/="}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj",
   :name "==",
   :file "src/main/clojure/clojure/core/contracts/constraints.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj#L64",
   :line 64,
   :var-type "function",
   :arglists ([l__918__auto__] [l__918__auto__ r__919__auto__]),
   :doc "Curried version of #'clojure.core/==",
   :namespace "clojure.core.contracts.constraints",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/=="}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj",
   :name "defconstrainedfn",
   :file "src/main/clojure/clojure/core/contracts/constraints.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj#L79",
   :line 79,
   :var-type "macro",
   :arglists ([name & body]),
   :doc
   "Defines a function using the `contract` vector appearing after the arguments.\n\n     (defconstrainedfn sqr\n       [n] [number? (not= 0 n) => pos? number?]\n       (* n n))\n\n Like the `contract` macro, multiple arity functions can be defined where each argument vector\n is immediately followed by the relevent arity expectations.  This macro will also detect\n if a map is in that constraints position and use that instead under the assumption that\n Clojure's `:pre`/`:post` map is used instead.\n",
   :namespace "clojure.core.contracts.constraints",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/defconstrainedfn"}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj",
   :name "except",
   :file "src/main/clojure/clojure/core/contracts/constraints.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj#L47",
   :line 47,
   :var-type "function",
   :arglists ([p q]),
   :doc "P except Q",
   :namespace "clojure.core.contracts.constraints",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/except"}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj",
   :name "implies",
   :file "src/main/clojure/clojure/core/contracts/constraints.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj#L37",
   :line 37,
   :var-type "function",
   :arglists ([p q]),
   :doc "Logical implication",
   :namespace "clojure.core.contracts.constraints",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/implies"}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj",
   :name "in",
   :file "src/main/clojure/clojure/core/contracts/constraints.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj#L15",
   :line 15,
   :var-type "function",
   :arglists ([e & args]),
   :doc
   "Takes an item and determines if it falls in the listed args.  This can be\nused most effectively for numbers since any numbers in a vector represent\na range of values determined by the same arguments as given to `range`.",
   :namespace "clojure.core.contracts.constraints",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/in"}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj",
   :name "not=",
   :file "src/main/clojure/clojure/core/contracts/constraints.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj#L64",
   :line 64,
   :var-type "function",
   :arglists ([l__918__auto__] [l__918__auto__ r__919__auto__]),
   :doc "Curried version of #'clojure.core/not=",
   :namespace "clojure.core.contracts.constraints",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/not="}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj",
   :name "whitelist",
   :file "src/main/clojure/clojure/core/contracts/constraints.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj#L30",
   :line 30,
   :var-type "function",
   :arglists ([wl things]),
   :doc
   "Takes a thing with keys (i.e. maps or sets) and checks if it contains only\nthe keys listed in the given whitelist.",
   :namespace "clojure.core.contracts.constraints",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/whitelist"}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj",
   :name "xor",
   :file "src/main/clojure/clojure/core/contracts/constraints.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/6af4be591211946909102051413b09d19e5a0126/src/main/clojure/clojure/core/contracts/constraints.clj#L58",
   :line 58,
   :var-type "function",
   :arglists ([p q]),
   :doc "Exclusive or",
   :namespace "clojure.core.contracts.constraints",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/xor"}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/18c2ec806daa1cb22416e2a81faa24595761ecb8/src/main/clojure/clojure/core/contracts/impl/transformers.clj",
   :name "->Hoc",
   :file
   "src/main/clojure/clojure/core/contracts/impl/transformers.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/18c2ec806daa1cb22416e2a81faa24595761ecb8/src/main/clojure/clojure/core/contracts/impl/transformers.clj#L24",
   :line 24,
   :var-type "function",
   :arglists ([field desc]),
   :doc
   "Positional factory function for class clojure.core.contracts.impl.transformers.Hoc.",
   :namespace "clojure.core.contracts.impl.transformers",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.impl.transformers/->Hoc"}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/18c2ec806daa1cb22416e2a81faa24595761ecb8/src/main/clojure/clojure/core/contracts/impl/transformers.clj",
   :name "map->Hoc",
   :file
   "src/main/clojure/clojure/core/contracts/impl/transformers.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/18c2ec806daa1cb22416e2a81faa24595761ecb8/src/main/clojure/clojure/core/contracts/impl/transformers.clj#L24",
   :line 24,
   :var-type "function",
   :arglists ([m__5818__auto__]),
   :doc
   "Factory function for class clojure.core.contracts.impl.transformers.Hoc, taking a map of keywords to field values.",
   :namespace "clojure.core.contracts.impl.transformers",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.impl.transformers/map->Hoc"}
  {:name "Hoc",
   :var-type "record",
   :namespace "clojure.core.contracts.impl.transformers",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.impl.transformers/Hoc",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/fc6b92fbb9e061f105cb90092934aba1608e1945/src/main/clojure/clojure/core/contracts/impl/utils.clj",
   :name "constraint?",
   :file "src/main/clojure/clojure/core/contracts/impl/utils.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/fc6b92fbb9e061f105cb90092934aba1608e1945/src/main/clojure/clojure/core/contracts/impl/utils.clj#L56",
   :line 56,
   :var-type "function",
   :arglists ([sym]),
   :doc
   "Determines if a symbol represents a\ncore.contracts constraint.",
   :namespace "clojure.core.contracts.impl.utils",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.impl.utils/constraint?"}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/fc6b92fbb9e061f105cb90092934aba1608e1945/src/main/clojure/clojure/core/contracts/impl/utils.clj",
   :name "defcurried",
   :file "src/main/clojure/clojure/core/contracts/impl/utils.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/fc6b92fbb9e061f105cb90092934aba1608e1945/src/main/clojure/clojure/core/contracts/impl/utils.clj#L38",
   :line 38,
   :var-type "macro",
   :arglists ([name doc meta args & body]),
   :doc
   "Builds another arity of the fn that returns a fn awaiting the last\nparam",
   :namespace "clojure.core.contracts.impl.utils",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.impl.utils/defcurried"}
  {:raw-source-url
   "https://github.com/clojure/core.contracts/raw/fc6b92fbb9e061f105cb90092934aba1608e1945/src/main/clojure/clojure/core/contracts/impl/utils.clj",
   :name "defcurry-from",
   :file "src/main/clojure/clojure/core/contracts/impl/utils.clj",
   :source-url
   "https://github.com/clojure/core.contracts/blob/fc6b92fbb9e061f105cb90092934aba1608e1945/src/main/clojure/clojure/core/contracts/impl/utils.clj#L44",
   :line 44,
   :var-type "macro",
   :arglists ([namespace & names]),
   :doc "Builds a pass-through curried fn for each name.",
   :namespace "clojure.core.contracts.impl.utils",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.impl.utils/defcurry-from"})}

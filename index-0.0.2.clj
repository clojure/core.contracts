{:namespaces
 ({:source-url
   "https://github.com/clojure/core.contracts/blob/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts/clojure.core.contracts-api.html",
   :name "clojure.core.contracts",
   :doc
   "The public contracts programming functions and macros for clojure.core.contracts."}
  {:source-url
   "https://github.com/clojure/core.contracts/blob/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts/clojure.core.contracts.constraints-api.html",
   :name "clojure.core.contracts.constraints",
   :doc nil}
  {:source-url
   "https://github.com/clojure/core.contracts/blob/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts/impl/transformers.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts/clojure.core.contracts.impl.transformers-api.html",
   :name "clojure.core.contracts.impl.transformers",
   :doc nil}
  {:source-url
   "https://github.com/clojure/core.contracts/blob/fc6b92fbb9e061f105cb90092934aba1608e1945/src/main/clojure/clojure/core/contracts/impl/utils.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts/clojure.core.contracts.impl.utils-api.html",
   :name "clojure.core.contracts.impl.utils",
   :doc nil}),
 :vars
 ({:arglists ([& kontracts]),
   :name "provide",
   :namespace "clojure.core.contracts",
   :source-url
   "https://github.com/clojure/core.contracts/blob/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts.clj#L54",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts/provide",
   :doc
   "Provides the Var manipulation macro offering ex post facto application of contracts\nto existing functions.",
   :var-type "macro",
   :line 54,
   :file "src/main/clojure/clojure/core/contracts.clj"}
  {:arglists ([f] [f c] [f c & more]),
   :name "with-constraints",
   :namespace "clojure.core.contracts",
   :source-url
   "https://github.com/clojure/core.contracts/blob/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts.clj#L42",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts/with-constraints",
   :doc
   "A contract combinator.\n\n Takes a target function and a number of contracts and returns a function with the contracts\n applied to the original.  This is the preferred way to apply a contract previously created\n using `contract` as the use of `partial` may not work as implementation details change.\n",
   :var-type "function",
   :line 42,
   :file "src/main/clojure/clojure/core/contracts.clj"}
  {:arglists ([p q]),
   :name "<-",
   :namespace "clojure.core.contracts.constraints",
   :source-url
   "https://github.com/clojure/core.contracts/blob/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj#L41",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/<-",
   :doc "Converse implication",
   :var-type "function",
   :line 41,
   :file "src/main/clojure/clojure/core/contracts/constraints.clj"}
  {:arglists ([p q]),
   :name "<=>",
   :namespace "clojure.core.contracts.constraints",
   :source-url
   "https://github.com/clojure/core.contracts/blob/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj#L51",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/<=>",
   :doc "Logical equality",
   :var-type "function",
   :line 51,
   :file "src/main/clojure/clojure/core/contracts/constraints.clj"}
  {:arglists ([l__945__auto__] [l__945__auto__ r__946__auto__]),
   :name "=",
   :namespace "clojure.core.contracts.constraints",
   :source-url
   "https://github.com/clojure/core.contracts/blob/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj#L63",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/=",
   :doc "Curried version of #'clojure.core/=",
   :var-type "function",
   :line 63,
   :file "src/main/clojure/clojure/core/contracts/constraints.clj"}
  {:arglists ([l__945__auto__] [l__945__auto__ r__946__auto__]),
   :name "==",
   :namespace "clojure.core.contracts.constraints",
   :source-url
   "https://github.com/clojure/core.contracts/blob/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj#L63",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/==",
   :doc "Curried version of #'clojure.core/==",
   :var-type "function",
   :line 63,
   :file "src/main/clojure/clojure/core/contracts/constraints.clj"}
  {:arglists ([name & body]),
   :name "defconstrainedfn",
   :namespace "clojure.core.contracts.constraints",
   :source-url
   "https://github.com/clojure/core.contracts/blob/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj#L78",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/defconstrainedfn",
   :doc
   "Defines a function using the `contract` vector appearing after the arguments.\n\n     (defconstrainedfn sqr\n       [n] [number? (not= 0 n) => pos? number?]\n       (* n n))\n\n Like the `contract` macro, multiple arity functions can be defined where each argument vector\n is immediately followed by the relevent arity expectations.  This macro will also detect\n if a map is in that constraints position and use that instead under the assumption that\n Clojure's `:pre`/`:post` map is used instead.\n",
   :var-type "macro",
   :line 78,
   :file "src/main/clojure/clojure/core/contracts/constraints.clj"}
  {:arglists ([p q]),
   :name "except",
   :namespace "clojure.core.contracts.constraints",
   :source-url
   "https://github.com/clojure/core.contracts/blob/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj#L46",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/except",
   :doc "P except Q",
   :var-type "function",
   :line 46,
   :file "src/main/clojure/clojure/core/contracts/constraints.clj"}
  {:arglists ([p q]),
   :name "implies",
   :namespace "clojure.core.contracts.constraints",
   :source-url
   "https://github.com/clojure/core.contracts/blob/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj#L36",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/implies",
   :doc "Logical implication",
   :var-type "function",
   :line 36,
   :file "src/main/clojure/clojure/core/contracts/constraints.clj"}
  {:arglists ([e & args]),
   :name "in",
   :namespace "clojure.core.contracts.constraints",
   :source-url
   "https://github.com/clojure/core.contracts/blob/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj#L14",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/in",
   :doc
   "Takes an item and determines if it falls in the listed args.  This can be\nused most effectively for numbers since any numbers in a vector represent\na range of values determined by the same arguments as given to `range`.",
   :var-type "function",
   :line 14,
   :file "src/main/clojure/clojure/core/contracts/constraints.clj"}
  {:arglists ([l__945__auto__] [l__945__auto__ r__946__auto__]),
   :name "not=",
   :namespace "clojure.core.contracts.constraints",
   :source-url
   "https://github.com/clojure/core.contracts/blob/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj#L63",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/not=",
   :doc "Curried version of #'clojure.core/not=",
   :var-type "function",
   :line 63,
   :file "src/main/clojure/clojure/core/contracts/constraints.clj"}
  {:arglists ([wl things]),
   :name "whitelist",
   :namespace "clojure.core.contracts.constraints",
   :source-url
   "https://github.com/clojure/core.contracts/blob/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj#L29",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/whitelist",
   :doc
   "Takes a thing with keys (i.e. maps or sets) and checks if it contains only\nthe keys listed in the given whitelist.",
   :var-type "function",
   :line 29,
   :file "src/main/clojure/clojure/core/contracts/constraints.clj"}
  {:arglists ([p q]),
   :name "xor",
   :namespace "clojure.core.contracts.constraints",
   :source-url
   "https://github.com/clojure/core.contracts/blob/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj#L57",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/1bcd09d89857fc1eafd57a574f30b8cf74f12e55/src/main/clojure/clojure/core/contracts/constraints.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.constraints/xor",
   :doc "Exclusive or",
   :var-type "function",
   :line 57,
   :file "src/main/clojure/clojure/core/contracts/constraints.clj"}
  {:arglists ([field desc]),
   :name "->Hoc",
   :namespace "clojure.core.contracts.impl.transformers",
   :source-url
   "https://github.com/clojure/core.contracts/blob/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts/impl/transformers.clj#L24",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts/impl/transformers.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.impl.transformers/->Hoc",
   :doc
   "Positional factory function for class clojure.core.contracts.impl.transformers.Hoc.",
   :var-type "function",
   :line 24,
   :file
   "src/main/clojure/clojure/core/contracts/impl/transformers.clj"}
  {:arglists ([m__5828__auto__]),
   :name "map->Hoc",
   :namespace "clojure.core.contracts.impl.transformers",
   :source-url
   "https://github.com/clojure/core.contracts/blob/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts/impl/transformers.clj#L24",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/66fbe3d77ca27d4d5b20b43f391180360c67171d/src/main/clojure/clojure/core/contracts/impl/transformers.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.impl.transformers/map->Hoc",
   :doc
   "Factory function for class clojure.core.contracts.impl.transformers.Hoc, taking a map of keywords to field values.",
   :var-type "function",
   :line 24,
   :file
   "src/main/clojure/clojure/core/contracts/impl/transformers.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.impl.transformers/Hoc",
   :namespace "clojure.core.contracts.impl.transformers",
   :var-type "record",
   :name "Hoc"}
  {:arglists ([sym]),
   :name "constraint?",
   :namespace "clojure.core.contracts.impl.utils",
   :source-url
   "https://github.com/clojure/core.contracts/blob/fc6b92fbb9e061f105cb90092934aba1608e1945/src/main/clojure/clojure/core/contracts/impl/utils.clj#L56",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/fc6b92fbb9e061f105cb90092934aba1608e1945/src/main/clojure/clojure/core/contracts/impl/utils.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.impl.utils/constraint?",
   :doc
   "Determines if a symbol represents a\ncore.contracts constraint.",
   :var-type "function",
   :line 56,
   :file "src/main/clojure/clojure/core/contracts/impl/utils.clj"}
  {:arglists ([name doc meta args & body]),
   :name "defcurried",
   :namespace "clojure.core.contracts.impl.utils",
   :source-url
   "https://github.com/clojure/core.contracts/blob/fc6b92fbb9e061f105cb90092934aba1608e1945/src/main/clojure/clojure/core/contracts/impl/utils.clj#L38",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/fc6b92fbb9e061f105cb90092934aba1608e1945/src/main/clojure/clojure/core/contracts/impl/utils.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.impl.utils/defcurried",
   :doc
   "Builds another arity of the fn that returns a fn awaiting the last\nparam",
   :var-type "macro",
   :line 38,
   :file "src/main/clojure/clojure/core/contracts/impl/utils.clj"}
  {:arglists ([namespace & names]),
   :name "defcurry-from",
   :namespace "clojure.core.contracts.impl.utils",
   :source-url
   "https://github.com/clojure/core.contracts/blob/fc6b92fbb9e061f105cb90092934aba1608e1945/src/main/clojure/clojure/core/contracts/impl/utils.clj#L44",
   :raw-source-url
   "https://github.com/clojure/core.contracts/raw/fc6b92fbb9e061f105cb90092934aba1608e1945/src/main/clojure/clojure/core/contracts/impl/utils.clj",
   :wiki-url
   "http://clojure.github.com/core.contracts//clojure.core.contracts-api.html#clojure.core.contracts.impl.utils/defcurry-from",
   :doc "Builds a pass-through curried fn for each name.",
   :var-type "macro",
   :line 44,
   :file "src/main/clojure/clojure/core/contracts/impl/utils.clj"})}

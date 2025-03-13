(ns repl-goody-bag)

(defmacro defr
  "Like [[def]] but returns the value of newly defined `sym`"
  ([sym docstr arg] `(do (def ~sym ~docstr ~arg) ~sym))
  ([sym arg] `(do (def ~sym ~arg) ~sym)))

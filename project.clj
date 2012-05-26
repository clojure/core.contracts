(defproject core.contracts "0.0.1"
  :description "Contracts programming for Clojure."
  :dependencies [[org.clojure/clojure "1.5.0-alpha1"]
                 [org.clojure/core.unify "0.5.3"]]
  :dev-dependencies [[lein-clojars "0.5.0-SNAPSHOT"]
                     [jline "0.9.94"]
                     [swank-clojure "1.4.0"]
                     [lein-marginalia "0.7.0"]
                     [lein-multi "1.1.0"]]
  :multi-deps {:all [[org.clojure/core.unify "0.5.3"]]
               "1.2"   [[org.clojure/clojure "1.2.0"]]
               "1.2.1" [[org.clojure/clojure "1.2.1"]]
               "1.3"   [[org.clojure/clojure "1.3.0"]]
               "1.4"   [[org.clojure/clojure "1.4.0"]]}
  :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}
  :source-path "src/main/clojure"
  :test-path   "src/test/clojure")

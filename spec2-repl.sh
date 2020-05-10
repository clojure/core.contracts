#!/bin/bash

sha=`git ls-remote https://github.com/clojure/spec-alpha2.git refs/heads/master | cut -c1-40`

echo "Pulling Spec2 at SHA \"${sha}\""

clj -Sdeps "{:deps {org.clojure/clojure {:mvn/version \"1.10.1\"}
                    org.clojure/test.check {:mvn/version \"0.9.0\"} 
                    org.clojure/alpha.spec {:git/url \"https://github.com/clojure/spec-alpha2.git\" 
                                            :sha \"${sha}\"}}}"

clojure.core.contracts
========================================

Contracts programming for Clojure.

In progress.

Based on [Trammel](http://github.com/fogus/trammel) and [clojure-contracts](http://github.com/dnaumov/clojure-contracts).


Releases and Dependency Information
========================================

Latest stable release: 0.0.6

* [All Released Versions](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.clojure%22%20AND%20a%3A%22core.cache%22)

* [Development Snapshot Versions](https://oss.sonatype.org/index.html#nexus-search;gav~org.clojure~core.contracts~~~)

[Leiningen](https://github.com/technomancy/leiningen) dependency information:

    [org.clojure/core.contracts "0.0.6"]

[Maven](http://maven.apache.org/) dependency information:

    <dependency>
      <groupId>org.clojure</groupId>
      <artifactId>core.contracts</artifactId>
      <version>0.0.6</version>
    </dependency>



Example Usage
========================================

```clojure
    (use 'clojure.core.contracts)
	
	(def secure-doubler
	  (with-constraints
	  	(fn [n] (* 2 n))
	  	(contract doubler
          "ensures doubling"
          [x] [number? => (= (* 2 x) %)]
          [x y] [(every? number? [x y])
                   =>
                 (= (* 2 (+ x y)) %)])))

    (secure-doubler 10)
    ;=> 20
```

Refer to docstrings in the `clojure.core.contracts` namespace.

Documentation
========================================

[core.contracts API](http://clojure.github.io/core.contracts/)

See also the [wiki](/clojure/core.contracts/wiki) for some documentation and examples.

Developer Information
========================================

* [GitHub project](https://github.com/clojure/core.contracts)

* [Bug Tracker](http://dev.clojure.org/jira/browse/CCONTRACTS)

* [Continuous Integration](http://build.clojure.org/job/core.contracts/)

* [Compatibility Test Matrix](http://build.clojure.org/job/core.contracts-test-matrix/)

* [References](https://github.com/clojure/core.contracts/blob/master/References.md)

Change Log
====================

* Release 0.0.6 on 2016.08.20
  * Bump dependency on newest version of core.unify, which fixes a compilation problem with Clojure 1.9.0-alpha11
* Release 0.0.5 on 2013.06.28
  * Speedier constrained record perf.
* Release 0.0.4 on 2013.03.07
  * Rolled in `defconstrainedrecord`
  * Rolled in associative checks
* Release 0.0.1 on 2012.06.01
  * Rolled in `contract`, `with-constraints` and `provide` from Trammel


Copyright and License
========================================

Copyright (c) Rich Hickey, Michael Fogus and contributors, 2012. All rights reserved.  The use and distribution terms for this software are covered by the Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php) which can be found in the file epl-v10.html at the root of this distribution. By using this software in any fashion, you are agreeing to be bound bythe terms of this license.  You must not remove this notice, or any other, from this software.

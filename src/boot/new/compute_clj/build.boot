(def project '{{raw-name}})
(def version "0.1-alpha1")

(set-env! :resource-paths #{"src"}
          :source-paths #{"test"}
          :dependencies '[[compute/boot-tasks "RELEASE" :scope "test"]
                          [adzerk/boot-test "RELEASE" :scope "test"]

                          [org.clojure/clojure "RELEASE"]])

(require '[adzerk.boot-test :refer [test]]
         '[compute.boot-tasks.core :refer [inst deploy]])

(task-options!
  pom {:project     project
       :version     version
       :description "FIXME: write description"
       :url         "http://example/FIXME"
       :scm         {:url "https://github.com/yourname/{{name}}"}
       :license     {"Eclipse Public License"
                     "http://www.eclipse.org/legal/epl-v10.html"}}
  jar {:main '{{namespace}}
       :file (str "{{name}}-" version "-standalone.jar")})
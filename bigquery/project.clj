(defproject gcloudclient/bigquery "0.1.1"
  :description "Clojure client to java big query"
  :url "https://github.com/Gobinath-Manokaran/gclouj.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.google.cloud/google-cloud-bigquery "1.98.0" :exclusions [io.netty/netty-codec-http2 io.grpc/grpc-core]]
                 [clj-time "0.14.0"]]
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :profiles {:dev {:global-vars {*warn-on-reflection* true}}})

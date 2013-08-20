(defproject lein-checkout-sandbox "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [lein-deploy-sandbox "0.1.0-SNAPSHOT"]]

  :repositories [["snapshots" "http://nexus-hack.delivery.puppetlabs.net:8081/nexus/content/repositories/snapshots/"]
                 ["releases" "http://nexus-hack.delivery.puppetlabs.net:8081/nexus/content/repositories/releases/"]])

(ns lein-checkout-sandbox.core-test
  (:require [clojure.test :refer :all]
            [lein-deploy-sandbox.core :as lds]))

(deftest a-test
  (testing "test lein-deploy-sandbox/say-hello"
    (is (= "hello, v1" (lds/say-hello)))))

(ns ga-schedule.employee)

; TODO: Shifts-unable-to-work
(defrecord Employee [perc-days-worked-per-period period-days-unavailable])

(defn can-work-day? [employee period-day]
  (not
    ((:period-days-unavailable employee)
     period-day)))

(defn days-worked-for-period [employee period-length]
  (* (:perc-days-worked-per-period employee)
     period-length))

(def test-employee
  (->Employee 1 #{1 3}))
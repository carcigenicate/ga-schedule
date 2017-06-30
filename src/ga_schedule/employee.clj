(ns ga-schedule.employee)

; TODO: Shifts-unable-to-work
(defrecord Employee [days-worked-per-period period-days-unavailable])
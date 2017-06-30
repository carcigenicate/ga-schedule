(ns ga-schedule.gene-parser)

(defn cut-genes-into-day-blocks
  "Cuts the genes into blocks. Each block will have as many genes are there are shifts that day.
  shifts-per-day should be a list (whose length matches the period length) containing how many shifts exist for each day of the period.

  For example, if a period is 14 days, and there are 5 shifts on weekdays, and 2 shifts on weekends,
   shifts-per-day would be [5 5 5 5 5 2 2 5 5 5 5 5 2 2]."
  [genes shifts-per-day]
  (loop [rem-genes genes
         [n-shifts & rem-days] shifts-per-day
         acc []]

    (if n-shifts
      (let [[block rest-genes] (split-at n-shifts rem-genes)]
        (recur rest-genes
               rem-days
               (conj acc block)))

      acc)))
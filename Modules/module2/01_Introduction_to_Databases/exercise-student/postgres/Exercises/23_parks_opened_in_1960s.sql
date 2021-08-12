-- 23. The name and date established of parks opened in the 1960s (6 rows)
SELECT park_name, date_established::date  FROM park WHERE date_established BETWEEN date '1960-01-01' AND  date '1969-12-31' ;
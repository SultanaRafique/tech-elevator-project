-- ORDERING RESULTS

-- Populations of all states from largest to smallest.


-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.


-- The biggest park by area



-- LIMITING RESULTS

-- The 10 largest cities by populations


-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name. You can use
-- CURRENT_DATE to get the current date and use date_part to get the specific part of a date
-- i.e. date_part('year', CURRENT_DATE)
-- more info on date_part: https://www.postgresqltutorial.com/postgresql-date_part/



-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation in alpabetical order by name.


-- All park names and area  in alpabetical order by name.


-- The census region and state name of all states in the West & Midwest sorted in ascending order alphabetically.



-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.


-- Total population in the West and South census regions


-- The number of cities with populations greater than 1 million


-- The number of state nicknames.


-- The area of the smallest and largest parks.



-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.


-- Determine the average park area depending upon whether parks allow camping or not.


-- Sum of the population of cities in each state ordered by state abbreviation.


-- The smallest city population in each state ordered by city population.



-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,


-- Include the names of the smallest and largest parks


-- List the capital cities for the states in the Northeast census region.


-- ORDERING RESULTS

SELECT census_region, state_name, population FROM state ORDER BY census_region, population;

SELECT * FROM city

SELECT city_name, state_abbreviation, area FROM city ORDER BY state_abbreviation ASC, city_name DESC;


-- Populations of all states from largest to smallest.
SELECT state_abbreviation, population FROM state ORDER BY population DESC

SELECT state_abbreviation, population FROM state ORDER BY population DESC LIMIT 10;



-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT state_name, census_region FROM state WHERE census_region IS NOT NULL ORDER BY census_region DESC, state_name;


-- The biggest park by area
SELECT park_name FROM park ORDER BY area DESC;



-- LIMITING RESULTS

SELECT park_name FROM park ORDER BY area DESC LIMIT 1;


-- The 10 largest cities by populations
SELECT city_name, population FROM city ORDER BY population DESC LIMIT 10;


-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name. You can use
-- CURRENT_DATE to get the current date and use date_part to get the specific part of a date
-- i.e. date_part('year', CURRENT_DATE)
-- more info on date_part: https://www.postgresqltutorial.com/postgresql-date_part/

SELECT park_name, date_established FROM park ORDER BY date_established, park_name DESC

SELECT CURRENT_DATE;

SELECT park_name,  date_part('year', CURRENT_DATE),  date_part('year', date_established), 
( date_part('year', CURRENT_DATE) - date_part('year', date_established) ) AS age FROM park ORDER BY age DESC, park_name 



-- CONCATENATING OUTPUTS
SELECT * FROM park

SELECT (park_name || 'Has camping: ' || has_camping) AS park_has_camping FROM park ORDER BY park_has_camping


-- All city names and their state abbreviation in alpabetical order by name.

SELECT (city_name || ' ' || state_abbreviation) AS city_state FROM city ORDER BY city_name


-- All park names and area  in alpabetical order by name.
SELECT park_name || ' ' || area FROM park ORDER BY park_name


SELECT (area || ' ' || park_name) AS area_park FROM park ORDER BY area_park

-- The census region and state name of all states in the West & Midwest sorted in ascending order alphabetically.
SELECT (census_region || ' ' || state_name) AS census_state FROM state WHERE census_region IN ('West', 'Midwest') ORDER BY census_state;
SELECT (census_region || ' ' || state_name) AS census_state FROM state WHERE census_region ILIKE '%west' ORDER BY census_state;


-- AGGREGATE FUNCTIONS
SELECT state_abbreviation, population  FROM city  ORDER BY state_abbreviation;
SELECT state_abbreviation, SUM(population)  FROM city GROUP BY state_abbreviation ORDER BY state_abbreviation;

SELECT state_abbreviation, SUM(population)  FROM city GROUP BY state_abbreviation ORDER BY state_abbreviation;
SELECT state_abbreviation, COUNT(population)  FROM city GROUP BY state_abbreviation ORDER BY state_abbreviation;

SELECT * FROM city;

SELECT * FROM state;

SELECT COUNT(state_nickname) FROM state;
SELECT COUNT(*) FROM state;
SELECT COUNT(state_nickname), COUNT(*) FROM state;

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG(population) AS average_population FROM state;



-- Total population in the West and South census regions
SELECT SUM(population), census_region FROM  state WHERE census_region IN ('West', 'South') GROUP BY census_region


-- The number of cities with populations greater than 1 million
SELECT COUNT(city_name) FROM city WHERE population > 1000000;
SELECT COUNT(*) FROM city WHERE population > 1000000;

-- The number of state nicknames.
-- this will ignore those that don't have a nickname (are NULL)
SELECT COUNT(state_nickname) FROM state;


-- The area of the smallest and largest parks.
SELECT park_name, MIN(area), MAX(area) FROM park GROUP BY park_name;



-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT state_abbreviation, COUNT(*) AS city_count FROM city GROUP BY state_abbreviation ORDER BY city_count DESC


-- Determine the average park area depending upon whether parks allow camping or not.
SELECT * FROM park;
SELECT has_camping, AVG(area) FROM park GROUP BY has_camping

-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT state_abbreviation, SUM(population) FROM city GROUP BY state_abbreviation ORDER BY state_abbreviation;


-- The smallest city population in each state ordered by city population.
SELECT state_abbreviation, MIN(population) AS min_city_population FROM city GROUP BY state_abbreviation ORDER BY min_city_population


-- SUBQUERIES (optional)

SELECT city_name, state_abbreviation FROM city WHERE state_abbreviation IN  
(select state_abbreviation FROM state WHERE census_region = 'Northeast') 


-- Include state name rather than the state abbreviation while counting the number of cities in each state

SELECT (SELECT state_name FROM state s WHERE s.state_abbreviation = c.state_abbreviation), COUNT(*) FROM city c
GROUP BY state_abbreviation ORDER BY state_abbreviation

-- Include the names of the smallest and largest parks

-- this is referring to 2 tables and is beyond the scope of the material in this lesson. Will try to 
-- revisit it after join lesson where we can talk about it with more clarity      
        
SELECT park_name, area FROM park p, (SELECT MIN(area) AS smallest, MAX(area) AS largest FROM park min_max_p) AS min_max
WHERE p.area = min_max.smallest OR p.area = min_max.largest

-- this is using a sub-select to match the id in one table to the id of the related info in another table
-- this is done with a subquery but relates to tomorrow's join concepts        

select * from state
select * from city WHERE city_id = 132

-- List the capital cities for the states in the Northeast census region.
SELECT s.state_abbreviation, 
        (SELECT c.city_name FROM city c WHERE c.city_id = s.capital) FROM state AS s WHERE s.census_region = 'Northeast'


SELECT state_name FROM state WHERE census_region = 'Northeast'


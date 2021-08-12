-- INSERT

-- Add Disneyland to the park table. (It was established on 7/17/1955, has an area of 0.78 square miles and does not offer camping.)

INSERT INTO park (park_name, date_established, area, has_camping)
VALUES('Disneyland', '1955-07-17', 78, false);

-- Add Hawkins, IN (with a population of 30,000 and an area of 14.71 square miles) 
--and Cicely, AK (with a popuation of 839 and an area of 4.39 square miles) to the city table.
INSERT INTO city (city_name, state_abbreviation, population, area)
VALUES('Hawkins', 'IN', 30000, 14.17);

INSERT INTO city(city_name, state_abbreviation, area, population)
VALUES('Cicely', 'AK', 4.39, 839);
 
-- Since Disneyland is in California (CA), add a record representing that to the park_state table.
INSERT INTO park_state VALUES(
(SELECT park_id FROM park WHERE park_name = 'Disneyland'), 'CA');

INSERT INTO park(park_name, date_established, area, has_camping)
VALUES('TEland', '2021-6-10',5, false);

INSERT INTO park_state
SELECT park_id, 'PA' FROM park WHERE park_name = 'TEland';


-- UPDATE
UPDATE park SET park_name = 'Disneyland' WHERE park_name = 'Dinseyland';

-- Change the state nickname of California to "The Happiest Place on Earth."
UPDATE state SET state_nickname = 'The Happiest Place on Earth.' WHERE state_name ='California'



-- Increase the population of California by 1,000,000.
UPDATE state SET population = population + 1000000 WHERE state_name = 'California'


-- Change the capital of California to Anaheim.

UPDATE state SET capital = (SELECT city_id FROM city WHERE city_name = 'Anaheim')
WHERE state_name = 'California';
--SELECT city_id FROM city WHERE city_name = 'Anaheim'


-- Change California's nickname back to "The Golden State", 
--reduce the population by 1,000,000, 
--and change the capital back to Sacramento.
UPDATE state SET state_nickname = 'The Golden State' , population = population - 1000000, 
capital = (SELECT city_id FROM city Where city_name = 'Sacramento')WHERE state_name = 'California';

-- DELETE

-- Delete Hawkins, IN from the city table.
DELETE FROM city WHERE city_name = 'Hawkins' AND state_abbreviation = 'IN';

-- Delete all cities with a population of less than 1,000 people from the city table.
DELETE FROM city WHERE population < 1000;
--SELECT * FROM city WHERE population < 1000;


-- REFERENTIAL INTEGRITY

-- Try adding a city to the city table with "XX" as the state abbreviation.
INSERT INTO city (city_name, state_abbreviation, population, area)
VALUES('Hawkins', 'XX', 30000, 14.17);


-- Try deleting California from the state table.
DELETE FROM state WHERE state_name  =  'California';

-- Try deleting Disneyland from the park table. Try again after deleting its record from the park_state table.
DELETE FROM park WHERE park_name = 'Disneyland'

DELETE FROM park_state WHERE
park_id = (SELECT park_id FROM park WHERE park_name = 'Disneyland')

SELECT * FROM park WHERE park_name = 'Disneyland'
-- CONSTRAINTS

-- NOT NULL constraint
-- Try adding Smallville, KS to the city table without specifying its population or area.
INSERT INTO city(city_name, state_abbreviation) VALUES ('Smallville', 'KS')

-- DEFAULT constraint
-- Try adding Smallville, KS again, specifying an area but not a population.
INSERT INTO city(city_name, state_abbreviation, area) VALUES ('Smallville', 'KS', 1500)
SELECT * FROM city WHERE city_name = 'Smallville'

-- Retrieve the new record to confirm it has been given a default, non-null value for population.

-- UNIQUE constraint
-- Try changing California's nickname to "Vacationland" (which is already the nickname of Maine).
UPDATE state SET state_nickname = 'Vacationland' WHERE state_name = 'California';


-- CHECK constraint
-- Try changing the census region of Florida (FL) to "Southeast" (which is not a valid census region).
UPDATE state SET census_region = 'Southeast' WHERE state_abbreviation ='FL';


-- TRANSACTIONS

-- Delete the record for Smallville, KS within a transaction.
START TRANSACTION
DELETE FROM city WHERE city_name = 'Smallville' AND state_abbreviation = 'KS'
SELECT * FROM city WHERE city_name = 'Smallville'
ROLLBACK;



-- Delete all of the records from the park_state table, but then "undo" the deletion by rolling back the transaction.
START TRANSACTION
DELETE FROM park_state;
SELECT * FROM park_state; 
ROLLBACK;


-- Update all of the cities to be in the state of Texas (TX), but then roll back the transaction.
START TRANSACTION
UPDATE city SET state_abbreviation ='TX'
SELECT * FROM city;
ROLLBACK;


-- Demonstrate two different SQL connections trying to access the same table where one is inside of a transaction but hasn't committed yet.
-- Update all of the cities to be in the state of Texas (TX), but then roll back the transaction.
START TRANSACTION
UPDATE city SET city_name ='Bigville' WHERE city_name = 'Smallville'
SELECT * FROM city  WHERE city_name = 'Bigville';
ROLLBACK;
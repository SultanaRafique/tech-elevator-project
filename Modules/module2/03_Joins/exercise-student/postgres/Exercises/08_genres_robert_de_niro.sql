-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later (6 rows)

SELECT DISTINCT g.genre_name FROM genre g 
JOIN movie_genre mg ON mg.genre_id = g.genre_id
JOIN movie_actor ma ON ma.movie_id = mg.movie_id
JOIN movie m ON ma.movie_id = m.movie_id
JOIN person p ON p.person_id = ma.actor_id 
WHERE p.person_name = 'Robert De Niro' 
AND extract(year from  m.release_date) >= 2010



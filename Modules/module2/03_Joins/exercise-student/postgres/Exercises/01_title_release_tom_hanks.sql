-- 1. The titles and release dates of movies that Tom Hanks has appeared in (47 rows)
SELECT m.title, m.release_date FROM movie m
JOIN movie_actor ma ON ma.movie_id = m.movie_id
JOIN person p ON p.person_id = ma.actor_id
WHERE p.person_name ='Tom Hanks';

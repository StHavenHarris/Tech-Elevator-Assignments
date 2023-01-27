-- 16  The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985 (20 rows)
SELECT DISTINCT p.person_name, p.birthday
FROM movie m
JOIN movie_actor ma ON ma.movie_id = m.movie_id
JOIN person  p ON ma.actor_id = p.person_id
WHERE p.birthday BETWEEN '1/1/1950' AND '12/31/1959' AND m.release_date BETWEEN '1/1/1985' AND '12/31/1985'
-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection" (28 rows)
SELECT DISTINCT p.person_name
FROM movie m
JOIN movie_actor ma ON ma.movie_id = m.movie_id
JOIN person  p ON ma.actor_id = p.person_id
JOIN collection c on c.collection_id = m.collection_id
WHERE c.collection_name = 'Back to the Future Collection';
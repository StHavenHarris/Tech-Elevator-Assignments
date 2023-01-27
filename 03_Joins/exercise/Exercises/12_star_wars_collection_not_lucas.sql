-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)
SELECT m.title
FROM movie m
JOIN person p  ON m.director_id = p.person_id
JOIN collection c on c.collection_id = m.collection_id
WHERE c.collection_name = 'Star Wars Collection' AND p.person_name != 'George Lucas';

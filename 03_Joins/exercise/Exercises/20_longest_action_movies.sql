-- 20. The titles, lengths, and release dates of the 5 longest movies in the "Action" genre. Order the movies by length (highest first), then by release date (latest first).
-- (5 rows, expected lengths around 180 - 200)
SELECT m.title,MAX(m.length_minutes) AS length_minutes , m.release_date
FROM movie m
JOIN movie_genre mg ON m.movie_id = mg.movie_id
JOIN genre g ON mg.genre_id = g.genre_id
WHERE g.genre_name = 'Action'
GROUP BY m.title, m.release_date, m.length_minutes
ORDER BY m.length_minutes DESC, m.release_date DESC, m.length_minutes
LIMIT 5;
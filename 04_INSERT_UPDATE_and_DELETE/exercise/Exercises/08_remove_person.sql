-- 8. Remove "Penn Jillette" from the person table 
-- You'll have to remove data from another table before you can make him "disappear" (Get it? Because he's a magician...) (1 row each)
DELETE FROM movie_actor A USING person P WHERE A.actor_id = P.person_id AND P.person_name = 'Penn Jillette';
DELETE FROM person WHERE person_name = 'Penn Jillette';
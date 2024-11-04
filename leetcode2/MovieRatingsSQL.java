package LeetCode2;

public class MovieRatingsSQL {

	
//	Table: Movies
//
//	+---------------+---------+
//	| Column Name   | Type    |
//	+---------------+---------+
//	| movie_id      | int     |
//	| title         | varchar |
//	+---------------+---------+
//	movie_id is the primary key (column with unique values) for this table.
//	title is the name of the movie.
//	 
//
//	Table: Users
//
//	+---------------+---------+
//	| Column Name   | Type    |
//	+---------------+---------+
//	| user_id       | int     |
//	| name          | varchar |
//	+---------------+---------+
//	user_id is the primary key (column with unique values) for this table.
//	The column 'name' has unique values.
//	Table: MovieRating
//
//	+---------------+---------+
//	| Column Name   | Type    |
//	+---------------+---------+
//	| movie_id      | int     |
//	| user_id       | int     |
//	| rating        | int     |
//	| created_at    | date    |
//	+---------------+---------+
//	(movie_id, user_id) is the primary key (column with unique values) for this table.
//	This table contains the rating of a movie by a user in their review.
//	created_at is the user's review date. 
//	 
//
//	Write a solution to:
//
//	Find the name of the user who has rated the greatest number of movies. In case of a tie, return the lexicographically smaller user name.
//	Find the movie name with the highest average rating in February 2020. In case of a tie, return the lexicographically smaller movie name.
//	The result format is in the following example.
//
//	 
//
//	Example 1:
//
//	Input: 
//	Movies table:
//	+-------------+--------------+
//	| movie_id    |  title       |
//	+-------------+--------------+
//	| 1           | Avengers     |
//	| 2           | Frozen 2     |
//	| 3           | Joker        |
//	+-------------+--------------+
//	Users table:
//	+-------------+--------------+
//	| user_id     |  name        |
//	+-------------+--------------+
//	| 1           | Daniel       |
//	| 2           | Monica       |
//	| 3           | Maria        |
//	| 4           | James        |
//	+-------------+--------------+
//	MovieRating table:
//	+-------------+--------------+--------------+-------------+
//	| movie_id    | user_id      | rating       | created_at  |
//	+-------------+--------------+--------------+-------------+
//	| 1           | 1            | 3            | 2020-01-12  |
//	| 1           | 2            | 4            | 2020-02-11  |
//	| 1           | 3            | 2            | 2020-02-12  |
//	| 1           | 4            | 1            | 2020-01-01  |
//	| 2           | 1            | 5            | 2020-02-17  | 
//	| 2           | 2            | 2            | 2020-02-01  | 
//	| 2           | 3            | 2            | 2020-03-01  |
//	| 3           | 1            | 3            | 2020-02-22  | 
//	| 3           | 2            | 4            | 2020-02-25  | 
//	+-------------+--------------+--------------+-------------+
//	Output: 
//	+--------------+
//	| results      |
//	+--------------+
//	| Daniel       |
//	| Frozen 2     |
//	+--------------+
//	Explanation: 
//	Daniel and Monica have rated 3 movies ("Avengers", "Frozen 2" and "Joker") but Daniel is smaller lexicographically.
//	Frozen 2 and Joker have a rating average of 3.5 in February but Frozen 2 is smaller lexicographically.
	
	
	
	
	
	
	
	
	
	
	
	
//	Intuition
//	My initial thoughts are to find the most frequent user in terms of movie ratings and the highest-rated movie in February 2020. This involves joining relevant tables and grouping data to identify the desired results.
//
//	Approach
//	The approach involves two separate queries combined using UNION ALL. The first query focuses on users, utilizing the MovieRating and Users tables. It calculates the count of ratings for each user, orders the results by the count in descending order, and selects the top result. The second query revolves around movies, using the MovieRating and Movies tables. It filters ratings created in February 2020, calculates the average rating for each movie, orders the results by the average rating in descending order, and selects the top result.
//
//	First Query (for Users):
//	SELECT name AS results: Selects the user's name and aliases it as "results."
//	FROM MovieRating JOIN Users USING(user_id): Joins the MovieRating and Users tables using the user_id.
//	GROUP BY name: Groups the results by the user's name.
//	ORDER BY COUNT(*) DESC, name: Orders the results by the count of ratings in descending order and, in case of ties, by the user's name.
//	LIMIT 1: Limits the output to the top row (most frequent user) from the sorted list.
//
//	Second Query (for Movies in February 2020):
//	SELECT title AS results: Selects the movie title and aliases it as "results."
//	FROM MovieRating JOIN Movies USING(movie_id): Joins the MovieRating and Movies tables using the movie_id.
//	WHERE EXTRACT(YEAR_MONTH FROM created_at) = 202002: Filters ratings created in February 2020.
//	GROUP BY title: Groups the results by the movie title.
//	ORDER BY AVG(rating) DESC, title: Orders the results by the average rating in descending order and, in case of ties, by the movie title.
//	LIMIT 1: Limits the output to the top row (highest-rated movie in February 2020) from the sorted list.
//
//	UNION ALL:
//	Combines the results of both queries. "UNION ALL" is used to preserve all rows, even if they are duplicates.

	

//SOLTUION
	
//	# Write your MySQL query statement below
//	(SELECT name AS results
//	FROM MovieRating JOIN Users USING(user_id)
//	GROUP BY name
//	ORDER BY COUNT(*) DESC, name
//	LIMIT 1)
//
//	UNION ALL
//
//	(SELECT title AS results
//	FROM MovieRating JOIN Movies USING(movie_id)
//	WHERE EXTRACT(YEAR_MONTH FROM created_at) = 202002
//	GROUP BY title
//	ORDER BY AVG(rating) DESC, title
//	LIMIT 1);	
	

	
	
}

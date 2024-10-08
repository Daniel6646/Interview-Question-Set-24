package LeetCode2;

public class ActorsAndProducersCoprtd3Times {

//	Table: ActorDirector
//
//	+-------------+---------+
//	| Column Name | Type    |
//	+-------------+---------+
//	| actor_id    | int     |
//	| director_id | int     |
//	| timestamp   | int     |
//	+-------------+---------+
//	timestamp is the primary key (column with unique values) for this table.
//	 
//
//	Write a solution to find all the pairs (actor_id, director_id) where the actor has cooperated with the director at least three times.
//
//	Return the result table in any order.
//
//	The result format is in the following example.
//
//	 
//
//	Example 1:
//
//	Input: 
//	ActorDirector table:
//	+-------------+-------------+-------------+
//	| actor_id    | director_id | timestamp   |
//	+-------------+-------------+-------------+
//	| 1           | 1           | 0           |
//	| 1           | 1           | 1           |
//	| 1           | 1           | 2           |
//	| 1           | 2           | 3           |
//	| 1           | 2           | 4           |
//	| 2           | 1           | 5           |
//	| 2           | 1           | 6           |
//	+-------------+-------------+-------------+
//	Output: 
//	+-------------+-------------+
//	| actor_id    | director_id |
//	+-------------+-------------+
//	| 1           | 1           |
//	+-------------+-------------+
//	Explanation: The only pair is (1, 1) where they cooperated exactly 3 times.
	
	
	
//	select actor_id,director_id
//	from ActorDirector 
//	group by actor_id,director_id
//	Having count(timestamp)>=3;

	
//	EXPLANATION:
//
//		+-------------+-------------+-------------+
//		| actor_id    | director_id | timestamp   |
//		+-------------+-------------+-------------+
//		| 1           | 1           | 0           |
//		| 1           | 1           | 1           |
//		| 1           | 1           | 2           |
//		| 1           | 2           | 3           |
//		| 1           | 2           | 4           |
//		| 2           | 1           | 5           |
//		| 2           | 1           | 6           |
//		+-------------+-------------+-------------+
//
//		Group by actor_id, director_id:
//		+-------------+-------------+-------------+
//		| actor_id    | director_id | timestamp   |
//		+-------------+-------------+-------------+
//		| 1           | 1           | 0, 1, 2    |
//		| 1           | 2           | 3, 4        |
//		| 2           | 1           | 5. 6        |
//		+-------------+-------------+-------------+
//
//		Group by actor_id, director_id
//		Having count(timestamp)>=3
//
//		| actor_id    | director_id | count(timestamp)  |
//		+-------------+-------------+-------------+
//		| 1           | 1           |                3                         |
//		| 1           | 2           |                2                         |
//		| 2           | 1           |                2                         |
//		+-------------+-------------+-------------+
//
//		select actor_id, director_id from:
//
//		| actor_id    | director_id  
//		+-------------+---------+
//		| 1           | 1                    |
//		+-------------+---------+
//		PLEASE UPVOTE IF YOU FIND IT A LITTLE BIT HELPFUL, MEANS A LOT ;)
	
	
	
}

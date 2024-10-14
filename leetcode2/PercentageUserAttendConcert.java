package LeetCode2;

public class PercentageUserAttendConcert {

	
//	Table: Users
//
//	+-------------+---------+
//	| Column Name | Type    |
//	+-------------+---------+
//	| user_id     | int     |
//	| user_name   | varchar |
//	+-------------+---------+
//	user_id is the primary key (column with unique values) for this table.
//	Each row of this table contains the name and the id of a user.
//	 
//
//	Table: Register
//
//	+-------------+---------+
//	| Column Name | Type    |
//	+-------------+---------+
//	| contest_id  | int     |
//	| user_id     | int     |
//	+-------------+---------+
//	(contest_id, user_id) is the primary key (combination of columns with unique values) for this table.
//	Each row of this table contains the id of a user and the contest they registered into.
//	 
//
//	Write a solution to find the percentage of the users registered in each contest rounded to two decimals.
//
//	Return the result table ordered by percentage in descending order. In case of a tie, order it by contest_id in ascending order.
//
//	The result format is in the following example.
//
//	 
//
//	Example 1:
//
//	Input: 
//	Users table:
//	+---------+-----------+
//	| user_id | user_name |
//	+---------+-----------+
//	| 6       | Alice     |
//	| 2       | Bob       |
//	| 7       | Alex      |
//	+---------+-----------+
//	Register table:
//	+------------+---------+
//	| contest_id | user_id |
//	+------------+---------+
//	| 215        | 6       |
//	| 209        | 2       |
//	| 208        | 2       |
//	| 210        | 6       |
//	| 208        | 6       |
//	| 209        | 7       |
//	| 209        | 6       |
//	| 215        | 7       |
//	| 208        | 7       |
//	| 210        | 2       |
//	| 207        | 2       |
//	| 210        | 7       |
//	+------------+---------+
//	Output: 
//	+------------+------------+
//	| contest_id | percentage |
//	+------------+------------+
//	| 208        | 100.0      |
//	| 209        | 100.0      |
//	| 210        | 100.0      |
//	| 215        | 66.67      |
//	| 207        | 33.33      |
//	+------------+------------+
//	Explanation: 
//	All the users registered in contests 208, 209, and 210. The percentage is 100% and we sort them in the answer table by contest_id in ascending order.
//	Alice and Alex registered in contest 215 and the percentage is ((2/3) * 100) = 66.67%
//	Bob registered in contest 207 and the percentage is ((1/3) * 100) = 33.33%

	
// SOLUTION1	
//	select 
//	contest_id, 
//	round(count(distinct user_id) * 100 /(select count(user_id) from Users) ,2) as percentage
//	from  Register
//	group by contest_id
//	order by percentage desc,contest_id

	
//SOLUTION2
//	
//	Edit:
//
//		Register table mentions:
//
//		(contest_id, user_id) is the primary key (combination of columns with unique values) for this table, which makes sure there's no duplicate participation.
//
//		Hence there is no need to use Distinct. It works just fine without it.
//
//		Steps:
//		Find the number of distinct users in each contest
//		Count total number of users participating in contests
//		Calculate percentage of users participated in each contest
//		Order the result by percentage in descending order and contest_id in ascending order
//		Code
//		SELECT contest_id,
//		ROUND(COUNT(DISTINCT user_id) * 100 / (SELECT COUNT(user_id) FROM Users), 2) as percentage
//		FROM Register
//		GROUP BY contest_id
//		ORDER BY percentage desc, contest_id
//		Step 1: Find the number of distinct users in each contest
//		SELECT contest_id, COUNT(DISTINCT user_id) AS users_participated
//		FROM Register
//		GROUP BY contest_id;
//		Result:
//
//		+------------+---------------------+
//		| contest_id | users_participated |
//		+------------+---------------------+
//		|        207 |                   1 |
//		|        208 |                   3 |
//		|        209 |                   3 |
//		|        210 |                   3 |
//		|        215 |                   2 |
//		+------------+---------------------+
//		Step 2: Count total number of users participating in contests
//		SELECT COUNT(DISTINCT user_id) AS total_users
//		FROM Register;
//		Result:
//
//		+-------------+
//		| total_users |
//		+-------------+
//		|           3 |
//		+-------------+
//		Step 3: Calculate the percentage of users participated in each contest
//		SELECT contest_id,
//		       ROUND(COUNT(DISTINCT user_id) * 100 / (SELECT COUNT(DISTINCT user_id) FROM Register), 2) AS percentage
//		FROM Register
//		GROUP BY contest_id;
//		For example: For contest 207: (1/3)*100 = 33.33%
//
//		Result:
//
//		+------------+------------+
//		| contest_id | percentage |
//		+------------+------------+
//		|        207 |      33.33 |
//		|        208 |     100.00 |
//		|        209 |     100.00 |
//		|        210 |     100.00 |
//		|        215 |      66.67 |
//		+------------+------------+
//		Step 4: Order the result by percentage in descending order and contest_id in ascending order
//		SELECT contest_id,
//		       ROUND(COUNT(DISTINCT user_id) * 100 / (SELECT COUNT(DISTINCT user_id) FROM Register), 2) AS percentage
//		FROM Register
//		GROUP BY contest_id
//		ORDER BY percentage DESC, contest_id;
//		Result:
//
//		+------------+------------+
//		| contest_id | percentage |
//		+------------+------------+
//		|        208 |     100.00 |
//		|        209 |     100.00 |
//		|        210 |     100.00 |
//		|        215 |      66.67 |
//		|        207 |      33.33 |
//		+------------+------------+

	
}

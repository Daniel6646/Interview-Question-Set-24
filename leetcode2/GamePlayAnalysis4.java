package LeetCode2;

public class GamePlayAnalysis4 {

//	
//	Table: Activity
//
//	+--------------+---------+
//	| Column Name  | Type    |
//	+--------------+---------+
//	| player_id    | int     |
//	| device_id    | int     |
//	| event_date   | date    |
//	| games_played | int     |
//	+--------------+---------+
//	(player_id, event_date) is the primary key (combination of columns with unique values) of this table.
//	This table shows the activity of players of some games.
//	Each row is a record of a player who logged in and played a number of games (possibly 0) before logging out on someday using some device.
//	 
//
//	Write a solution to report the fraction of players that logged in again on the day after the day they first logged in, rounded to 2 decimal places. In other words, you need to count the number of players that logged in for at least two consecutive days starting from their first login date, then divide that number by the total number of players.
//
//	The result format is in the following example.
//
//	 
//
//	Example 1:
//
//	Input: 
//	Activity table:
//	+-----------+-----------+------------+--------------+
//	| player_id | device_id | event_date | games_played |
//	+-----------+-----------+------------+--------------+
//	| 1         | 2         | 2016-03-01 | 5            |
//	| 1         | 2         | 2016-03-02 | 6            |
//	| 2         | 3         | 2017-06-25 | 1            |
//	| 3         | 1         | 2016-03-02 | 0            |
//	| 3         | 4         | 2018-07-03 | 5            |
//	+-----------+-----------+------------+--------------+
//	Output: 
//	+-----------+
//	| fraction  |
//	+-----------+
//	| 0.33      |
//	+-----------+
//	Explanation: 
//	Only the player with id 1 logged back in after the first day he had logged in so the answer is 1/3 = 0.33
	
	
	
//	Steps:
//		First Login Date for Each Player
//		Players Logging In on the Day Before Their First Login
//		Fraction of Players Logging In on the Day Before Their First Login
//		Code
//		# Write your MySQL query statement below
//		SELECT ROUND(COUNT(DISTINCT player_id) / (SELECT COUNT(DISTINCT player_id) FROM Activity), 2) as fraction
//		FROM Activity
//		WHERE (player_id, DATE_SUB(event_date, INTERVAL 1 DAY))
//		IN (SELECT player_id, MIN(event_date) AS first_login FROM ACTIVITY GROUP BY player_id)
//		Step 1: Find the First Login Date for Each Player
//		SELECT 
//		    player_id,
//		    MIN(event_date) AS first_login
//		FROM 
//		    Activity
//		GROUP BY 
//		    player_id;
//		Result:
//		+-----------+------------+
//		| player_id | first_login |
//		+-----------+------------+
//		| 1         | 2016-03-01 |
//		| 2         | 2017-06-25 |
//		| 3         | 2016-03-02 |
//		+-----------+------------+
//		Step 2: Identify Players Logging In on the Day Before Their First Login
//		SELECT 
//		    player_id,
//		    DATE_SUB(first_login, INTERVAL 1 DAY) 
//		FROM 
//		    (
//		        -- Subquery: First login date for each player
//		        SELECT 
//		            player_id,
//		            MIN(event_date) AS first_login
//		        FROM 
//		            Activity
//		        GROUP BY 
//		            player_id
//		    ) a;
//		Result:
//		+-----------+------------------------+
//		| player_id | day_after_first_login |
//		+-----------+------------------------+
//		| 1         | 2016-02-29             |
//		| 2         | 2017-06-24             |
//		| 3         | 2016-03-01             |
//		+-----------+------------------------+
//		Step 3: Count the Fraction of Players Logging In on the Day Before Their First Login
//		SELECT 
//		    ROUND(COUNT(DISTINCT player_id) / (SELECT COUNT(DISTINCT player_id) FROM Activity), 2) as fraction
//		FROM 
//		    Activity
//		WHERE 
//		    (player_id, DATE_SUB(event_date, INTERVAL 1 DAY))
//		    IN 
//		    (
//		        -- Subquery: Players and their first login date
//		        SELECT 
//		            player_id,
//		            MIN(event_date) AS first_login
//		        FROM 
//		            Activity
//		        GROUP BY 
//		            player_id
//		    );
//		Result:
//		+-----------+
//		| fraction  |
//		+-----------+
//		| 0.33      |
//		+-----------+

	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		Detailed breakdown of #step 2:
//		Activity Table:
//
//		+-----------+-----------+------------+--------------+
//		| player_id | device_id | event_date | games_played |
//		+-----------+-----------+------------+--------------+
//		| 1         | 2         | 2016-03-01 | 5            |
//		| 1         | 2         | 2016-03-02 | 6            |
//		| 2         | 3         | 2017-06-25 | 1            |
//		| 3         | 1         | 2016-03-02 | 0            |
//		| 3         | 4         | 2018-07-03 | 5            |
//		+-----------+-----------+------------+--------------+
//		To make it even simple, run the query:
//
//		SELECT
//		    a.player_id,
//		    a.event_date,
//		    DATE_SUB(b.first_login, INTERVAL 1 DAY) AS day_before_first_login
//		FROM
//		    Activity a
//		JOIN (
//		    SELECT player_id, MIN(event_date) AS first_login
//		    FROM Activity
//		    GROUP BY player_id
//		) b ON a.player_id = b.player_id;
//		It performs the same thing as:
//
//		WHERE (player_id, DATE_SUB(event_date, INTERVAL 1 DAY))
//		IN (SELECT player_id, MIN(event_date) AS first_login FROM ACTIVITY GROUP 
//		Result:
//
//		+-----------+------------+------------------------+
//		| player_id | event_date | day_before_first_login |
//		+-----------+------------+------------------------+
//		| 1         | 2016-03-01 | 2016-02-29             |
//		| 1         | 2016-03-02 | 2016-03-01             |
//		| 2         | 2017-06-25 | 2017-06-24             |
//		| 3         | 2016-03-02 | 2016-03-01             |
//		| 3         | 2018-07-03 | 2018-07-02             |
//		+-----------+------------+------------------------+
//		Here we can see clearly that when we subtract a day from every first login dates. For player 1 there's a date common in event date and day_before_first_login column. That is 2016-03-01
//
//		Which proves that the player logged in on 2016-03-01 and 2016-03-02, making it two consecutive days.
//
//		Is it necessary to use Date_sub? Can't we use Date_Add?
//
//		If you just replace Date_Sub with Date_Add, it'll fetch you result as 0 because we are grouping by min(event_date) which is 2016-03-01, add 1 to it and you don't have a date to compare.
//
//		What if we remove min(event_date)?
//
//				Steps:
//					First Login Date for Each Player
//					Players Logging In on the Day Before Their First Login
//					Fraction of Players Logging In on the Day Before Their First Login
//					Code
//					# Write your MySQL query statement below
//					SELECT ROUND(COUNT(DISTINCT player_id) / (SELECT COUNT(DISTINCT player_id) FROM Activity), 2) as fraction
//					FROM Activity
//					WHERE (player_id, DATE_SUB(event_date, INTERVAL 1 DAY))
//					IN (SELECT player_id, MIN(event_date) AS first_login FROM ACTIVITY GROUP BY player_id)
//					Step 1: Find the First Login Date for Each Player
//					SELECT 
//					    player_id,
//					    MIN(event_date) AS first_login
//					FROM 
//					    Activity
//					GROUP BY 
//					    player_id;
//					Result:
//					+-----------+------------+
//					| player_id | first_login |
//					+-----------+------------+
//					| 1         | 2016-03-01 |
//					| 2         | 2017-06-25 |
//					| 3         | 2016-03-02 |
//					+-----------+------------+
//					Step 2: Identify Players Logging In on the Day Before Their First Login
//					SELECT 
//					    player_id,
//					    DATE_SUB(first_login, INTERVAL 1 DAY) 
//					FROM 
//					    (
//					        -- Subquery: First login date for each player
//					        SELECT 
//					            player_id,
//					            MIN(event_date) AS first_login
//					        FROM 
//					            Activity
//					        GROUP BY 
//					            player_id
//					    ) a;
//					Result:
//					+-----------+------------------------+
//					| player_id | day_after_first_login |
//					+-----------+------------------------+
//					| 1         | 2016-02-29             |
//					| 2         | 2017-06-24             |
//					| 3         | 2016-03-01             |
//					+-----------+------------------------+
//					Step 3: Count the Fraction of Players Logging In on the Day Before Their First Login
//					SELECT 
//					    ROUND(COUNT(DISTINCT player_id) / (SELECT COUNT(DISTINCT player_id) FROM Activity), 2) as fraction
//					FROM 
//					    Activity
//					WHERE 
//					    (player_id, DATE_SUB(event_date, INTERVAL 1 DAY))
//					    IN 
//					    (
//					        -- Subquery: Players and their first login date
//					        SELECT 
//					            player_id,
//					            MIN(event_date) AS first_login
//					        FROM 
//					            Activity
//					        GROUP BY 
//					            player_id
//					    );
//					Result:
//					+-----------+
//					| fraction  |
//					+-----------+
//					| 0.33      |
//					+-----------+
//					Detailed breakdown of #step 2:
//					Activity Table:
//
//					+-----------+-----------+------------+--------------+
//					| player_id | device_id | event_date | games_played |
//					+-----------+-----------+------------+--------------+
//					| 1         | 2         | 2016-03-01 | 5            |
//					| 1         | 2         | 2016-03-02 | 6            |
//					| 2         | 3         | 2017-06-25 | 1            |
//					| 3         | 1         | 2016-03-02 | 0            |
//					| 3         | 4         | 2018-07-03 | 5            |
//					+-----------+-----------+------------+--------------+
//					To make it even simple, run the query:
//
//					SELECT
//					    a.player_id,
//					    a.event_date,
//					    DATE_SUB(b.first_login, INTERVAL 1 DAY) AS day_before_first_login
//					FROM
//					    Activity a
//					JOIN (
//					    SELECT player_id, MIN(event_date) AS first_login
//					    FROM Activity
//					    GROUP BY player_id
//					) b ON a.player_id = b.player_id;
//					It performs the same thing as:
//
//					WHERE (player_id, DATE_SUB(event_date, INTERVAL 1 DAY))
//					IN (SELECT player_id, MIN(event_date) AS first_login FROM ACTIVITY GROUP 
//					Result:
//
//					+-----------+------------+------------------------+
//					| player_id | event_date | day_before_first_login |
//					+-----------+------------+------------------------+
//					| 1         | 2016-03-01 | 2016-02-29             |
//					| 1         | 2016-03-02 | 2016-03-01             |
//					| 2         | 2017-06-25 | 2017-06-24             |
//					| 3         | 2016-03-02 | 2016-03-01             |
//					| 3         | 2018-07-03 | 2018-07-02             |
//					+-----------+------------+------------------------+
//					Here we can see clearly that when we subtract a day from every first login dates. For player 1 there's a date common in event date and day_before_first_login column. That is 2016-03-01
//
//					Which proves that the player logged in on 2016-03-01 and 2016-03-02, making it two consecutive days.
//
//					Is it necessary to use Date_sub? Can't we use Date_Add?
//
//					If you just replace Date_Sub with Date_Add, it'll fetch you result as 0 because we are grouping by min(event_date) which is 2016-03-01, add 1 to it and you don't have a date to compare.
//
//					What if we remove min(event_date)?
//
	
	
}

package LeetCode2;

public class ExchangingSeatsSQL {


//	Table: Seat
//
//	+-------------+---------+
//	| Column Name | Type    |
//	+-------------+---------+
//	| id          | int     |
//	| student     | varchar |
//	+-------------+---------+
//	id is the primary key (unique value) column for this table.
//	Each row of this table indicates the name and the ID of a student.
//	The ID sequence always starts from 1 and increments continuously.
//	 
//
//	Write a solution to swap the seat id of every two consecutive students. If the number of students is odd, the id of the last student is not swapped.
//
//	Return the result table ordered by id in ascending order.
//
//	The result format is in the following example.
//
//	 
//
//	Example 1:
//
//	Input: 
//	Seat table:
//	+----+---------+
//	| id | student |
//	+----+---------+
//	| 1  | Abbot   |
//	| 2  | Doris   |
//	| 3  | Emerson |
//	| 4  | Green   |
//	| 5  | Jeames  |
//	+----+---------+
//	Output: 
//	+----+---------+
//	| id | student |
//	+----+---------+
//	| 1  | Doris   |
//	| 2  | Abbot   |
//	| 3  | Green   |
//	| 4  | Emerson |
//	| 5  | Jeames  |
//	+----+---------+
//	Explanation: 
//	Note that if the number of students is odd, there is no need to change the last one's seat.

	
	
	
// SOLUTION
	
//	Given that the task specifies dealing with odd and even IDs, we can efficiently separate these scenarios using a CASE WHEN clause.
//
//	For the records where the ID is even, swap the names with the preceding record. This can be achieved using the SQL window function LAG(student) OVER (ORDER BY id) to retrieve the name from the line above.
//
//	For records with an odd ID, swap the names with the subsequent record. Use the window function LEAD(student) OVER (ORDER BY id) to fetch the name from the line below.
//
//	It's important to note that for the last record with an odd ID, there will be no subsequent name to fetch. In such cases, ensure the student's name remains unchanged by using the COALESCE function to default to the original value in the student column when the window function returns null.
//	
	
//	SELECT 
//    id,
//    CASE
//        WHEN id % 2 = 0 THEN LAG(student) OVER(ORDER BY id)
//        ELSE COALESCE(LEAD(student) OVER(ORDER BY id), student)
//    END AS student
//FROM Seat
	
	
}

package LeetCode2;

public class ManagerWit5ReportSQL {

//	Table: Employee
//
//	+-------------+---------+
//	| Column Name | Type    |
//	+-------------+---------+
//	| id          | int     |
//	| name        | varchar |
//	| department  | varchar |
//	| managerId   | int     |
//	+-------------+---------+
//	id is the primary key (column with unique values) for this table.
//	Each row of this table indicates the name of an employee, their department, and the id of their manager.
//	If managerId is null, then the employee does not have a manager.
//	No employee will be the manager of themself.
//	 
//
//	Write a solution to find managers with at least five direct reports.
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
//	Employee table:
//	+-----+-------+------------+-----------+
//	| id  | name  | department | managerId |
//	+-----+-------+------------+-----------+
//	| 101 | John  | A          | null      |
//	| 102 | Dan   | A          | 101       |
//	| 103 | James | A          | 101       |
//	| 104 | Amy   | A          | 101       |
//	| 105 | Anne  | A          | 101       |
//	| 106 | Ron   | B          | 101       |
//	+-----+-------+------------+-----------+
//	Output: 
//	+------+
//	| name |
//	+------+
//	| John |
//	+------+
	
	
// SOLUTION

//	SELECT E1.name
//	FROM Employee E1
//	JOIN (
//	    SELECT managerId, COUNT(*) AS directReports
//	    FROM Employee
//	    GROUP BY managerId
//	    HAVING COUNT(*) >= 5
//	) E2 ON E1.id = E2.managerId;
//	
//	
//	SELECT e.name
//	FROM Employee AS e 
//	INNER JOIN Employee AS m ON e.id=m.managerId 
//	GROUP BY m.managerId 
//	HAVING COUNT(m.managerId) >= 5
//	SELECT name 
//	FROM Employee 
//	WHERE id IN (
//	    SELECT managerId 
//	    FROM Employee 
//	    GROUP BY managerId 
//	    HAVING COUNT(*) >= 5)
//	
//	SELECT a.name 
//	FROM Employee a 
//	JOIN Employee b ON a.id = b.managerId 
//	GROUP BY b.managerId 
//	HAVING COUNT(*) >= 5
//
//	SELECT e1.name
//	FROM employee e1
//	LEFT JOIN employee e2 ON e1.id=e2.managerId
//	GROUP BY e1.id
//	HAVING COUNT(e2.name) >= 5;
//	
	
}

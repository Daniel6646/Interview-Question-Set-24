package LeetCode;

public class ClassesMoreThan5 {

//	Table: Courses
//
//	+-------------+---------+
//	| Column Name | Type    |
//	+-------------+---------+
//	| student     | varchar |
//	| class       | varchar |
//	+-------------+---------+
//	(student, class) is the primary key (combination of columns with unique values) for this table.
//	Each row of this table indicates the name of a student and the class in which they are enrolled.
//	 
//
//	Write a solution to find all the classes that have at least five students.
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
//	Courses table:
//	+---------+----------+
//	| student | class    |
//	+---------+----------+
//	| A       | Math     |
//	| B       | English  |
//	| C       | Math     |
//	| D       | Biology  |
//	| E       | Math     |
//	| F       | Computer |
//	| G       | Math     |
//	| H       | Math     |
//	| I       | Math     |
//	+---------+----------+
//	Output: 
//	+---------+
//	| class   |
//	+---------+
//	| Math    |
//	+---------+
//	Explanation: 
//	- Math has 6 students, so we include it.
//	- English has 1 student, so we do not include it.
//	- Biology has 1 student, so we do not include it.
//	- Computer has 1 student, so we do not include it.


//	In SQL, the GROUP BY clause combines similar rows into a single result row for each group of rows that have the same values. It's one of the most frequently used SQL clauses and is often used with aggregations to show one value per grouped field or combination of fields

//	Eg:
//Find the top ten countries with the highest number of Unicorn companies
// Find the average price per unit, the total number of orders, and the total gain for each product line
// Filter for the total number of orders higher than 40,000
// Find the number of customers in each country 
// The GROUP BY statement is often used with aggregate functions, such as: COUNT(), MAX(), MIN(), SUM(), and AVG()

// Group by is one of the most frequently used SQL clauses. It allows you to collapse a field into its distinct values. This clause is most often used with aggregations to show one value per grouped field or combination of fields.	
	
	// SOLUTION***
//	SELECT class 
//	FROM Courses 
//	GROUP BY class
//	HAVING  COUNT(student)>=5;
	
}

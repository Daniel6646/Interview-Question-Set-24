package HackerRankSQL;

public class Placements {


//	You are given three tables: Students, Friends and Packages. Students contains two columns: ID and Name. Friends contains two columns: ID and Friend_ID (ID of the ONLY best friend). Packages contains two columns: ID and Salary (offered salary in $ thousands per month).

//Write a query to output the names of those students whose best friends got offered a higher salary than them. Names must be ordered by the salary amount offered to the best friends. It is guaranteed that no two students got same salary offer.
	
	
//	SELECT 
//    s.Name
//FROM 
//    Students AS s
//JOIN 
//    Friends AS f ON s.ID = f.ID
//JOIN 
//    Packages AS p ON s.ID = p.ID
//JOIN 
//    Packages AS pf ON f.Friend_ID = pf.ID
//WHERE pf.Salary > p.Salary
//ORDER BY pf.Salary;

	
}

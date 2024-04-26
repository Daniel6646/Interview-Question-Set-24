package LeetCode;

public class CustomerWhoNeverOrderSQL {

//	SELECT c.name as Customers
//	FROM Customers c LEFT JOIN Orders o
//	ON c.id=o.customerId 
//	WHERE o.customerId IS NULL;


//	SELECT name as Customers
//	from Customers
//	where id not in (
//	    select customerId
//	    from Orders
//	);
	
}

package LeetCode;

public class AddStrings {


// Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

// You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

 

// Example 1:

// Input: num1 = "11", num2 = "123"
// Output: "134"
// Example 2:

// Input: num1 = "456", num2 = "77"
// Output: "533"
// Example 3:

// Input: num1 = "0", num2 = "0"
// Output: "0"
 

// Constraints:

// 1 <= num1.length, num2.length <= 104
// num1 and num2 consist of only digits.
// num1 and num2 don't have any leading zeros except for the zero itself.


	
	  public String addStrings(String num1, String num2) {
	     
		  
		  int n1 = Integer.parseInt(num1);
		  int n2 = Integer.parseInt(num2);
		  int n3 = n1 + n2;
		  String result = String.valueOf(n3);
		  
		  return result;
	    }
	  
  public String addStrings2(String num1, String num2) {
	     
		  
		long n1 = Long.parseLong(num1);
		long n2 = Long.parseLong(num2);
		long n3 = n1 + n2;
		  String result = String.valueOf(n3);
		  
		  return result;
	    }
 public String addStrings3(String num1, String num2) {
	     
	  BigInteger bg1 = new BigInteger(num1);
	  BigInteger bg2 = new BigInteger(num2);
			  
	 return bg1.add(bg2).toString();

	   }
	
}

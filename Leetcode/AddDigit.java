package LeetCode;

public class AddDigit {

//	Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
//
//			 
//
//			Example 1:
//
//			Input: num = 38
//			Output: 2
//			Explanation: The process is
//			38 --> 3 + 8 --> 11
//			11 --> 1 + 1 --> 2 
//			Since 2 has only one digit, return it.
//			Example 2:
//
//			Input: num = 0
//			Output: 0
//			 
//
//			Constraints:
//
//			0 <= num <= 231 - 1
//			 
//
//			Follow up: Could you do it without any loop/recursion in O(1) runtime?
//

	
	public static void main(String[] args) {
		
		int num1 =38, num2 = 0;
		int result = addDigit(num1);
		System.out.println("Final output "+result);
	}
	
	
	public static int addDigit(int num) {
		
		int digit, sum = 0;
		boolean flag = false;
		
		while(flag != true) {
		
//		while (number != 0) {
//		
//			digit = number % 10;
//			sum = sum + digit;
//			number = number / 10;
//				
//		}
		
		 sum = calculateSum(num);
			
		if(sum < 10) {
			
			flag =  true;
			break;
		}
		
		else {
			
			num = sum;
			
		}
	
		}
		
		return sum;
	}
	
	
	public static int calculateSum( int number) {
		
		int sum =0, digit =0;
		
		while (number != 0) {
		
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;
				
			
		}
		return sum;
	}
	
	
	
}

package LeetCode;

public class PerfectSquare {

//	Given a positive integer num, return true if num is a perfect square or false otherwise.
//
//			A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
//
//			You must not use any built-in library function, such as sqrt.
//
//			 
//
//			Example 1:
//
//			Input: num = 16
//			Output: true
//			Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
//			Example 2:
//
//			Input: num = 14
//			Output: false
//			Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
//			 
//
//			Constraints:
//
//			1 <= num <= 231 
	
	public boolean isPerfectSquare(int num) {
		
		int start = 0;
		int end = num;
		
		boolean flag = false;
	
		while(start <= end) {
			
			long mid = start + (end - start) /2;
			long squareofMid = mid * mid;
			
			if(num == squareofMid) {
				
				return flag = true;
			}
			
			else if( squareofMid > num) {
				
			end =(int) mid - 1;
			}
			
			else {
				
			start = (int) mid + 1;	
			}
			
		}
		return flag;
		
	}
	
	public boolean isPerfectSquare2(int num) {  
		
		double mid = Math.sqrt(num);
		int midValue = (int) mid;
		boolean flag = false;
		
		if(midValue * midValue == num) {
			
			return flag = true;
		}
		
		return flag;
	}
	
	
}

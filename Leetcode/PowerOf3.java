package LeetCode;

public class PowerOf3 {

	
//	Given an integer n, return true if it is a power of three. Otherwise, return false.
//
//			An integer n is a power of three, if there exists an integer x such that n == 3x.
//
//			 
//
//			Example 1:
//
//			Input: n = 27
//			Output: true
//			Explanation: 27 = 33
//			Example 2:
//
//			Input: n = 0
//			Output: false
//			Explanation: There is no x where 3x = 0.
//			Example 3:
//
//			Input: n = -1
//			Output: false
//			Explanation: There is no x where 3x = (-1).
//			 
	
	
	
	public boolean isPowerOfThree2(int n) {
    
			boolean flag = true;
			
			if (n == -1 || n == 0) {
				
				return flag = false;
			}
			
			if(n % 3 != 0) {
				
				flag = false;
			}
			return flag;

    }
	
	
// recursive solution keep checking till we get n==1 then we return true	
	public boolean isPowerOfThree(int n) {
		
		if(n ==1) {
			
			return true;
		}
		
		else if( n%3 == 0 && n !=0) {
			
			n = n /3;
			
		return isPowerOfThree(n);
		
		}
		return false;
	}
	
	
//	public boolean isPowerOfThree(int n) {
//        if(n <= 0) return false;
//
//        while(n % 3 == 0) {
//            
//  	   n /= 3;
//        }
//
//        return n == 1;
//    }
	
}

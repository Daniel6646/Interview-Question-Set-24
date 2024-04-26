package LeetCode;

public class PowerOf2 {

	
//	Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//			An integer n is a power of two, if there exists an integer x such that n == 2x.
//
//			 
//
//			Example 1:
//
//			Input: n = 1
//			Output: true
//			Explanation: 20 = 1
//			Example 2:
//
//			Input: n = 16
//			Output: true
//			Explanation: 24 = 16
//			Example 3:
//
//			Input: n = 3
//			Output: false
//			 
	
	
	
	public static void main(String[] args) {
		
		boolean result = isPowerOfTwo(16);
		boolean result1 = isPowerOfTwo(3);
		boolean result2 = isPowerOfTwo(1);
	
	}
	
	
	  public static boolean isPowerOfTwo(int n) {     
		  
		  if(n == 1)
	        return true;
      
	      else if(n <= 0)
	       return false;
	      
	        while(n > 1){
	       
	          if(n % 2 == 0) {
	            n = n / 2;
	          
	          }
	      
	          else {
	            return false;
	          
	          }
	        
	        }
	        return true;
	    }

}
	  
	
package LeetCode;

public class PowerOf4 {

//	Given an integer n, return true if it is a power of four. Otherwise, return false.
//
//			An integer n is a power of four, if there exists an integer x such that n == 4x.
//
//			 
//
//			Example 1:
//
//			Input: n = 16
//			Output: true
//			Example 2:
//
//			Input: n = 5
//			Output: false
//			Example 3:
//
//			Input: n = 1
//			Output: true
//			 
//
//			Constraints:
//
//			-231 <= n <= 231 - 1
//			 
	
	public boolean isPowerOfFour(int n) {
		
		if( n == 1) {
			
			return true;
		}
		
		while( n%4 == 0 & n != 0) {
			
			n = n/4;
			return isPowerOfFour(n);
		}
		
		return false;
		
	}

	
	//using while loop
	public boolean isPowerOfFour2(int n) { 
	
//  for eg n = 16		
// % is modulus operator and / is division operator
// remember MR AND DQ M-modules remainder & dq - division quotient i.e top of when we divide 2 numbers
//  if n % 4 == 0 means if 16 % 4 i.e [ 0 in remainder, 4 in quotient ] so while conditon true
// then check n = n / 4 i.e quotient 4/4 = 1 as 4 x1 so then we check if n ==1 if true means it is divisible else it is not 
		
		
		
		if(n <=0) {
			return false;
		}
		
		while (n % 4 == 0) {
			
			n = n / 4;
		}
		
		return n ==1;
	}
	
}

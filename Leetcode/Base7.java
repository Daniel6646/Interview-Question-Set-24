package LeetCode;

import java.math.BigInteger;

//Given an integer num, return a string of its base 7 representation.
//
//		 
//
//Example 1:
//
//Input: num = 100
//Output: "202"
//Example 2:
//
//Input: num = -7
//Output: "-10"
// 
//
//Constraints:
//
//-107 <= num <= 107



public class Base7 {

	public String convertToBase7(int num) {
        
		BigInteger m = new BigInteger(""+num);
        
        return m.toString(7);  
	
	}
	
}

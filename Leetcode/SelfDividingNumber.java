package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {

	
//	A self-dividing number is a number that is divisible by every digit it contains.
//
//	For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
//	A self-dividing number is not allowed to contain the digit zero.
//
//	Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
//
//	 
//
//	Example 1:
//
//	Input: left = 1, right = 22
//	Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
//	Example 2:
//
//	Input: left = 47, right = 85
//	Output: [48,55,66,77]
//	 
//
//	Constraints:
//
//	1 <= left <= right <= 104

	
	public List<Integer> selfDividingNumbers(int left, int right) {
    
		List<Integer> arrayList = new ArrayList<>();
		
		for(int i = left; i<=right; i++) {
		
		if(divisibleNumber(i)) {
			
			arrayList.add(i);	
		  }
	     		
		}
		return arrayList;
    }

	
	public boolean divisibleNumber(int n) {
		
		// because we need one element at a time in number to later divide it by entire number sent in method i.e int n above.
		int number = n; 
		
		while (number > 0) {
			
			int temp =	number % 10;
			
			//if last element is 0 false as it cannot divide orignal number
			if(temp == 0) {
				return false;
			}
			
			//if entire number divided by last number for eg 12%2 then 12%1
			if( n % temp != 0 )  {
				
				return false;
			}
			
			number = number / 10;
			
		}
		return true;
	}
	
}

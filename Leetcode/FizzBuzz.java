package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

//	Example 1:
//
//		Input: n = 3
//		Output: ["1","2","Fizz"]
//		Example 2:
//
//		Input: n = 5
//		Output: ["1","2","Fizz","4","Buzz"]
//		Example 3:
//
//		Input: n = 15
//		Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
//		 
	
	
	
	public List<String> fizzBuzz(int n ) {
		
		List<String> resultantList = new ArrayList<>();
		String answer = "";
		
		for(int i=1;i<=n;i++) {
			
			if( i%3 == 0 && i%5 == 0 ) {
				
			  answer = "FizzBuzz";
			}
			else if ( i%3 ==0   ) {
			
				answer = "Fizz";
			}
			else if ( i%5 == 0 ) {
				
				answer = "Buzz";
			}
			
			else {
				
			answer = String.valueOf(i);
			}
			
			resultantList.add(answer);
		}
		return resultantList;
	}
	
}

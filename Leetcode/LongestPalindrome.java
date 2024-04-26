package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

//	Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
//
//			Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
//
//			 
//
//			Example 1:
//
//			Input: s = "abccccdd"
//			Output: 7
//			Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
//			Example 2:
//
//			Input: s = "a"
//			Output: 1
//			Explanation: The longest palindrome that can be built is "a", whose length is 1.
//			 
	
	
	public int longestPalindrome(String s) {
    
		int oddCount = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch: s.toCharArray()) {
			
			map.put(ch, map.getOrDefault(ch, 0)+1);
		
		
			if(map.get(ch) % 2 ==1) {
				
				//if we get numbers count like 1,3,5 simply means they are nor equally repeating like 2,4,6 for it to form palindrome
				oddCount++;
			}
			
			else {
				
				oddCount--;
			}
		
		}
	
		
		// if odd elements found then we need only one element in middle that is unique to form a palindrome thats why we do -oddcount+1 means oddcount if it is 2 then -1 is 1 ie means now we have wil repeating chars with one unique element and then we return its lenght
		//refer examples given below
		// simply means if count evenly non-repeating charcs count is 
		if(oddCount > 1) {
			
			return s.length()-oddCount+1;
		}
		return s.length();
    }
	
}

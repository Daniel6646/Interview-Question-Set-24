package LeetCode;

import java.util.Arrays;

//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
// 
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 


public class LongestPrefix {

	 public String longestCommonPrefix(String[] strs) {
	     
		 int idx = 0;
		 
		 Arrays.sort(strs);
		 
		 String s1 = strs[0];
		 String s2 = strs[strs.length-1];
		 
		 
		 while (idx < s1.length()) {
			 
			 if(s1.charAt(idx) == s2.charAt(idx) ) {
				 
				 idx++;
				
			 }
			 
			 else {
				 
				 break;
				 
			 }
		 }
		 
		 return s1.substring(0, idx);
		 
	    }
	
}

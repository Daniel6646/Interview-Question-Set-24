package LeetCode;

public class ValidPalindrome2 {

//	Given a string s, return true if the s can be palindrome after deleting at most one character from it.
//
//			 
//
//			Example 1:
//
//			Input: s = "aba"
//			Output: true
//			Example 2:
//
//			Input: s = "abca"
//			Output: true
//			Explanation: You could delete the character 'c'.
//			Example 3:
//
//			Input: s = "abc"
//			Output: false
//			 
//
//			Constraints:
	
	
	 public boolean validPalindrome(String s) {
	     
		 int low = 0;
		 int high = s.length()-1;
		 int count1 = 0, count2 = 0;
		 
		 while(low < high) {
			 
			 if(s.charAt(low) == s.charAt(high)) {
				 
				 low++;
				 high--;
				 
			 }
			 
			 else {
				 
				 low++;
				 count1++;
				 
			 }
			 
		 }
		 
		 low = 0; high = 0;
		 
		 while (low < high) {
			 
			 if(s.charAt(low) == s.charAt(high)) {
				 
				 low++;
				 high--;
			 }
			 
			 else {
				 
				 high--;
				 count2++;
			 }
		 }
		 
		 
		 if(count1 ==0 || count1 ==1 || count2 ==0 || count2 ==1) {
			 
			 return true;
		 }
		 
		 return false;
		 
		 
	    }
	
}

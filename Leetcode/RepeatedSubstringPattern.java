package LeetCode;

public class RepeatedSubstringPattern {

//	Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
//
//	 
//
//	Example 1:
//
//	Input: s = "abab"
//	Output: true
//	Explanation: It is the substring "ab" twice.
//	Example 2:
//
//	Input: s = "aba"
//	Output: false
//	Example 3:
//
//	Input: s = "abcabcabcabc"
//	Output: true
//	Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
//	 
//
//	Constraints:
//
//	1 <= s.length <= 104
//	s consists of lowercase English letters.

	
	
	
	 public boolean repeatedSubstringPattern2(String s) {
	        
		int halfLenght =  s.length()/2;
		char stringarray[] =  s.toCharArray(); 
		char s1 , s2 ;
		String charString1 = "", charString2 = "";
		boolean flag = false;
		
		for(int i=0;i<halfLenght;i++) {
			
		 s1 = stringarray[i];
		 charString1 += s1;	
		}
		
		
		for(int i=halfLenght; i<s.length();i++) {
			
			s2 = stringarray[i];
			charString2 += s2;
		}
		
		if(charString1.equals(charString2)) {
			
			flag = true;
		}
		
		
		return flag; 
		
	    }
	
	 
	    public boolean repeatedSubstringPattern(String s) {
	    	
	        String doubled = s + s;
	        String sub = doubled.substring(1, doubled.length() - 1);
	        return sub.contains(s);
	    }
		
}

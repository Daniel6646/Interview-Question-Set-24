package LeetCode2;

public class BacksspaceStringCompar {

//	Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
//
//			Note that after backspacing an empty text, the text will continue empty.
//
//
//			Example 1:
//
//			Input: s = "ab#c", t = "ad#c"
//			Output: true
//			Explanation: Both s and t become "ac".
//			Example 2:
//
//			Input: s = "ab##", t = "c#d#"
//			Output: true
//			Explanation: Both s and t become "".
//			Example 3:
//
//			Input: s = "a#c", t = "b"
//			Output: false
//			Explanation: s becomes "c" while t becomes "b".
//			 
//
//			Constraints:
//
//			1 <= s.length, t.length <= 200
//			s and t only contain lowercase letters and '#' characters.
//			 
	
	
	  public boolean backspaceCompare(String S, String T) {

		  char[] sChars = S.toCharArray();
	       char[] tChars = T.toCharArray();
	        
	        int k = processString(sChars);
	        int p = processString(tChars);

	        if (k != p) 
	        return false;

	        for (int i = 0; i < k; i++) {
	            
	        	if (sChars[i] != tChars[i]) 
	        		return false;
	        
	        }

	        return true;
	    }

	    private int processString(char[] chars) {
	        int k = 0;
	     
	        for (char c : chars) {
	        
	        	if (c != '#') {
	                chars[k++] = c;
	            } 
	        	
	        	else if (k > 0) {
	            
	        		k--;
	            }
	        	
	        }
	        return k;
	    }
	
	
}

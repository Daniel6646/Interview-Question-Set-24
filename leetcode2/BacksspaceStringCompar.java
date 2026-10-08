package LeetCode2;

import java.util.Arrays;

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

//	        char str1 [] = processString(sChars);
//	        char str2[] = processString(tChars);

	        
	        // return char array above 
	        //below create new string of that char and check if it is equal or not
	        
//	        String str1 = new String(tChars);
//	        String str2 = new String(tChars);

	        
//  		if(str1.length() != str2.length) return false; 

	        //str1.toLowerCase();
	        //str2.toLowerCase();

//	        if(str1.equals(str2)) {
//	        	
//	        	return true;
//	        }
//	        
//	        return false;
	        
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
	     //String str = "";
	        for (char c : chars) {
	        
	        	if (c != '#') {
	                chars[k++] = c;
	               // str += c;
	            } 
	        	
	        	else if (k > 0) {
	            
	        		k--;
	            }
	        	
	        }
//	        String str = new String(chars);
//	        return string and check if both strings are equal
	        return k;
	    }

	    
		public boolean backspaceCompare2(String S, String T) {

			char[] sChars = S.toCharArray();
			char[] tChars = T.toCharArray();

			String str1 = processString2(sChars);
			String str2 = processString2(tChars);

			if (str1.length() != str2.length())
				return false;

			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();

			if (str1.equals(str2)) {

				return true;
			}

			return false;
		}

	    
	    private String processString2(char[] chars) {
	        int k = 0;
	     //String str = "";
	        for (char c : chars) {
	        
	        	if (c != '#') {
	                chars[k++] = c;
	               // str += c;
	            } 
	        	
	        	//if # go one step back that is replace last charac
	        	else if (k > 0) {
	            
	        		k--;
	            }
	        	
	        }
	        //after processing char arr will have value
	        //chars = [a, c, #, c]

	       return new String(chars, 0, k);
	        
	        //	        return string and check if both strings are equal
	        //return chars;
	    }
	
}

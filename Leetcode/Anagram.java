package LeetCode;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		
	}
	
	public boolean isAnagram(String s, String t) {
        
	String string1 = "", string2 = "";	
		
    if(s.length() ==0 || t.length() == 0) {
    	
    	return false;
    }
		
    char charS[] = s.toCharArray();
    char charT[] = t.toCharArray();
	
	Arrays.sort(charT);
	Arrays.sort(charS);
	
	for(int i=0; i<charT.length;i++) {
	
		string1 = string1 + charT[i];
		
	}
	
	
	for(int i=0; i<charS.length;i++) {
		
		string2 = string2 + charS[i];
		
	}
	
	string1 = string1.toLowerCase();
	string2 =  string2.toLowerCase();
	
	if(string1.equals(string2)) {
		
		return true;
	}
	
	return false;
	
	}
	
	
	
	public boolean isAnagram2(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
	
	
	
}

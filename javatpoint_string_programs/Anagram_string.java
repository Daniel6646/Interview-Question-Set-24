package javatpoint_string_programs;

import java.util.Arrays;

public class Anagram_string {

	public static void main(String[] args) {
		
		anagramString();
	}
	
	public static void anagramString () {
		
		String str1="Brag";  
        String str2="Grab";  
        
        str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
	
	if(str1.length() != str2.length()) {
		
		System.out.println("This string is not a Anagram");
	}
	
	else {
		
	char str1Char[] = str1.toCharArray();
	char str2Char[] = str2.toCharArray();
		
	Arrays.sort(str1Char);
	Arrays.sort(str2Char);
	
	if(Arrays.equals(str1Char, str2Char) == true ) {
		
		System.out.println("The string is a anagram");
	}
	else {
		
		System.out.println("The string is not a anagram");
	}
	
	
	}
	
	
	}
	
	
	
}

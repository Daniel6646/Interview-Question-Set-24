package LeetCode;

public class LenghtOfLastWord {

	
//	Example 1:
//
//		Input: s = "Hello World"
//		Output: 5
//		Explanation: The last word is "World" with length 5.
//		Example 2:
//
//		Input: s = "   fly me   to   the moon  "
//		Output: 4
//		Explanation: The last word is "moon" with length 4.
//		Example 3:
//
//		Input: s = "luffy is still joyboy"
//		Output: 6
//		Explanation: The last word is "joyboy" with length 6.
//		 
	
	
	public static void main(String[] args) {
		
	String s1 = "Hello World";	
	String s2 = "   fly me   to   the moon  ";	
	String s3 = "luffy is still joyboy";	
	int countOfLastWord = lengthOfLastWord(s3);
	System.out.println("Lenght of last word in the string::  "+countOfLastWord);
	}
	
	 public static int lengthOfLastWord(String s) {
	        
		 
		String words[] = s.split(" ");
		String lastWord =words[words.length-1];
		int lengthOfLastWord = lastWord.length();
		
		return lengthOfLastWord;
	    }
	
}

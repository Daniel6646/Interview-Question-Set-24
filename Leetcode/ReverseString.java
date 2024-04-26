package LeetCode;

public class ReverseString {

	
//	Write a function that reverses a string. The input string is given as an array of characters s.
//
//	You must do this by modifying the input array in-place with O(1) extra memory.
//
//	 
//
//	Example 1:
//
//	Input: s = ["h","e","l","l","o"]
//	Output: ["o","l","l","e","h"]
//	Example 2:
//
//	Input: s = ["H","a","n","n","a","h"]
//	Output: ["h","a","n","n","a","H"]
//	 
//
//	Constraints:
//
//	1 <= s.length <= 105
//	s[i] is a printable ascii character.
	
	public static void main(String[] args) {
		
		char c1[] =new char [] {'h','e','l','l','o'};
	
		reverseString(c1);
	}
	
	 public static void reverseString(char[] s) {
		 
		 for(int i=0, j= s.length-1; i< s.length/2; i++, j--) {
			 
			 char temp = s[i];
			 
			 s[i] = s[j];
			 
			 s[j] = temp;
			 
		 }
		 
		 
		 
	 }
	
	
	 public static void reverseString2(char[] s) {
	     
		 char reverseString[] = new char[s.length] ; 
		 int b =0;
		 
		 for(int i =s.length-1;i>=0; i--) {
			 
			 reverseString[b] = s[i];
			 ++b;
		 }
		 
	System.out.println("reverse characters of a string");
	
	for(int i =0;i<reverseString.length; i++) {
		
		System.out.print(reverseString[i]);
	}
		 
	    }

	 
	 public static void reverseString3(char[] s) {
		 
		 int i =0;
		 int j = s.length-1;
		 
		 
		 while(i<j) {
			 
			 char temp = s[i];
			 s[i] = s[j];
			 s[j] = temp;
			 i++;
			 j--;
		 }
		 
	 }
	 
	 
}

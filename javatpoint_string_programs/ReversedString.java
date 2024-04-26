package javatpoint_string_programs;

import java.util.Scanner;

public class ReversedString {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter a string to get its reverse");
		String stringForReverse = scan.next();
		String revString = reverseOfString(stringForReverse);
		System.out.println("Reverse of a string is:: "+revString);
	}
	
	
	public static String reverseOfString( String str) {
		
		String reverse = "";
		
		for(int i=str.length()-1; i>=0;i--) {
			
			reverse = reverse + str.charAt(i);
		}
		
		return reverse;
	}
	
}

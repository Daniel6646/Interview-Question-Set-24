package Javatpoint_Basic_Programs;

import java.util.Scanner;

public class palindromeNumber {

	
	public static boolean palindromeOrNot(int number) {
		
		boolean flag = false;
		int sum = 0;
		int numToCheck = number;
		
		while (numToCheck >0) {
			
		int lastDigit = numToCheck % 10;
		sum = (sum * 10) + lastDigit;
		numToCheck = numToCheck / 10;
		
		}
		
		if( number == sum ) {
			
			flag = true;
		}
		
		return flag;
	} 
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it palindrome or not");
		int number = scan.nextInt();
		boolean flag = palindromeOrNot(number);
	
		if (flag == true) {
			
			System.out.println(number + " is a palindrome number");
		}
		
		else {
			System.out.println(number + " is not a palindrome number");

			
		}
	}
	
}

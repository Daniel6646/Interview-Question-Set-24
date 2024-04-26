package javatpoint_Number_Programs;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to get revese of a number");
		int inputNumber =  scan.nextInt();
		int reverseNumber = reverseOfANumber(inputNumber);
		System.out.println("Reverse of number"+inputNumber+ "is "+reverseNumber  );
	}
	
	
	public static int reverseOfANumber (int num) {
		
		int reverse = 0, lastDigit = 0;
		
		while (num > 0) {
			
		 lastDigit= num % 10;
		 reverse = (reverse * 10)  +lastDigit;
		 num = num / 10;
	
		}
	
		return reverse;
	}
	
	
	
}

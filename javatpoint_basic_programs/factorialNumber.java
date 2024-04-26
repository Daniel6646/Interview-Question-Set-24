package Javatpoint_Basic_Programs;

import java.util.Scanner;

public class factorialNumber {

	
	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial");
		int number = scanner.nextInt();
		int factorial =  calculateFactorialNumber(number);
		System.out.println("factorial of number is: "+factorial);
		
	}
	
	
	
	public static int calculateFactorialNumber (int number ) {
		
		int factorial = 1;
		
		for(int i =1 ; i<=number; i++) {
				
			factorial = factorial * i;
			
		}
		
		
		return factorial;
	}
	
	
}

package Javatpoint_Basic_Programs;

import java.util.Scanner;

public class prime_Number {

	public static int checkPrimeNumber(int number) {
	
	int flag = 0 ;
	int m = number / 2;
	
		for (int i=2; i<m ; i++) {
		
			if(number % i == 0) {
				
				flag = 1; // divisible by other than 1 or 3 so not prime
				break;
			}
			
			else {
				
				flag = 0; // not divisible by othee
			}
			
		}
		
		return flag;
		
	}
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check for prime number");
		int userInput = scanner.nextInt();
		
		int flag = checkPrimeNumber(userInput );
		
		if(flag == 1) {
			
			System.out.println(userInput+ " is not a prime number ");
			
		}
		
		else if (flag == 0){
			
			System.out.println(userInput+ " is  a prime number ");

		}
		
	}
	
	 
	
}

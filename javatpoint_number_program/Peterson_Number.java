package javatpoint_Number_Programs;

import java.util.Scanner;

public class Peterson_Number {

// A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is peterson number");
		int numberToCheck = scan.nextInt();
		int peterSonNo =  petersonNumber(numberToCheck);
		
		if(numberToCheck == peterSonNo) {
			
			System.out.println(numberToCheck +" is a peterson number");
		}
		
		else {
			
			System.out.println(numberToCheck +" is not a peterson number");

		}
		
	}
	
	
	public static int petersonNumber(int num) {
		
		int sum = 0;
		
		while (num != 0) {
			
			int lastDigit = num %10;
			sum += factorial(lastDigit);
			num = num / 10;
		}
		System.out.println("Sum in peterson number"+sum);

		return sum;
	}
	
	public static int factorial ( int number) {
		
		int  factorial =1;
		
		for(int i = 1; i<number; i++) {
			
			factorial += factorial * i;
		}
		System.out.println("sum of factorial of a digit"+factorial);
		return factorial;
	}
	
}

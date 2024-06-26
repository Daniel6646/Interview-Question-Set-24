package javatpoint_Number_Programs;

import java.util.Scanner;

public class Neon_Number {

//A positive integer whose sum of digits of its square is equal to the number itself is called a neon number	
	
// 9 square = 81 so 8+1 = 9 so neon number	
	
	public static void main(String args[]) {
		
		int sum = 0, n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		// raeds an integer from the user
		n = sc.nextInt();
		// calculate square of the given number
		int square = n * n;
		// loop executes until the condition becomes false
		while (square != 0) {
			// find the last digit of the square
			int digit = square % 10;
			// adds digits to the variable sum
			sum = sum + digit;
			// removes the last digit of the variable square
			square = square / 10;
		}
		// compares the given number (n) with sum
		if (n == sum)
			System.out.println(n + " is a Neon Number.");
		else
			System.out.println(n + " is not a Neon Number.");
	}

}

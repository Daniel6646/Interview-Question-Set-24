package javatpoint_Number_Programs;

import java.util.Scanner;

public class Swap_Using_BitWise {

	public static void main(String args[]) {
		
//		Step 1: Binary equivalent of the variables X and Y are:
//
//			X = 5 = 0101 and Y = 9 = 1001
//
//			Step 2: Find X = X ^ Y.
//
//			Java Program to Swap Two Numbers Using Bitwise Operator
//			Step 2: Find Y = X ^ Y.
//
//			Java Program to Swap Two Numbers Using Bitwise Operator
//			Step 3: Find X = X ^ Y.
//
//			Java Program to Swap Two Numbers Using Bitwise Operator
//			We see that the variable X contains 1001 which is equivalent to 9 and Y contains 0101 which is equivalent to 5. Therefore, the variables X and Y are swapped		
//		
		int a, b;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		a = scanner.nextInt();
		System.out.print("Enter the second number: ");
		b = scanner.nextInt();
		System.out.println("Before swapping:");
		System.out.println("a = " + a + ", b = " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping:");
		System.out.print("a = " + a + ", b = " + b);
	}

}

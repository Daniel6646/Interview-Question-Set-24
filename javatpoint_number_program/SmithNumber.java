package javatpoint_Number_Programs;

import java.util.Scanner;

public class SmithNumber {

//	A Smith number is a composite number whose sum of digits equals to the sum of digits of its prime factors, excluding 1. It is also known as a joke number
//	
//	Example 1: Suppose, we want to check the number 85 is smith or not.
//	Sum of digits = 8 + 5 = 13
//
//	Prime factors of 85 is: 5,17
//
//	Sum of digits of its prime factors = 5 + 1+ 7 = 13
//
//	Compare the sum of digits with the sum of digits of its prime factors i.e. 13=13. Both are equal. Hence, the given number (85) is a smith number.
//
//	Example 2: Let's check another number 999 is smith or not.
//
//	Sum of digits = 9+ 9+9 = 27
//	
//			Prime factors of 999 is: 3×3×3,37
//
//			Sum of digits of its prime factors = 3+3+3+3+7 =19
//
//			Compare the sum of digits with the sum of digits of its prime factors i.e. 27≠19. Hence, the given number (999) is not a smith number.
//	


	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if its smith number or not: ");
		// reads an integer from the user
		int n = sc.nextInt();
		// calling the user-defined function that finds the sum of digits of the given
		// number
		int a = findSumOfDigit(n);
		// calling the user-defined function that finds the sum of prime factors
		int b = findSumPrimeFactors(n);
		System.out.println("Sum of Digits of the given number is = " + a);
		System.out.println("Sum of digits of its prime factors is = " + b);
		// compare both the sums
		if (a == b)
			// prints if above condition returns true
			System.out.print("The given number is a smith number.");
		// prints if above condition returns false
		else
			System.out.print("The given number is not a smith number.");
	}

	static int findSumOfDigit(int n) {
		// stores the sum
		int s = 0;
		while (n > 0) {
			// finds the last digit of the number and add it to the variable s
			s = s + n % 10;
			// removes the last digit from the given number
			n = n / 10;
		}
		// returns the sum of digits of the number
		return s;
	}

	static boolean isPrime(int k) {

		boolean flag = true;
		int no = 2;

		// math.sqrt returns the correctly round sqrt of a double value
		while (no < Math.sqrt(k)) {

			// if divided by a no other than 1 or itself not prime so return false
			if (k % no == 0) {

				flag = false;
			}

			no++;

		}
		return flag;
	}

	static int findSumPrimeFactors(int n) {

		int i = 2, sum = 0;

		while (n > 1) {

			if (n % i == 0) {

				sum = sum + findSumOfDigit(i);
				n = n / i;
			} else {

				do {
					i++;
				}

				while (!isPrime(i));
			}
		}
		// returns the sum of digits of prime factors
		return sum;
	}

}

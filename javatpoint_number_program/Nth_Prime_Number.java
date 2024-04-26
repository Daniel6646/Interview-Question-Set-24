package javatpoint_Number_Programs;

import java.util.Scanner;

public class Nth_Prime_Number {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check its nth prime number");
		int n = scan.nextInt();
		int nthPrmNo =  nThPrimeNumber(n);
		System.out.println("The " +n +"th prime number is: " + nthPrmNo);  

	}

	public static int nThPrimeNumber(int number) {

		int num = 1, count = 0,i=2;

		while (count < number ) {

			num = num + 1;

			for ( i = 2; i <= num; i++) {

				if (num % i == 0) {
					
					//break if divisble then check if both no are same as prime only dicisible by one and itself
					break;
				}
			}
				if (i == num) {
					// means 2=2 3=3 5=5 means it is prime while loop will work till number == count means if her count is 3 and nth prime no they ask is 3 then stop and return the number
					count++;
				}

		}

		return num;

	}
}

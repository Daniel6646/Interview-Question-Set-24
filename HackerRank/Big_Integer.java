package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class Big_Integer {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);

		BigInteger numOne = scanner.nextBigInteger();
		BigInteger numTwo = scanner.nextBigInteger();

		System.out.println(numOne.add(numTwo));
		System.out.println(numOne.multiply(numTwo));
	
	}

}

/*
 * Sample Input
 * 
 * 1234 20
 * 
 * Sample Output
 * 
 * 1254 24680
 * 
 * Explanation 
 * 1234 +20 = 1254 
 * 1234 *20 = 24680
 * 
 * 
 * 
 */
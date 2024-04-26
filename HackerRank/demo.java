package HackerRank;

import java.util.Scanner;

public class demo {

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
//reading an integer from the user  
		int n = sc.nextInt();
		if (isEmirp(n) == true)   //17,13,37,79 prime no whos reverse is also prime
			System.out.println("Yes, the given number is an emirp number.");
		else
			System.out.println("No, the given number is not an emirp number.");
	}

	private static boolean isEmirp(int n) {
		// TODO Auto-generated method stub
		return false;
	}
}

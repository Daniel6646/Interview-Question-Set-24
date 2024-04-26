package Javatpoint_Basic_Programs;

import java.util.Scanner;

public class ArmStrong_number {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int armStrongNo = checkArmStrong(number);
		System.out.println("Number received from armstrong method: "+armStrongNo);
		
		if(number == armStrongNo)
		{
			
			System.out.println("The given number" +number + " is a armstrong number" );
		}
		
		else {
			
			System.out.println("The given number" +number + " is not a armstrong number" );

		}
	
	}
	
	
	public static int checkArmStrong(int number) {
		
		int lastDigit = 0, sum = 0;
		
	while (number > 0) {
		
	 lastDigit = number % 10;
	 sum += lastDigit * lastDigit * lastDigit;
	 number = number / 10;
	
	}
		
		return sum;
	}
	
	
}

package javatpoint_Number_Programs;

import java.util.Scanner;

public class SunnyNumber {

	//A number is called a sunny number if the number next to the given number is a perfect square. In other words, a number N will be a sunny number if N+1 is a perfect square.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check for sunny number");
		int numberToCheck = scanner.nextInt();
		isSunnyNumber(numberToCheck);
		
		
	}
	
	public static boolean perfectSquare(double num) {
		
		
		int square = 0;
		double number ;
		
		 number = Math.sqrt(num);
		
		 return number - Math.floor(number) == 0;
		
	}
	
	
	public static void isSunnyNumber (int num) {
		
		if(perfectSquare(num + 1)) {
			
			System.out.println(num+ " is a sunny number");
		}

		else {
			
			System.out.println(num+ " is not a sunny number");
			
		}
		

	}
	
	
}

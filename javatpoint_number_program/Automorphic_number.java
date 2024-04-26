package javatpoint_Number_Programs;

import java.util.Scanner;

public class Automorphic_number {

	//A number is called an automorphic number if and only if the square of the given number ends with the same number itself. For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively and the last two digits of the square represent the number itself. Some other automorphic numbers are 5, 6, 36, 890625, etc.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is automorphic");
		int number = scan.nextInt();		
		
		if(automorphicNumber(number)) {
			
			System.out.println(number+" is an automorphic number");
		} 
		
		else {
			
			System.out.println(number+" is not an automorphic number");

		}
		
		
		
	}
	
	public static int squareResultOfANumber(int num) {
		
	int result = num * num;
	
	return result;
	}
	
	
	public static boolean automorphicNumber (int number) {
		
		boolean flag = false;
		
		int squareOfAnumber =  squareResultOfANumber(number);
		System.out.println("square of number"+squareOfAnumber);
		
		while( number > 0 ) {
			
			if( squareOfAnumber %10 != number %10 ) {
				
				//added to check if numbers like 20 and its square 400 last digit are same but second last are not so while loop never ends, remove the number even if number are not equal to make while loop true.
				flag = false;
				squareOfAnumber =  squareOfAnumber / 10;
				number = number / 10;
			}
			
			else {
				
				squareOfAnumber =  squareOfAnumber / 10;
				number = number / 10;
				flag = true;
			}
			
		}
		
	
		return flag;
	}
	
}

package javatpoint_Number_Programs;

import java.util.Scanner;

public class BouncyNumber {

//If an integer traversing from left to right if the current digit is greater than or equal to the previous digit, the number is known as increasing numbers. In other words, we can say that if no digit is exceeded by the digit to its left is called increasing numbers. For example, 1233, 13689, 112334566, etc.	
//In an integer traversing from left to right if the current digit is less than the previous digit, the number is known as decreasing numbers. In other words, we can say that if no digit is exceeded by the digit to its right is called decreasing numbers. For example, 321, 88531, 8755321, etc.

//A positive integer that is neither in increasing nor decreasing number is called a bouncy number. It means they bounce between increasing and decreasing. In other words, we can say that if the digits of the number are unsorted.	

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);  
		System.out.print("Enter any number to check for bouncy number: ");  
		//reading an integer from the user  
		int inputNumber = scan.nextInt();  
		//if any of the following condition returns true, the number id not bouncy   
		if (increasingNumber(inputNumber) || decreasingNumber(inputNumber) || inputNumber < 101)  
		//prints if the number is not bouncy  
		System.out.println(inputNumber+" not a bouncy number.");  
		else  
		//prints if the number is bouncy  
		System.out.println(inputNumber+" is a bouncy number.");  
		}  
	
	
	
	public static boolean increasingNumber(int number) {
		
		boolean flag = true;

		try {
			
			
			String strNumber = String.valueOf(number);
			
			for(int i = 0; i< strNumber.length() -1; i++) {
				
				int digit = strNumber.charAt(i);
	//if first no biiger than second, then not an increasing number if first small than second it is increasing number like 1234567
				if( digit > strNumber.charAt(i+1)) {
					
					flag = false;
					break;
				}
				
			}
			
			
		}
		catch (Exception e) {
			
			System.out.println("EXCEPTION In increasing method :::"+e);		

		}
		return flag;

	}
	
	
	public static boolean decreasingNumber(int number) {
		boolean flag = true;
		String strNumber = String.valueOf(number);

		try {
			
			
			
			for(int i = 0; i< strNumber.length() - 1; i++) {
				
			int digit =	strNumber.charAt(i);
	//if first no smaller than second, then not an decreasing number, if first bigger than second it is decreasing number like 987654
				if(digit < strNumber.charAt(i+1)) {
					
					flag = false;
					break;
				}
				
			}
			
			
		}
		
		catch (Exception e) {
			System.out.println("EXCEPTION In decreasing method "+e);
		}
		
		return flag;

	}
	
}

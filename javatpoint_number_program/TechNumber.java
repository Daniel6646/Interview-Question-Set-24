package javatpoint_Number_Programs;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check for tech number");
		int number = scan.nextInt();
		techNumber(number);
		
	}
	

	public static int squareRoot(int num) {
		
		int result = 0;
		result = num * num;
		
		return result;

	}
	
	
	public static void techNumber (int number) {
		
		
	int digit = 0, n = 0, firstHalf =0,totalResult = 0, totalOfFirstHalfandSecond = 0, secondHalf = 0,firstHalfTotal = 0,secondHalfTotal = 0, squareOfNo = 0;
	
	n = number;
	
	while (n != 0) {
	// get the lenth to number first then to check if it is even	
		
		digit ++;
		
		n = n /10;
		System.out.println("value of n"+n);
	}
	
	if(digit % 2 == 0) {
		//to check peterson no if must be even
		// if even move forward
		
		//determines the first half of the given number  
		firstHalf = number % (int) Math.pow(10, digit / 2);  
		//determines the second half of the given number  
		secondHalf = number / (int) Math.pow(10, digit / 2); 
		System.out.println("firsthalf value"+firstHalf);
		System.out.println("secondhalf value"+secondHalf);
		//square of first half of number + second eg 2025 then 20square + 25 square
		 firstHalfTotal =  firstHalfPlusSecond(firstHalf, secondHalf);
		 secondHalfTotal = firstHalfPlusSecond(firstHalf, secondHalf);
		 System.out.println("firstHalfTotal"+firstHalfTotal);
		 System.out.println("secondHalfTotal"+secondHalfTotal);
		 
		 totalResult =  firstHalfTotal * secondHalfTotal;
		// totalResult = 	totalOfFirstHalfandSecond * totalOfFirstHalfandSecond;
		 System.out.println("total Result"+totalResult);
		 
	if(number == totalResult) {
		
		System.out.println(number+ " is a peterson number");
	}
	
	else {
		
		System.out.println(number+ " is not a peterson number");

	}
	
	
	}
	
	else {
		
		System.out.println(number + " is not a peterson number ");
	}
		
	
	
	}
	
	
	public static int  squareOfAnumber (int num) {
		
		int result = 0;
		result = num * num;
	
		return result;
	}
	
	
	public static int  firstHalfPlusSecond (int firsthalf, int secondHalf) {
		
		
		int result = firsthalf + secondHalf;
		
		return result;
	}
}


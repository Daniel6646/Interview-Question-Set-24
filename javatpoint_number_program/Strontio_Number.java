package javatpoint_Number_Programs;

import java.util.Scanner;

public class Strontio_Number {

//1386*2=2772, we observe that at tens and hundreds place digits are the same. Hence, 1386 is a strontio number. 1221*2=2442, digits at tens and hundreds place are the same. Hence, 1221 is a strontio number.

//Some other strontio numbers are 1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, 9999, 1001, 2002, 3003, etc.	
	
		
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		// reading an integer from the user
		int num = sc.nextInt();
		//strontioNumber1(num);
		strontioNumber2(num);

		}

	public static void strontioNumber1(int num) { 
		
		int n = num;

		// first, we have multiplied a number by 2
		// the resultant is divided by 1000 that gives the remainder and removes the
		// first digit
		// at last, the resultant is divided by 10 that removes the last digit
		// therefore, we get a two-digit number that are mean digits of the given number
//		num = num * 2;
//		System.out.println("num = num * 2 "+num);
//		num = (num %1000) / 10;
//		System.out.println("Number::");
		num = (num * 2 % 1000) / 10;
//		//num * 2 = 2772 
//		2772 % 10 = 772
//		772 / 10 = 77		
		System.out.println("Number "+num);
		// divide the two-digit number (that we get from the above) by 10 and find the
		// remainder
		// compares the remainder and quotient
		System.out.println("num % 10:: "+num % 1000);
		System.out.println("num / 10::  "+num / 10);
		if (num % 10 == num / 10)
			
			// if equal, prints strontio number
			System.out.println(n + " is a strontio number.");
		else
			// prints if not a strontio number
			System.out.println(n + " is not a strontio number.");

		
		
		
	}

	
	public static void strontioNumber2(int num) {
		
//        Enter the number: 1386
		  int n = num;

	        // Multiply by 2
	        num = num * 2;
	        //num = 2772

	        // Get tens and hundreds digits
	        int tens = (num / 10) % 10;
//num/10 will reove last element so now no is 277 then %10 will get last element 7
	        System.out.println("tens:: "+tens);
//	        tens:: 7
	        int hundreds = (num / 100) % 10;
	        System.out.println("hundreds:: "+hundreds);
//now num is 277, num/100 will remove 2 and	        
//	        hundreds:: 7



	        if (tens == hundreds) {
	        	
	            System.out.println(n + " is a strontio number.");

	        }
	        else {
	        	System.out.println(n + " is not a strontio number.");
	        }
	        
	        // console logs
//	        1386 is a strontio number.
	    
	        /* Remember this pattern:
int tens = (num / 10) % 10;
int hundreds = (num / 100) % 10;

The rule is:
Divide by the place value, then % 10 to get that digit.

For example, 1386 × 2 = 2772
Tens digit:
2772 / 10 = 277
277 % 10 = 7

So:
tens = 7

Hundreds digit:
2772 / 100 = 27
27 % 10 = 7

So:
hundreds = 7

Since:
7 == 7

→ 1386 is a Strontio number.
Even more memorable version
You can write it like this:
num = num * 2;

int tens = num / 10 % 10;
int hundreds = num / 100 % 10;

if (tens == hundreds)
    System.out.println("Strontio Number");
else
    System.out.println("Not Strontio Number");

I would recommend this version for you because you're practicing lots of Java number programs. The general pattern becomes reusable:
num / 10 % 10      // tens digit
num / 100 % 10     // hundreds digit
num / 1000 % 10    // thousands digit

So you don't have to memorize complicated expressions like:
(num * 2 % 1000) / 10

Your original code is clever, but the digit-by-digit version is much easier to explain in an interview and remember later.*/
	        
	        
	        
	}
	
}

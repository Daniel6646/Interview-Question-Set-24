package javatpoint_Number_Programs;

import java.util.Scanner;

public class Krishnamurthy_Number {

	
//Krishnamurthy number is another special number in Java. A number is said to be Krishnamurthy if the factorial sum of all its digits is equal to that number.	
	
//	Number = 145  
//			= 1! + 4! + 5!  
//			= 1 + ( 4 * 3 * 2 * 1 ) + ( 5 * 4 * 3 * 2 * 1 )  
//			= 1 + 24 + 120  
//			= 145  	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is KrishnaMurthyNumber");
		int number = scan.nextInt();
		int number2 = krishnaMurthyNumber(number);
		
		if(number == number2) {
			
			System.out.println(number+" is a krishnamurthy number");
		}
		
		else {
			
			System.out.println(number+" is a not krishnamurthy number");

		}
		
		
	}
	
	
	public static int factorilOfANumber(int num) {
		
		int factorial = 1;
		
		for(int i =1; i<=num; i++) {
			
			factorial = factorial * i;
		}
		
		return factorial;
	}

	
	public static int krishnaMurthyNumber(int number) {
		
		int n = 0, sum = 0, factorialOfANo;
		 
		n = number;
		
		while (n != 0) {
			
			int lastDigit =  n %10;
			factorialOfANo = factorilOfANumber(lastDigit);
			sum = sum + factorialOfANo;
			n = n/10;
		}
		System.out.println("Sum of factorial of all numbers"+sum);

		return sum;
		
	}
}


package javatpoint_Number_Programs;

import java.util.Scanner;

//Multiplying a number by two and three separately, the number obtained by writing the results obtained with the given number will be called a fascinating number. If the result obtained after concatenation contains all digits from 1 to 9, exactly once.

//"327"+"654"+ "981"= 327654981 We observe that the resultant () contains all the digits from 1 to 9, exactly once. Hence, the given number 327 is a fascinating number.



public class Fascinating_Number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is fascinating");
		int number = scan.nextInt();
		
		if(fascinatingNumber(number)) {
			
			System.out.println(number+ " is a fascinating number");
			
		} else {
			
			System.out.println(number+ "   is not a fascinating number");

		}
		
		
	}
	
	public static boolean fascinatingNumber(int number) {
		
		int n1= 0, n2 = 0, count = 0;
		String concatStr = "";
		boolean flag = true;
		
		//192 *2 912*3 and number concat all then check if it has 1 to 9 number but only once
		n1 = number *2;
		n2 = number * 3;
		
		concatStr = number +"" +n1+n2;
		System.out.println("concatStr"+concatStr);
		
		for(char c ='1'; c<='9'; c++) {
			
			count = 0;
			
			for(int j=0; j<concatStr.length(); j++) {
				
				char ch = concatStr.charAt(j);
				
				if(c == ch) {
					count++;
					
				}
				
					
				}
				
			System.out.println();
			System.out.println("count"+count);
			
			if(count >1 || count == 0) {
				
				flag = false;
				break;
			
			}
			
			
		}
		
		return flag;
	}
}


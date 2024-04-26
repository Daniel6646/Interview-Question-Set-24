package javatpoint_Number_Programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ISBN_Number {

	//The ISBN number is a legal number when 1*Digit1 + 2*Digit2 + 3*Digit3 + 4*Digit4 + 5*Digit5 + 6*Digit6 + 7*Digit7 + 8*Digit8 + 9*Digit9 + 10*Digit10 is divisible by 11. The digits are taken from right to left. So, if the ten-digit number is 7426985414, Digit1 and Digit10 will be 4 and 7, respectively.

//	Number2: 1259060977
//
//	Sum = (1*10) + (2*9) + (5*8) + (9*7) + (0*6) + (6*5) + (0*4) + (9*3) + (7*2) + (7*1)
//
//	Sum = 10 + 18 + 40 + 63 + 0 + 30 + 0 + 27 + 14 + 7
//
//	Sum = 209
//
//	Now, we divide the sum with 11 and check whether the remainder is 0 or not.
//
//	rem = 209 % 11
//
//	rem = 0
//
//	Number 1259060977 is a legal ISBN because the remainder is equal to 0.
	
	
//	public static void main(String[] args) {
//		
//		   Scanner sc=new Scanner(System.in);  
//	        System.out.println("Enter a number to check if it ISBN number or not ::");  
//	     	int n1 = sc.nextInt();  
//	     	boolean flag  = checkISBNNumber(n1);
//	     	
//	     	if(flag) {
//	     		
//	     		System.out.println(n1+ " is a ISBN number");
//	     	}
//	     	
//	     	else {
//	     		System.out.println(n1+ " is not a ISBN number");
//
//	     		
//	     	}
//	     	
//	}
//	
//	
//	public static boolean checkISBNNumber(int number) {
//		
//		String strNumber = "";
//		int n = 0, lastdigit = 0, firstElement =0,secondElement=0,sumOfFistAndSecond=0,sum=0;
//		boolean flag = false;
//		
//		strNumber = "" + number;
//		n = number;
//		
//		if(strNumber.length() != 10) {
//			
//			return false;
//		}
//		
//		
//	for(int i =0; i<strNumber.length(); i++ ) {
//		
//		 firstElement= Integer.parseInt(strNumber.substring(i, i+1));
//		 secondElement =  i + 1;
//		 sumOfFistAndSecond = firstElement * secondElement;
//		 sum = sum + sumOfFistAndSecond;
//		 
//	}
//		System.out.println("Sum of all elements"+sum);
//	
//		if(sum % 11 == 0) {
//			
//			flag = true;
//		}
//		
//		else {
//			
//			flag = false;
//		}
//		
//		return flag;
//	}
//	
	
	
	
	
	
	
	  static boolean checkISBNNumber(long number)  
	    {  
	            int sum = 0;  
	    int i, t, intNumber, dNumber;  
	    String strNumber;  
	          
	    strNumber = ""+number;  
	          
	    if (strNumber.length() != 10) {  
	                    return false;  
	            }  
	          
	            for (i = 0; i < strNumber.length(); i++) {  
	                    intNumber = Integer.parseInt(strNumber.substring(i, i+1));  
	                    dNumber = i + 1;  
	                    t = dNumber * intNumber;  
	                    sum = sum + t;  
	            }  
	            	System.out.println("sum of the 10 digits * 1,2,3 etc"+sum);
	            // check whether the sum is divisible by 11 or not  
	        
	            if ((sum % 11) == 0) {  
	                    return true;  
	            }  
	          
	    return false;  
	          
	    }  
	    
	    // main() method start  
	    public static void main(String args[])   
	    {     
	long n1, n2;  
	          
	    try {  
	              
	        //create BufferedReader class object to get input from user  
	        InputStreamReader in = new InputStreamReader(System.in);  
	        BufferedReader br = new BufferedReader(in);  
	          
	        //show custom message  
	        System.out.println("Enter first 10 digit ISBN number");  
	              
	        //store user entered value into variable n1  
	        n1 = Long.parseLong(br.readLine());  
	              
	        //show custom message  
	        System.out.println("Enter second 10 digit ISBN number");  
	              
	        //store user entered value into variable n2  
	        n2 = Long.parseLong(br.readLine());  
	              
	        if (checkISBNNumber(n1))   
	            System.out.println(n1 + " is a valid ISBN number");   
	        else  
	            System.out.println(n1 + " is not a valid ISBN number");   
	        if (checkISBNNumber(n2))   
	            System.out.println(n2 + " is a a valid ISBN number");   
	        else  
	            System.out.println(n2 + " is not a valid ISBN number");  
	              
	        }catch(java.lang.Exception e) {  
	            System.out.println("Error while reading the data.");  
	        }   
	        } 
	
	
	
	
}

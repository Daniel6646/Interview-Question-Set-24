package HackerRank;

import java.util.Scanner;

public class String_Reverse {

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String reverse = new StringBuffer(A).reverse().toString();

        if (A.equals(reverse))
            System.out.println("Yes");
        else
            System.out.println("No");

        
    }
	
}

 
/*
 * public class Solution {
 * 
 * public static void main(String[] args) {
 * 
 *  Scanner sc = new Scanner(System.in);
 * 
 * String str = sc.next();
 * 
 * String orignal = str;
 * 
 * String rev = "";
 * 
 * int n = str.length();
 * 
 * for(int i = n-1; i>=0; i--){
 *  rev = rev + str.charAt(i); 
 *  
 *  }
 * 
 * if(rev.equals(orignal)){ 
 * System.out.println("Yes"); 
 * } else
 * 
 * {
 * System.out.println("No"); }
 * 
 * }
 *  }
 */




/*
 * int k=0;
 * 
 * for(int i=0,j=A.length()-1;i<=j;i++,j--) {
 * 
 * if(A.charAt(i)!=A.charAt(j)) {k=1;}
 * 
 * }
 * 
 * System.out.println((k==0)?"Yes":"No");
 */
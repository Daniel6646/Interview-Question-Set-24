package HackerRank;

import java.util.Scanner;

public class String_Anagram {

	 static boolean isAnagram(String a, String b) {
	     
	        // Complete the function
	        //Convert strings to lowercase
	        a=a.toLowerCase();
	        b=b.toLowerCase();
	        //Convert Strings a and b to charArrays
	        char[] arrA=a.toCharArray();
	        char[] arrB=b.toCharArray();
	        //Sort arrA and arrB alphebetically
	        java.util.Arrays.sort(arrA);
	        java.util.Arrays.sort(arrB);
	        //Convert arrA and arrB to strings a and b
	        a=java.util.Arrays.toString(arrA);
	        b=java.util.Arrays.toString(arrB);
	        //Compare strings a and b
	        if(a.compareTo(b)==0){
	        	return true;
	           }
	        
	        else {
	        
	        	return false;
	        }
	    }

	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	
}

package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Primality_Test_PrimeNumber {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
   
        String n = bufferedReader.readLine();
        BigInteger number = new BigInteger(n);
        System.out.print(number.isProbablePrime(1) ? "prime": "not prime");
        bufferedReader.close();
    }
	
}



/*
 * public class Solution {
 * 
 *  private static final Scanner scanner = new Scanner(System.in);
 * 
 * public static void main(String[] args) { 
 * String n = scanner.nextLine();
 * 
 * BigInteger number = new BigInteger(n); 
 * 
 * if (number.isProbablePrime(1)) {
 * 
 * System.out.println("prime");
 *  }
 *  
 *   else { 
 *   
 *   System.out.println("not prime"); 
 *   }
 * scanner.close(); 
 * 	} 
 * }
 */
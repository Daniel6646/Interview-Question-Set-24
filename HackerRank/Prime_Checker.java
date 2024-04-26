package HackerRank;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

public class Prime_Checker {

	class Prime {
		static void checkPrime(int... nums) {
			for (int n : nums) {
				String prime = "";
				int factors = 0;
				for (int i = 1; i <= n; i++) {
					if ((n % i) == 0)
						++factors;
				}
				if (factors == 2)
					prime = prime + n + " ";
				else
					prime = "";
				System.out.print(prime);
				// System.out.println(" ");
			}
			System.out.println("");
		}
	}
	
	
		public class Solution {

			public static void main(String[] args) {
				try{
				BufferedReader br=new BufferedReader(new InputStreamReader(in));
				int n1=Integer.parseInt(br.readLine());
				int n2=Integer.parseInt(br.readLine());
				int n3=Integer.parseInt(br.readLine());
				int n4=Integer.parseInt(br.readLine());
				int n5=Integer.parseInt(br.readLine());
				Prime ob=new Prime();
				ob.checkPrime(n1);
				ob.checkPrime(n1,n2);
				ob.checkPrime(n1,n2,n3);
				ob.checkPrime(n1,n2,n3,n4,n5);	
				Method[] methods=Prime.class.getDeclaredMethods();
				Set<String> set=new HashSet<>();
				boolean overload=false;
				for(int i=0;i<methods.length;i++)
				{
					if(set.contains(methods[i].getName()))
					{
						overload=true;
						break;
					}
					set.add(methods[i].getName());
					
				}
				if(overload)
				{
					throw new Exception("Overloading not allowed");
				}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			
		}	
}

/*
 * class Prime{
 *  void checkPrime(int ...v) {
 *    for(int i : v) { 
 *  BigInteger b=new BigInteger(Integer.toString(i)); 
 *  if(b.isProbablePrime(100)==true)
 * System.out.print(i+" ");
 *    }
 *   System.out.println(); 
 *  } 
 * }
 */



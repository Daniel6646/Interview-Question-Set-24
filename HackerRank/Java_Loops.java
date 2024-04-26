package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Java_Loops {
	
	 public static void main(String[] args) throws IOException {
	       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		 
		 Scanner scanner = new Scanner(System.in);
	       // int N = Integer.parseInt(bufferedReader.readLine().trim());
	        
		 int N = scanner.nextInt();
		 
	        for(int i=1; i<=10; i++)
	        {
	            System.out.printf("%d x %d = %d%n",N ,i, N*i );
	        }

	        //bufferedReader.close();
	        scanner.close();
	    }
}

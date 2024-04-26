package HackerRank;

import java.util.Scanner;

public class End_of_file {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for(int i=1;scanner.hasNext()==true;i++)
        {
            System.out.println(i +" " + scanner.nextLine());
        }
        
        
    }
	
}

/*
 * Sample Input
 * 
 * Hello world 
 * I am a file 
 * Read me until end-of-file. 
 * 
 * Sample Output
 * 
 * 1 Hello world 
 * 2 I am a file 
 * 3 Read me until end-of-file.
 */
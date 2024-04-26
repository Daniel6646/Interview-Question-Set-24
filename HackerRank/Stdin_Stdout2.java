package HackerRank;

import java.util.Scanner;

public class Stdin_Stdout2 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

/*
 * Sometimes you have to clear the buffer to print the strings by command
 * sc.nextLine();
 */


/*
 * 
 * Sample Input:
 * 
 * 42 3.1415 Welcome to HackerRank's Java tutorials!
 * 
 * Sample Output: String: Welcome to HackerRank's Java tutorials! Double: 3.1415
 * Int: 42
 */
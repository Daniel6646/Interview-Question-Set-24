package HackerRank;

import java.util.Scanner;

public class Java_Loops2 {

	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c =a;
            for(int j=0;j<n;j++){
                c += Math.pow(2, j)*b;
                System.out.printf("%s ",c);
            }
            System.out.println();

        }
        in.close();
    }
}


/*
 * Sample Input
 * 
 * 2 
 * 0 2 10
 *  5 3 5 Sample Output
 * 
 * 2 6 14 30 62 126 254 510 1022 2046
 *   8 14 26 50 98
 */


/*
 * a+2^0*b+2^1*b+2^2*b+2^3*b+........+2^n-1*b
 * 
 * In every Iteration you should add previous result so that you would get result .................................... 
 * 1st Iteration: result=a+2^0*b
 * 2nd Iteration: result = result + (2^1)*b
 * 3rd Iteration: result =result + (2^2)*b
 * N^th Iteration: result = result+ (2^n-1)*b
 * I hope It will help you!!!!!!!
 * 
 */
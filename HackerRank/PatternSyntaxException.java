package HackerRank;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class PatternSyntaxException {

	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(in.hasNextLine()){
			String pattern = in.nextLine();
          	
              try{

              Pattern.compile(pattern);
              System.out.println("Valid");
          }
          catch(PatternSyntaxException e){
              System.out.println("Invalid");
          }
		}
	}
}

package HackerRank;

import java.util.Scanner;

public class String_Token {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext()){ //if nothing
            System.out.print(0);
            return;
        }
        String s = scan.nextLine();
        s = s.trim();
        if(s.length()==0){
            System.out.println("0");
            return;
        }
        String[] tokens = s.split("[ !,?.\\_'@]+");
        System.out.println(tokens.length);
        for(String word:tokens){
            System.out.println(word);   
        }
        scan.close();
    }
	
}

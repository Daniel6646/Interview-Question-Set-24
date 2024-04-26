package HackerRank;

import java.util.BitSet;
import java.util.Scanner;

public class BitSet {

    public static void main(String[] args) {
        
    	Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int M=scan.nextInt();
        BitSet B1=new BitSet(N);
        BitSet B2=new BitSet(N);
        for(int i=0;i<M;i++){
            String op=scan.next();
            int a=scan.nextInt();
            int b=scan.nextInt();
            if(op.equals("AND"))
                if(a==1)
                    B1.and(B2);
                else
                    B2.and(B1);
            
            else if(op.equals("OR"))
                 if(a==1)
                    B1.or(B2);
                else
                    B2.or(B1);
            
            else if(op.equals("XOR"))
                 if(a==1)
                    B1.xor(B2);
                else
                    B2.xor(B1);
            
            else if(op.equals("SET"))
                 if(a==1)
                    B1.set(b);
                else
                    B2.set(b);
            
            else if(op.equals("FLIP"))
                 if(a==1)
                    B1.flip(b);
                else
                    B2.flip(b);
                
            System.out.println(B1.cardinality()+" "+B2.cardinality());     }
	
    }
}
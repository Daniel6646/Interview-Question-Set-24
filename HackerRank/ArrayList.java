package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList {

  public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int y1 = sc.nextInt(); 
    
    ArrayList<ArrayList<Integer>> list = new ArrayList<>(y1);
   
    for(int i=0; i<y1; i++) {
    	
        int x = sc.nextInt();//number of elements to be added in array
        ArrayList<Integer> tempList = new ArrayList<>();
       
        for(int j=0; j<x; j++){
        	
            tempList.add(sc.nextInt());
        }
        
        list.add(tempList);
    }

    int y2 = sc.nextInt();
    
    for(int i=0; i<y2; i++){
    	
        int x1 = sc.nextInt() - 1;
        int x2 = sc.nextInt() - 1;
        
        try {
        	
            System.out.println(list.get(x1).get(x2));
        }
        
        catch(Exception ex) {
        	
            System.out.println("ERROR!");
            ex.printStackTrace();
        }
    }
    
    sc.close();

    }	
}

/*
 * Sample Input
 * 
 * 5 //number of rows
 *  
 * 5 41 77 74 22 44 //elements all these 5 below to be added in arraylist then add all these single elements in a list as 5 rows so 5 lists in a single arraylist
 * 1 12
 * 4 37 34 36 52 
 * 0 
 * 3 20 22 33
 *   
 * 5 // number of queries below one ix x and other y get the x and y element from list above if not print error 
 *  
 * 1 3
 * 3 4
 * 3 1
 * 4 3
 * 5 5
 * 
 * Sample Output
 * 
 * 74
 * 52
 * 37
 * ERROR!
 * ERROR!
 */

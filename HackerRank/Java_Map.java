package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_Map {

	
	public static void main(String []argh)
	{
	    Scanner scan = new Scanner(System.in);
	    int contacts = scan.nextInt();
	    scan.nextLine();
	    Map<String, Integer> map = new HashMap<>(contacts);
	    for(int i=0; i < contacts; i++)
	    {
	        String name = scan.nextLine().trim();
	        int phone = scan.nextInt();
	        scan.nextLine();
	        map.put(name, phone);
	    }        

	while(scan.hasNext())
	    {
	        String query = scan.nextLine().trim();
	        if(map.containsKey(query))
	        {
	            System.out.println(query + "=" + map.get(query));
	        }
	        else
	        {
	            System.out.println("Not found");
	        }
	    }
	    scan.close();
	     }
}


/*
 * Sample Input
 * 
 * 3 uncle sam 99912222 tom 11122222 harry 12299933 uncle sam uncle tom harry
 * 
 * Sample Output
 * 
 * uncle sam=99912222 Not found harry=12299933
 * 
 */
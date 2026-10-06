package javatpoint_string_programs;

import java.util.ArrayList;
import java.util.List;

public class Divide_String_Nequalparts {

	public static void main(String[] args) {
		
        String str = "aaaabbbbcccc";  
        nEqualParts(str);
        
	}
	
	public static void nEqualParts(String str) {
		
		
		int n = 3, equalParts = str.length() / n;
		String temp[] = new String [n] ;
		String part ="";
		int index = 0;
		List<String> list = new ArrayList<>();

		if(str.length() % n != 0 ) {
			
			System.out.println("Cannot be divided into equal string");
		} 
		
		for(int i=0; i<str.length(); i=i+equalParts) {
			
		 part =	str.substring(i, i+equalParts);
		// list.add(str.substring(i, i+equalParts)); easier solution then iterate and show
		 temp[index] = part;
		 index++;
		
		}
		
		System.out.println("String in "+n+" equal parts are as follows ::");
		
		for(int i=0; i< temp.length; i++) {
			
			System.out.print(temp[i] + " ");
		}
	}
	
}

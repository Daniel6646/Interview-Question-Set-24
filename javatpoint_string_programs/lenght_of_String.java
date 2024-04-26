package javatpoint_string_programs;

public class lenght_of_String {

	public static void main(String[] args) {
		
		lenghtOfString();
		
	}
	
	public static void lenghtOfString () {
		
		String string = "The best of both worlds"; 
		int count =0;
		
//		System.out.println("string.trim::  "+string.trim());
//		
//		int lengthOfString = string.trim().length();
//	
//		System.out.println("Lenght of string is "+lengthOfString);
		
		for(int i=0; i< string.length(); i++) {
			
			if(string.charAt(i) != ' ') {
				count++;
				
			}
		}
	
		System.out.println("Lenght of given string is:: "+count);
		
		
	}
	
}

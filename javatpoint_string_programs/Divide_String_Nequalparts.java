package javatpoint_string_programs;

public class Divide_String_Nequalparts {

	public static void main(String[] args) {
		
        String str = "aaaabbbbcccc";  
        nEqualParts(str);
        
	}
	
	public static void nEqualParts(String str) {
		
		
		int lenght = str.length();
		int n = 3, equalParts = lenght / n;
		String temp[] = new String [n] ;
		String part ="";
		int index = 0;
		
		if(lenght % n != 0 ) {
			
			System.out.println("Cannot be divided into equal string");
		} 
		
		for(int i=0; i<lenght; i=i+equalParts) {
			
		 part =	str.substring(i, i+equalParts);
		 temp[index] = part;
		 index++;
		
		}
		
		System.out.println("String in "+n+" equal parts are as follows ::");
		
		for(int i=0; i< temp.length; i++) {
			
			System.out.print(temp[i] + " ");
		}
	}
	
}

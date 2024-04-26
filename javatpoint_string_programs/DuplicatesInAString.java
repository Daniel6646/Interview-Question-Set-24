package javatpoint_string_programs;

public class DuplicatesInAString {

	public static void main(String[] args) {
		
		String string1 = "Great responsibility";
		char strArray[] = string1.toCharArray();
		int count, j ;
		
		System.out.println("Duplicate elements in this string");
		
		for(int i=0;i<strArray.length; i++) {
			
			count = 1;
			for( j=i+1; j<strArray.length; j++) {
				
				if(strArray[i] == strArray[j] && strArray[j] != ' ') {
					
					count++;
					strArray[j] = '0';
				}
				
			
			}
			
			if(count >1 && strArray[i] != '0' ) {
				System.out.print(strArray[i] + " ");
				
			}
		}
		
	}
	
}

package javatpoint_string_programs;

public class Subsets_of_String {

	
	public static void main(String[] args) {
		
		String str = "FUN";
		subSetOfString(str);
		
	}
	
	public static void subSetOfString (String str) {
		
		String tempString= "";
		int len = str.length();
		String tempArray[] = new String[len*(len+1)/2] ;
		int temp = 0;
		
		for(int i = 0; i< str.length(); i++) {
			
			for (int j=i; j<str.length(); j++) {
				
				tempString = str.substring(i, j+1);
				tempArray[temp] = tempString;
				temp++;
			}
		}
		
		System.out.println("All sub-sets of string are:: ");
		
		for(int i=0; i<tempArray.length;i++) {
			
			System.out.println(tempArray[i] + " ");
		}
		
	} 
	
	
	
}

package javatpoint_string_programs;

public class MaxMinOccuringStrinWithFrequency {

	public static void main(String[] args) {
		
		 String str = "grass is greener on the other side";  
		 char charStr[] = str.toCharArray();
		int freq[] = new int [str.length()];
		int frequency = 1;
		char visited = '0';
		int min =freq[0];
		int max =freq[0];
		char minChar = str.charAt(0);
		char maxChar = str.charAt(0);
		
		for (int i=0; i< charStr.length; i++) {
			freq[i] = 1;
			for(int j= i+1;j<charStr.length; j++) {
				
				if(charStr[i] == charStr[j] && charStr[i] !='0' && charStr[i] != ' ' ) {
					
					freq[i]++;
					charStr[j] = visited;// so not to repeat
				}
			}	
		} 
		
		min  = freq[0];
		for (int i=0; i<freq.length; i++) {
			
			if(min > freq[i] && charStr[i] != 0) {
				
				min = freq[i];
				minChar = charStr[i];
			}
			
		}
		
		max = freq[0];

	for (int i=0; i<freq.length; i++) {
			
			if(max  < freq[i] && freq[i] != '0') {
				
				max = freq[i];
				maxChar = charStr[i];
			}
			
		}
	
	
	System.out.println("Minimum occuring character:: "+minChar);
	System.out.println("Maximum occuring character:: "+maxChar);

	
		
	}
	
	
}

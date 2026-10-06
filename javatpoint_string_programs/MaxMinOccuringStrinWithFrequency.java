package javatpoint_string_programs;

import java.util.HashMap;
import java.util.Map;

public class MaxMinOccuringStrinWithFrequency {

	public static void main(String[] args) {
		
		 String str = "grass is greener on the other side";  
		 char charStr[] = str.toCharArray();
		int freq[] = new int [str.length()];
		//int frequency = 1;
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
	
	public static void minMaxOccurString() {
	
		        String str = "grass is greener on the other side";

		        HashMap<Character, Integer> map = new HashMap<>();

		        // Count frequency of each character
		        for (char ch : str.toCharArray()) {

		            if (ch != ' ') {
		                map.put(ch, map.getOrDefault(ch, 0) + 1);
		            }
		        }

		        int min = Integer.MAX_VALUE;
		        int max = 0;

		        char minChar = ' ';
		        char maxChar = ' ';

		        // Find minimum and maximum occurring characters
		        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

		            char ch = entry.getKey();
		            int frequency = entry.getValue();

		            if (frequency < min) {
		                min = frequency;
		                minChar = ch;
		            }

		            if (frequency > max) {
		                max = frequency;
		                maxChar = ch;
		            }
		        }

		        System.out.println("Minimum occurring character: " + minChar);
		        System.out.println("Minimum frequency: " + min);

		        System.out.println("Maximum occurring character: " + maxChar);
		        System.out.println("Maximum frequency: " + max);
		    }
	
	
}

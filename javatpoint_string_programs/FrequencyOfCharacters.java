package javatpoint_string_programs;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		
		  String str = "picture perfect";    
		  int frequency[] = new int [str.length()];
		  int count = 1;
		  
		  char strArray[] = str.toCharArray();
		  
		  for(int i=0; i<strArray.length; i++) {
			  
			  frequency[i] =1;
			  for(int j = i+1; j<strArray.length;j++) {
				  
				  if(strArray[i] == strArray[j]) {
					  
					  
					  frequency[i]++;
					  strArray[j] = '0';
				  }
			  }
		  }
		  
		  System.out.println("String |  Frequency");
		  
		  for (int i=0;i< frequency.length; i++) {
			  
			  if(strArray[i] != ' ' && strArray[i] != '0' && frequency[i] != 0) {
			  System.out.println(strArray[i] + " | " + frequency[i]);
			  }
		  }
		  
		
	}
	
}

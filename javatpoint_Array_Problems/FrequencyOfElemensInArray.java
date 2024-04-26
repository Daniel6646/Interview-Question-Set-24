package javatpoint_Array_Programs;

public class FrequencyOfElemensInArray {
	
	public static void main(String[] args) {
		
		frequencyOfElementsInArray();
		
	}
	
	public static void frequencyOfElementsInArray() {
		
		
		int  visited = -1;
		int array1[] = new int[] {1, 2, 8, 3, 2, 2, 2, 5, 1};
		
		int frequencyOfElements[] = new int [array1.length] ;  
		
		for(int i=0; i< array1.length; i++) {
			
			int count = 1;
			for(int j = i +1; j<array1.length; j++) {
				
				if(array1[i] == array1[j] ) {
					
					count++;
					frequencyOfElements[j] = visited; //already visited element shown as -1
				}
					
			}
			
			if(frequencyOfElements[i] != visited ) {
				
				frequencyOfElements[i] = count;
			}
			
		}
		
		System.out.println("Elements in a array and their frequency ");

		   System.out.println("---------------------------------------");  
	        System.out.println(" Element | Frequency");  
	        System.out.println("---------------------------------------");  
		for(int i=0; i<frequencyOfElements.length; i++) {
			
			if(frequencyOfElements[i] != visited) {
			
			//System.out.print(array1[i] + " " + "|" + " " + frequencyOfElements[i]);
            System.out.println("    " + array1[i] + "    |    " + frequencyOfElements[i]);  

			//System.out.print("|" + " ");
			//System.out.println();
			}
		}

		
	}
	
	
	
}

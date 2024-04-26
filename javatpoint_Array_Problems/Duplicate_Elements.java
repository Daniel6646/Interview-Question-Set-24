package javatpoint_Array_Programs;

public class Duplicate_Elements {

	public static void main(String[] args) {
		
		duplicateElementsInArray();
	}
	
	public static void duplicateElementsInArray() {
		
	int j=0;	
		
	int array[] = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};	
	
	System.out.println("Duplicate elements in an array");
	
	for(int i=0; i < array.length; i++) {
		
		for( j = i+1; j < array.length;j++) {
			
			if(array[i] == array[j]) {
				System.out.println(array[j]);
				
			}	
		}
	}
	
//	 for(int i = 0; i < array.length; i++) {  
//         for( j = i + 1; j < array.length; j++) {  
//             if(array[i] == array[j])  
//                 System.out.println(array[j]);  
//         }  
//     }  
	
	
	}
	
	
	
	
	
}

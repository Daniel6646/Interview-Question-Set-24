package javatpoint_Array_Programs;

public class removeDuplicateElements {

	public static void main(String[] args) {
		
		duplicateElementsInArray();
	
	}
	
	public static void duplicateElementsInArray() {
		
	int duplicate = -1;	
	int array[] = new int [] {10,20,20,30,30,40,50,50};
		
	System.out.println("Orignal array:: ");
	for(int i=0;i<array.length;i++) {
		
		System.out.print(array[i] + " "); 
	}
	
	for(int i=0; i<array.length; i++) {
		
		for(int j= i+1; j<array.length;j++) {
			
			if(array[i] == array[j] ) {
				
				array[j] = duplicate;
			}
			
		}
	}
	System.out.println();
	System.out.println("Array after removal of duplicate elements:: ");
	for(int i=0; i<array.length; i++) {
		
		if(array[i] != duplicate ) {
			
			System.out.print(array[i] + " ");
		}
		
	}
	
	
	}
	
	
	
	
}

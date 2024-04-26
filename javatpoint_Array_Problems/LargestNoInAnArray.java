package javatpoint_Array_Programs;

public class LargestNoInAnArray {

	public static void main(String[] args) {
		
		largestNumberInAnArray();
		
	}
	
	public static void largestNumberInAnArray() {
		
	int array[] = new int[] {25, 11, 7, 75, 56}; 
	
	
	int max = array[0];
	
	for(int i=0; i<array.length; i++) {
		
		if( array[i] > max ) {
			
			max =  array[i];
		} 
	}
	
	System.out.println("largest element in this array is::  "+max);
		
	}
	
	
	
}

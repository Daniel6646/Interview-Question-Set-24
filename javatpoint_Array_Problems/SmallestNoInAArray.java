package javatpoint_Array_Programs;

public class SmallestNoInAArray {

	public static void main(String[] args) {
		
		smallestNoInAnArray();
		
	}
	
	public static void smallestNoInAnArray() {
		

		
		int array[] = new int[] {25, 11, 7, 75, 56}; 
		
		
		int min = array[0];
		
		for(int i=0; i<array.length; i++) {
			
			if( array[i] < min ) {
				
				min =  array[i];
			} 
		}
		
		System.out.println("smalles element in this array is::  "+min);
			
		
		
	}

}

package javatpoint_Array_Programs;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		
		sumOfElementsInArray();
	}
	
	
	public static void sumOfElementsInArray() {
		
		int array[] = new int[] {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		
		for (int i=0; i<array.length; i++) {
			
			sum = sum + array[i];
		}
		
		System.out.println("Total of all elements in this array::  "+sum);
		
	}
	
	
}

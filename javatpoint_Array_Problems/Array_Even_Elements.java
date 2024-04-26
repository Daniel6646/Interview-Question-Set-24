package javatpoint_Array_Programs;

public class Array_Even_Elements {

	public static void main(String[] args) {
		
		evenArrayElements();
	}
	
	
	public static void evenArrayElements() {
		
		int array[] = new int[] {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Even elements of an array");
		for(int i =0; i<array.length; i = i+2) {
			
			System.out.print(array[i]+" ");
		}
		
		
	}
	
}

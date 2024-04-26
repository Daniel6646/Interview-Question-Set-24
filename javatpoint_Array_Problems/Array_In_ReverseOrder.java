package javatpoint_Array_Programs;

public class Array_In_ReverseOrder {

	public static void main(String[] args) {
		
		elementsInReverse();
	}
	
	public static void elementsInReverse () {
		
		int array[] = new int [] {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Orignal array");
		for(int i =0; i< array.length; i++) {
			
			System.out.print(array[i] + " ");
			
		}
		System.out.println();
		
		System.out.println("Array Elements in reverse");
		for(int j=array.length-1; j>=0; j--) {
			
			System.out.print(array[j] + " ");
		}
		
	}
	
}

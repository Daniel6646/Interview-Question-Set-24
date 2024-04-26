package javatpoint_Array_Programs;

public class OddElements_InArray {

	public static void main(String[] args) {
		
		oddPosElementsInArray();
	}
	
	public static void oddPosElementsInArray () {
		
		
		int array[] =new int [] {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Elements at odd position in an array");
		for(int i=0;i<array.length; i++) {
			
			if( i%2 == 0 ) {
				
				System.out.print(array[i] + " ");
				
			}
		}
		
	}
	
}

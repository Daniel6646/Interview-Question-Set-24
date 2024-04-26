package javatpoint_Array_Programs;

public class CopyElementsOneArrayToAnother {

	public static void main(String[] args) {
		
		shfitArray1ElementsToArray2();
		
		
		
	}
	
	public static void shfitArray1ElementsToArray2() {
		
		int array1[] = new int [] {1,2,3,4,5,6,7,8};
		
		int array2[] = new int[array1.length] ;
		
		for(int i= 0; i< array1.length;i++) {
			
			array2[i] = array1[i];
		}
		
		System.out.println("Elements of array 1 are");
		
		for(int i =0; i<array1.length; i++) {
			
			System.out.print(array1[i]+ " ");
		}
		System.out.println();
		
		
		
		System.out.println("Elements of array2 are");
		
		for(int i =0; i<array2.length; i++) {
			
			System.out.print(array2[i]+ " ");
		}
		
	}
	
}

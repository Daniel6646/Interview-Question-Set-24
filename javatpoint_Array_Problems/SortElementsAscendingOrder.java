package javatpoint_Array_Programs;

public class SortElementsAscendingOrder {

	public static void main(String[] args) {
		
		sortInAscendingOrder();
	}
	
	public static void sortInAscendingOrder() {
		
		
		int array[] = new int [] {5,2,8,7,1};
		
		System.out.println("Orignal array ");

		for(int i=0;i <array.length;i++) {
			
			System.out.print(array[i] + " ");
		}
		
		
		for(int i=0;i<array.length;i++) {
		
			int temp = 0;
			for(int j= i+1; j<array.length;j++) {
				
				if (array[i] > array[j]) {
					
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				
				}

			
			}
			
		}
		System.out.println();
		System.out.println("Array after sorting in ascending order:: ");

		for(int i=0;i <array.length;i++) {
			
			System.out.print(array[i] + " ");
		}
		
		
	}
	
}

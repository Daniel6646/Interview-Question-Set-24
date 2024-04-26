package javatpoint_Array_Programs;

public class Left_Rotation_Array {

	public static void main(String[] args) {

		leftRotationArray();
	}

	public static void leftRotationArray() {

		int first = 0, n = 3; // for 3 iteration
		int j;

		int array1[] = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("Orignal Array before iteration");
		for (int i = 0; i < array1.length; i++) {

			System.out.print(array1[i]+ " ");
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {

			first = array1[0];

			for (j = 0; j < array1.length-1; j++) {

				array1[j] = array1[j + 1];
			}

			array1[j] = first;

		}//end of for iteration for i 

		System.out.println();
		System.out.println("Elements of new array after iteration");
		
		for(int i = 0; i<array1.length; i++) {
			
			System.out.print(array1[i]+" "); 
		}
		
	}

}

//Output

//
//Orignal Array before iteration
//1 2 3 4 5 
//
//Elements of new array after iteration
//4 5 1 2 3 
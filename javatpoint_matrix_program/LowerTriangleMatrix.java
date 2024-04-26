package javatpoint_matrix_programs;

public class LowerTriangleMatrix {

	
//	{ 1, 0, 0 },
//	{ 3, 6, 0 }, 
//	{ 2, 6, 6 }
	
//	Consider the above example, principle diagonal element of given matrix is (1, 6, 6). All the elements above the diagonal needs to made zero. In our example, those elements are at positions (1, 2), (1, 3) and (2, 3). To convert given matrix into the lower triangular matrix, loop through the matrix and set the values of the element to zero where column number is greater than row number.
	
	public static void main(String[] args) {
		int rows, cols;
		// Initialize matrix a
		int a[][] = { { 1, 2, 3 }, { 8, 6, 4 }, { 4, 5, 6 } };

		// Calculates number of rows and columns present in given matrix
		rows = a.length;
		cols = a[0].length;

		if (rows != cols) {
			System.out.println("Matrix should be a square matrix");
		} else {
			// Performs required operation to convert given matrix into lower triangular
			// matrix
			System.out.println("Lower triangular matrix: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (j > i)
						System.out.print("0 ");
					else
						System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}

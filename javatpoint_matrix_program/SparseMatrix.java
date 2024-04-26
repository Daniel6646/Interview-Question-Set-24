package javatpoint_matrix_programs;

public class SparseMatrix {

	public static void main(String[] args) {
		int rows, cols, size, zeroCount = 0;

		// Initialize matrix a
		int a[][] = { { 4, 0, 0 }, { 0, 5, 0 }, { 0, 0, 6 } };

		// Calculates number of rows and columns present in given matrix
		rows = a.length;//3
		System.out.println("Rows lenght:: "+rows);
		cols = a[0].length;//3
		System.out.println("Columns lenght:: "+cols);
		// Calculates the size of array
		size = rows * cols;// 3 * 3 = 9
		System.out.println("Size of row * cols "+size);

		
		// Count all zero element present in matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (a[i][j] == 0)
					zeroCount++;
			}
		}

		if (zeroCount > (size / 2))
			System.out.println("Given matrix is a sparse matrix");
		else
			System.out.println("Given matrix is not a sparse matrix");
	
	}

}

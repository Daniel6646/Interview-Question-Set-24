package LeetCode;

public class ReshapeMatrix {

	
	//	In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
//
//	You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
//
//	The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
//
//	If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
//
//	 
//
//	Example 1:
//
//
//	Input: mat = [[1,2],[3,4]], r = 1, c = 4
//	Output: [[1,2,3,4]]
//	Example 2:
//
//
//	Input: mat = [[1,2],[3,4]], r = 2, c = 4
//	Output: [[1,2],[3,4]]
//	 
//
//	Constraints:
//
//	m == mat.length
//	n == mat[i].length
//	1 <= m, n <= 100
	
	
	 public int[][] matrixReshape(int[][] mat, int r, int c) {
	     
		 
		 int rowLenght =  mat.length;
		 int columnLenght = mat[0].length;
		 		 
		 if(rowLenght * columnLenght != r * c) {
			 
			 return mat;
		 }
		 
		 int result[][] = new int [r][c];
		 int row_index = 0;
		 int column_index = 0;
		 
		 for(int i=0; i<rowLenght; i++) {
			 
			 for(int j=0; j<columnLenght;j++) {
				 
				 
				result[row_index][column_index] = mat[i][j];
				 column_index++;
				 
				 if(column_index == c) {
					 
					 row_index++;
					 column_index = 0;
				 }
				 
			 }
		 
		 }
		 
		 
		 
		 
		 return result;
	    }
	
}

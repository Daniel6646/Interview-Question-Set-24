package javatpoint_matrix_programs;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		
		int row = 0, columns = 0;
		
		int matrix[][] = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
		};
		
		row =  matrix.length;
		columns = matrix[0].length;
		
		int transposeMatrix[][] = new int [columns][row];

		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<columns; j++) {
				
				transposeMatrix[i][j] = matrix[j][i];
				
			}
		}
		
		for(int i =0; i<row; i++) {
			
			for(int j=0; j< columns; j++) {
				
				System.out.print(transposeMatrix[i][j] +" ");
			}
			System.out.println();
		}
		
	}
	
}

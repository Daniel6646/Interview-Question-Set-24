package javatpoint_matrix_programs;

public class SumnOfColsAndRows {

	public static void main(String[] args) {

		int row = 0, columns = 0, sumOfRows =0, sumOfColumns = 0;
		
		int matrix[][] = { 
						{1,2,3},
						{4,5,6}, 
						{7,8,9} 	}; 
		
		
	 row = matrix.length;
	 columns =  matrix[0].length;
	 
	 
	 for(int i =0 ;i<row; i++) {
		 
		 sumOfRows = 0;
		 for(int j=0; j< columns; j++) {
			 
			 sumOfRows = sumOfRows + matrix[i][j];
			 
		 }
		 System.out.println("Sum of row " +(i+1)+ " is :"+sumOfRows);
	 }
	 
	 
	 for(int i=0; i< columns; i++) {
		 
		 sumOfColumns = 0;
		 for(int j=0; j< row; j++) {
			 
			 sumOfColumns = sumOfColumns + matrix[j][i];
		 }
		 System.out.println("Sum of column " +(i+1)+ " is :"+sumOfColumns);

	 }
	 
	 
	}
	
}

package javatpoint_matrix_programs;

public class IdentityMatrix {

	public static void main(String[] args) {
		
		int row =0, columns = 0;
		boolean flag = true;
		
		int matrix[][] = new int [][] {
			
			{1,0,0},
			{0,1,0},
			{0,0,1}
			
		};
		
		row = matrix.length;
		columns = matrix[0].length;
	
		for(int i =0; i<row; i++) {
			
			for(int j=0; j< columns; j++) {
				
				if(i==j && matrix[i][j] == 1 ) {
					
					flag = true;
					
				}
				
				else {
					
					flag = false;
				}
				
			}
		}
			
			if(flag) {
				System.out.println("This is a transpose matrix");
			}
			
			else {
				
				System.out.println("This is not a transpose matrix");
			}
			
	}
	
}

package LeetCode2;

public class ToeplitzMatrix {

//	Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.
//
//			A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.
//
//			 
//
//			Example 1:
//
//
//			Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
//			Output: true
//			Explanation:
//			In the above grid, the diagonals are:
//			"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
//			In each diagonal all elements are the same, so the answer is True.9
	
//		    1 2 3 4
//		    5 1 2 3		
//			9 5 1 2
		   
		   
//			Example 2:
//
//
//			Input: matrix = [[1,2],[2,2]]
//			Output: false
//			Explanation:
//			The diagonal "[1, 2]" has different elements.
//			 
//
//			Constraints:
//
//			m == matrix.length
//			n == matrix[i].length
//			1 <= m, n <= 20
//			0 <= matrix[i][j] <= 99
//			 
//

	
	
	
	
	public boolean isToeplitzMatrix(int[][] matrix) {
        // 1  => 00 11 22 
        // 2     01 12 23
        // 3     02 13
        // 4     03
        // 5     10  21
        // 9     20  
		
//		👉 Rows
//		Go left → right
//		Think: horizontal
//		1 2 3 4   ← Row 0
//		5 6 7 8   ← Row 1

//		👉 Columns
//		Go top ↓ down
//		Think: vertical
//		1 2 3
//		↓ ↓ ↓
//		4 5 6
//		↓ ↓ ↓
//		7 8 9
		
		int row = matrix.length-1;
		int column = matrix[0].length-1;
//	    1 2 3 4
//	    5 1 2 3		
//		9 5 1 2
        for(int i=0 ;i<row;i++){
         
        	for(int j=0 ;j<column;j++){
           
            	//int ele=matrix[i][j];
                
            //	if(i<matrix.length-1 && j<matrix[0].length-1)
                
            		if(matrix[i][j] != matrix[i+1][j+1]) {
                    
            			return false;
                }
           } 
        }
        return true;
    }
	


	
}

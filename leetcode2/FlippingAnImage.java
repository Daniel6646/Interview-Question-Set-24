package LeetCode2;

public class FlippingAnImage {

	
//	Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
//
//			To flip an image horizontally means that each row of the image is reversed.
//
//			For example, flipping [1,1,0] horizontally results in [0,1,1].
//			To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//
//			For example, inverting [0,1,1] results in [1,0,0].
//			 
//
//			Example 1:
//
//			Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//			Output: [[1,0,0],[0,1,0],[1,1,1]]
//			Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//			Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
//			Example 2:
//
//			Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
//			Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//			Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
//			Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//			 
//
//			Constraints:
//
//			n == image.length
//			n == image[i].length
//			1 <= n <= 20
//			images[i][j] is either 0 or 1.

	
//	Intuition
	
//	The horizontal flip is performed by reversing the order of elements in each row.
//	Inversion is achieved by changing 0s to 1s and 1s to 0s.
//	The combination of these two operations creates the desired result.
//	Approach
//	1. Horizontal Flip:
//	For each row in the image, reverse the order of its elements. This effectively flips the image horizontally.
//
//	2. Invert:
//	Iterate through the flipped image and replace each 0 with 1 and each 1 with 0. This step achieves the inversion.
//
//	3. Return Result:
//	Return the resulting image after both horizontal flipping and inversion.
//
//	Complexity
//	Time complexity: O(N*M)
//	Space complexity: ON*M)

	
	
// SOLUTION
	
	
	 public int[][] flipAndInvertImage(int[][] image) {
	     
		 //int row = image.length;
		 //int column = image[0].length;
		 
		 int reverse[][] = new int[image[0].length][image.length];
		 
		 
		 for(int i=0;i<image.length;i++) {
		
			 int k = 0;

	            for(int j=image[i].length-1; j>=0; j--){
			 
				reverse[i][k++] =  image[i][j];
	            	
			 }
			 
		 }
	 
		 for(int i =0;i<reverse.length;i++) {
			 
			 for(int j=0; j<reverse[0].length ;j++) {
				 
				 if(reverse[i][j] == 1) {
					 
					 reverse[i][j] =0;
				 }
				 
				 else {
					 
					 reverse[i][j] =1; 
				 }
				 
			 }
		 }
		 
		 return reverse;
	  }
	
}

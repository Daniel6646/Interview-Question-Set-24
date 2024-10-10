package LeetCode2;

public class FloodFill {

	
//	You are given an image represented by an m x n grid of integers image, where image[i][j] represents the pixel value of the image. You are also given three integers sr, sc, and color. Your task is to perform a flood fill on the image starting from the pixel image[sr][sc].
//
//	To perform a flood fill:
//
//	Begin with the starting pixel and change its color to color.
//	Perform the same process for each pixel that is directly adjacent (pixels that share a side with the original pixel, either horizontally or vertically) and shares the same color as the starting pixel.
//	Keep repeating this process by checking neighboring pixels of the updated pixels and modifying their color if it matches the original color of the starting pixel.
//	The process stops when there are no more adjacent pixels of the original color to update.
//	Return the modified image after performing the flood fill.
//
//	 
//
//	Example 1:
//
//	Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
//
//	Output: [[2,2,2],[2,2,0],[2,0,1]]
//
//	Explanation:
//
//
//
//	From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.
//
//	Note the bottom corner is not colored 2, because it is not horizontally or vertically connected to the starting pixel.
//
//	Example 2:
//
//	Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
//
//	Output: [[0,0,0],[0,0,0]]
//
//	Explanation:
//
//	The starting pixel is already colored with 0, which is the same as the target color. Therefore, no changes are made to the image.
//
//	 
//
//	Constraints:
//
//	m == image.length
//	n == image[i].length
//	1 <= m, n <= 50
//	0 <= image[i][j], color < 216
//	0 <= sr < m
//	0 <= sc < n
//

	
	//   SOLUTION
	
//	
//	Approach
//	First we check if the newcolor is the same as the color of the source given, if it is so, we return the image as it is.
//
//	Else, perform dfs.
//	In the dfs function, firstly we check if the row and column are valid or not, also we check if the color of that pixel is same as origColor or not as if it is not we need not change that pixel, if any of these condition is true, we backrack.
//
//	Then we if we haven't backtracked, we will change the color of that pixel and perform the same operation on the pixels in all 4 directions of that pixel.
//	Note that if the same pixel is visited again, we will automatically backtrack since its color wouldn't be same as origColor and would be newColor.
//

	
	
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int m = image.length;
        int n = image[0].length;
        int origColor = image[sr][sc];
        
        if (newColor == origColor) return image;

        fill(image, sr, sc, origColor, newColor);
        return image;
    }

    private void fill(int[][] image, int row, int col, int origColor, int newColor) {
        if (row < 0 || col < 0 || row == image.length || col == image[0].length || image[row][col] != origColor) {
            return;
        }

        image[row][col] = newColor;

        fill(image, row - 1, col, origColor, newColor);
        fill(image, row + 1, col, origColor, newColor);
        fill(image, row, col + 1, origColor, newColor);
        fill(image, row, col - 1, origColor, newColor);
    }
	
}

package LeetCode;

public class ConstructRectangle {


	
//	A web developer needs to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:
//
//	The area of the rectangular web page you designed must equal to the given target area.
//	The width W should not be larger than the length L, which means L >= W.
//	The difference between length L and width W should be as small as possible.
//	Return an array [L, W] where L and W are the length and width of the web page you designed in sequence.
//
//	 
//
//	Example 1:
//
//	Input: area = 4
//	Output: [2,2]
//	Explanation: The target area is 4, and all the possible ways to construct it are [1,4], [2,2], [4,1]. 
//	But according to requirement 2, [1,4] is illegal; according to requirement 3,  [4,1] is not optimal compared to [2,2]. So the length L is 2, and the width W is 2.
//	Example 2:
//
//	Input: area = 37
//	Output: [37,1]
//	Example 3:
//
//	Input: area = 122122
//	Output: [427,286]
//	 
//
//	Constraints:
//
//	1 <= area <= 107
	
	
	//SOLUTION EXPLANATION
	
//	Let's break the code step by step:
//
//	The code defines a class named Solution.
//
//	Inside the class, a method called constructRectangle is declared. It takes an integer parameter area and returns an array of integers representing the dimensions of the rectangle.
//
//	The method starts by declaring an integer variable named wid and initializes it with the square root of the area using the Math.sqrt() function. This step calculates the width of the rectangle.
//
//	The code enters a while loop that continues as long as the remainder of area divided by wid is not equal to 0. In other words, the loop continues until wid is a factor of area.
//
//	Inside the loop, the program decrements the wid variable by 1 in each iteration. This step effectively searches for a width value that evenly divides the area.
//
//	Once the loop terminates, it means we have found a width value (wid) that divides the area evenly.
//
//	The next step is to calculate the height (hig) of the rectangle. It is obtained by dividing the area by the width (wid).
//
//	Finally, the method returns a new integer array containing the values of hig and wid. This array represents the dimensions of the constructed rectangle.
//
//	In summary, the constructRectangle method takes an area as input and calculates the width and height of a rectangle with that area. It starts by finding the width by taking the square root of the area and then searching for a width value that evenly divides the area. The height is obtained by dividing the area by the width. The method returns an array containing the height and width of the constructed rectangle.
//	
	
	
	public int[] constructRectangle(int area) {
    
	int width = (int) Math.sqrt(area);
		
	while(area%width !=0 ) {
		
		width--;
		
	}
	
	int height = area/width;
	
	int result[] = new int[] {height,width};
	
	
	return result;
    }
	
}

package LeetCode;

import java.util.Arrays;

public class AssignCookies {

	
//	Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
//
//	Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.
//
//	 
//
//	Example 1:
//
//	Input: g = [1,2,3], s = [1,1]
//	Output: 1
//	Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
//	And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
//	You need to output 1.
//	Example 2:
//
//	Input: g = [1,2], s = [1,2,3]
//	Output: 2
//	Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2. 
//	You have 3 cookies and their sizes are big enough to gratify all of the children, 
//	You need to output 2.
//	 
//
//	Constraints:
//
//	1 <= g.length <= 3 * 104
//	0 <= s.length <= 3 * 104
//	1 <= g[i], s[j] <= 231 - 1
	
	
//	Approach
//	Sort the arrays g (greed factors) and s (cookie sizes).
//	Initialize variables maxNum, cookieIndex, and childIndex to keep track of the count of content children, the current cookie index, and the current child index, respectively.
//	Iterate through the arrays, comparing the size of the current cookie (s[cookieIndex]) with the greed factor of the current child (g[childIndex]).
//	If the current cookie is large enough, increment maxNum, and move to the next smaller cookie and smaller child.
//	If the current cookie is not large enough, move to the next smaller child.
//	Continue this process until either the cookies or the children are exhausted.
//	Return the final count of content children (maxNum).
	
	
	
	   public int findContentChildren(int[] g, int[] s) {
	     
		   // array s cookie number
		   // array g cookie number
		   int cookieNumbers = s.length;
		   
		   if(cookieNumbers == 0) {
			   return 0;
			   
		   }
		   
		   int maxNum = 0;
		  int childIndex =  g.length - 1;
		  int cookieIndex = cookieNumbers - 1; 
		  
		  
		   Arrays.sort(g);
		   Arrays.sort(s);
		   
		   while( childIndex >=0 && cookieIndex >= 0 ) {
			   
			   
			   if(s[cookieIndex] >= g[childIndex]) {
			  
			   maxNum++;
			   childIndex--;
			   cookieIndex--;
			  
			   }
			   
			   else {
				   
				   childIndex--;
			   }
		   }
		   
		   
		   
		 return maxNum;  
	    }
	
}

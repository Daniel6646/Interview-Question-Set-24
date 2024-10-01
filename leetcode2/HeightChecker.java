package LeetCode2;

import java.util.Arrays;

public class HeightChecker {

//	A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
//
//	You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
//
//	Return the number of indices where heights[i] != expected[i].
//
//	 
//
//	Example 1:
//
//	Input: heights = [1,1,4,2,1,3]
//	Output: 3
//	Explanation: 
//	heights:  [1,1,4,2,1,3]
//	expected: [1,1,1,2,3,4]
//	Indices 2, 4, and 5 do not match.
//	Example 2:
//
//	Input: heights = [5,1,2,3,4]
//	Output: 5
//	Explanation:
//	heights:  [5,1,2,3,4]
//	expected: [1,2,3,4,5]
//	All indices do not match.
//	Example 3:
//
//	Input: heights = [1,2,3,4,5]
//	Output: 0
//	Explanation:
//	heights:  [1,2,3,4,5]
//	expected: [1,2,3,4,5]
//	All indices match.
//	 
//
//	Constraints:
//
//	1 <= heights.length <= 100
//	1 <= heights[i] <= 100

	
	
//	 Problem Explanation:

	
	//		 The "Height Checker" problem requires us to compare the given array of heights with its sorted version and count the number of mismatches.
//
//		  Input
//		 An array heights where heights[i] represents the height of the i-th student.
//		  Output
//		 An integer representing the number of students who are not in the correct positions.
//		  Thinking Behind the Solution:
//		 To solve this problem, we can follow these steps:
//
//		 Copy and Sort: Create a sorted copy of the input array.
//		 Compare: Compare the original array with the sorted array.
//		 Count Mismatches: Count the number of indices where the original and sorted arrays differ.
//		 This approach works because sorting the array gives us the order in which the heights should be arranged. By comparing the original array with this sorted array, we can directly count how many students are out of order.
//
//		 Let's walk through 🚶🏻‍♂️ the implementation process with an example for better understanding 🎯:
//		 Example:
//		 Input: heights = [1, 1, 4, 2, 1, 3]
//		 Sorted: [1, 1, 1, 2, 3, 4]
//
//		 Mismatches:
//		 Original: [1, 1, 4, 2, 1, 3]
//		 Sorted:   [1, 1, 1, 2, 3, 4]
//		             ^     ^     ^
//		 There are 3 mismatches, so the output is 3.
//		 
	//Implementation Steps:
//		 Create a sorted copy of the input array.
//		 Iterate through both the original and sorted arrays simultaneously.
//		 Count the number of positions where the elements differ.

	
	//		 Code:
//		 
			 class Solution {
		   
			public int heightChecker(int[] heights) {
		         
		    	 int[] sortedHeights = heights.clone();
		         Arrays.sort(sortedHeights);
		         int count = 0;
		     
		         for (int i = 0; i < heights.length; i++) {
		             if (heights[i] != sortedHeights[i]) {
		                 count++;
		             }
		         }
		         
		         return count;
		     }
		 }
	
	
}

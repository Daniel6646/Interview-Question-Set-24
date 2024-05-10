package LeetCode;

public class MaxAvgSubArray {

// 	You are given an integer array nums consisting of n elements, and an integer k.

// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

// Example 1:

// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
// Example 2:

// Input: nums = [5], k = 1
// Output: 5.00000
 

// Constraints:

// n == nums.length
// 1 <= k <= n <= 105
// -104 <= nums[i] <= 104

	
//
//	The intuition behind solving the Maximum Average Subarray problem is to find the maximum average of a subaray of length k within the given array
//
//	Approach
//	The idea is to use a sliding window technique. By using this algorithm, we avoid recalculating the sum of subarrays from scratch for each positions, allowing us to efficiently find the maximum average subarray.
	
	public double findMaxAverage(int[] nums, int k) {
    
		int average = 0;
		int maxaverage = 0;
		double result = 0;
		
		for(int i=0;i<k;i++) {
			
			average += nums[i];
			
		} 
		
		maxaverage = average;
		
		for(int i=k;i<nums.length;i++) {
		
			average = average +  nums[i] - nums[i-k];
			maxaverage =  Math.max(average, maxaverage);
			 	
		}

	
		
		return  (double) maxaverage /k;
    }
	
	
}

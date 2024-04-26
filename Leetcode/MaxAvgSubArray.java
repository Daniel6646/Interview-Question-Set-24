package LeetCode;

public class MaxAvgSubArray {

	

	
	
	
	
//	
//	
//	
//	
//	
//	
//	
//	The intuition behind solving the Maximum Average Subarray problem is to find the maximum average of a subaray of length k within the given array
//
//	Approach
//	The idea is to use a sliding window technique. By using this algorithm, we avoid recalculating the sum of subarrays from scratch for each positions, allowing us to efficiently find the maximum average subarray.
//	
//	
//	
//	
	
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

package LeetCode2;

public class IsMonotonicArray {

//	An array is monotonic if it is either monotone increasing or monotone decreasing.
//
//	An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
//
//	Given an integer array nums, return true if the given array is monotonic, or false otherwise.
//
//	 
//
//	Example 1:
//
//	Input: nums = [1,2,2,3]
//	Output: true
//	Example 2:
//
//	Input: nums = [6,5,4,4]
//	Output: true
//	Example 3:
//
//	Input: nums = [1,3,2]
//	Output: false
//	 
//
//	Constraints:
//
//	1 <= nums.length <= 105
//	-105 <= nums[i] <= 105

	
	
	public boolean isMonotonic(int[] nums) {
    
		boolean increasing = true;
		boolean decreasing = true;
		
		//for(int i=0; i<nums.length-1;i++)
		// if(nums[i] < nums[i+1]) 	increasing = false;

		// if(nums[i] > nums[i+1])  increasing = false;



		for(int i=1;i<nums.length;i++) {
			
			//we are finding out if it is either increasing 
			if(nums[i] < nums[i-1]) {
				
				increasing = false;
				
			}
			// or either decreasing
			if(nums[i] > nums[i-1]) {
				
				decreasing = false;
				
			}
			
		}
		// || or operator true true is true
		//  [ if one condition true then also true ],
		// both condn false then returns false
		return increasing || decreasing;
		
    }
	
	
}

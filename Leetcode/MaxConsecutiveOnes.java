package LeetCode;

public class MaxConsecutiveOnes {

//	Given a binary array nums, return the maximum number of consecutive 1's in the array.
//
//			 
//
//			Example 1:
//
//			Input: nums = [1,1,0,1,1,1]
//			Output: 3
//			Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//			Example 2:
//
//			Input: nums = [1,0,1,1,0,1]
//			Output: 2
//			 
//
//			Constraints:
//
//			1 <= nums.length <= 105
//			nums[i] is either 0 or 1.

	
	
	
	public int findMaxConsecutiveOnes(int[] nums) {
    
		int count = 0, maximum = 0;
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i] == 1 ) {
				
				count++;
				
				maximum = Math.max(count, maximum);
			}
			
			else {
				
				count =0;
				
			}
		}
		return maximum;
	
    }
	
}

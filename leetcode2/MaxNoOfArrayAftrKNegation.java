package LeetCode2;

import java.util.Arrays;

public class MaxNoOfArrayAftrKNegation {

//	Given an integer array nums and an integer k, modify the array in the following way:
//
//		choose an index i and replace nums[i] with -nums[i].
//		You should apply this process exactly k times. You may choose the same index i multiple times.
//
//		Return the largest possible sum of the array after modifying it in this way.
//
//		 
//
//		Example 1:
//
//		Input: nums = [4,2,3], k = 1
//		Output: 5
//		Explanation: Choose index 1 and nums becomes [4,-2,3].
//		Example 2:
//
//		Input: nums = [3,-1,0,2], k = 3
//		Output: 6
//		Explanation: Choose indices (1, 2, 2) and nums becomes [3,1,0,2].
//		Example 3:
//
//		Input: nums = [2,-3,-1,5,-4], k = 2
//		Output: 13
//		Explanation: Choose indices (1, 4) and nums becomes [2,3,-1,5,4].
//		 
//
//		Constraints:
//
//		1 <= nums.length <= 104
//		-100 <= nums[i] <= 100
//		1 <= k <= 104

	
	public static int largestSumAfterKNegations(int[] nums, int k) {
     
		for (int i = 0; i < k; i++) {
            Arrays.sort(nums);
            nums[0] = -nums[0];
        }
        int answer = 0;
        for (int num : nums) {
            answer += num;
        }
        return answer;
    }
	
	
	public static void main(String[] args) {
		
		int []nums1 = new int[] {4,2,3};
		int k1 =1;
		
		int []nums2 = new int[] {3,-1,0,2};
		int k2 =3;
		
		int []nums3 = new int[] {2,-3,-1,5,-4};
		int k3 = 2;
		
		int result = largestSumAfterKNegations(nums3, k3);
		System.out.println("Result :" +result);
	}
	
}


	

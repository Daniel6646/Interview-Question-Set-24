package LeetCode2;

import java.util.Arrays;
import java.util.HashMap;

public class LongestHarmoniousSubsequence {

	
//	We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
//
//	Given an integer array nums, return the length of its longest harmonious 
//	subsequence
//	 among all its possible subsequences.
//
//	 
//
//	Example 1:
//
//	Input: nums = [1,3,2,2,5,2,3,7]
//
//	Output: 5
//
//	Explanation:
//
//	The longest harmonious subsequence is [3,2,2,2,3].
//
//	Example 2:
//
//	Input: nums = [1,2,3,4]
//
//	Output: 2
//
//	Explanation:
//
//	The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.
//
//	Example 3:
//
//	Input: nums = [1,1,1,1]
//
//	Output: 0
//
//	Explanation:
//
//	No harmonic subsequence exists.
//
//	 
//
//	Constraints:
//
//	1 <= nums.length <= 2 * 104
//	-109 <= nums[i] <= 109

	
	
	
	public static void main(String[] args) {
	
	int array1[] = new int [] {1,2,3,4};	
	int array2[] = new int [] {1,3,2,2,5,2,3,7};	
	int array3[] = new int [] {1,1,1,1};	

	int result  = findLHS(array2);
	System.out.println("Result:: "+result);
	
	
	}
	
	
	//[1,3,2,2,5,2,3,7]
	// 1,2,2,2,3,3,5,7
	public static int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = 1, res = 0;
        
        while(r < nums.length) {
            
        	int diff = nums[r] - nums[l];
            
            if(diff == 1) 
            res = Math.max(res, r - l + 1);
            
            if(diff <= 1) 
            r++;
            
            else l++;
        }

        return res;
 
	 }
	
	public int findLHS2(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int res = 0;
        for(int num : freq.keySet()) {
            if(freq.containsKey(num + 1)) 
            res = Math.max(res, freq.get(num) + freq.get(num + 1));
        }

        return res;
    }
	
	
	
	
	
}
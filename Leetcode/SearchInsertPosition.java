package LeetCode;

public class SearchInsertPosition {

// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4
 

// Constraints:

// 1 <= nums.length <= 104
// -104 <= nums[i] <= 104
// nums contains distinct values sorted in ascending order.
// -104 <= target <= 104

	
	public static void main(String[] args) {
		
		int nums1[] = new int[] {1,3,5,6};
		//int nums2[] = new int [] {};
		int target1 = 5, target2 = 2, target3 = 7;
		int count = searchInsert(nums1, target3);
		System.out.println("Count:: "+count);
	}
	
	 public static int searchInsert(int[] nums, int target) {

		 int answer =0;
		 
		 for(int i=0; i<nums.length;i++) {
			 
			 if(nums[i] == target) {
				 
				answer =  i;
			 }
			 
			 else if (nums[i] < target) {
				 answer = i +1;
				 
			 }
			 
		 }
		 return answer;

	    }
	
}

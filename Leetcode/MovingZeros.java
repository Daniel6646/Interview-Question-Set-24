package LeetCode;

public class MovingZeros {

//	Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//	Note that you must do this in-place without making a copy of the array.
//
//	 
//
//	Example 1:
//
//	Input: nums = [0,1,0,3,12]
//	Output: [1,3,12,0,0]
//	Example 2:
//
//	Input: nums = [0]
//	Output: [0]
//	 
//
//	Constraints:
//
//	1 <= nums.length <= 104
//	-231 <= nums[i] <= 231 - 1
//	 
//
//	Follow up: 	 
	
	public static void main(String[] args) {
		
		int array1[] = new int[] {0,1,0,3,12};
		int array2[] = new int[] {0};
		//int result[] =  moveZeroes(array1);
		
		System.out.println("Final values ");

//		for(int i=0; i<result.length;i++) {
//			
//			System.out.println(result[i] + " ");
//		}
		
	}
	
	public static void  moveZeroes(int[] nums) {

		int nonZeroIndex = 0;
		int length = nums.length;

		if (nums.length == 1) {
			return ;
		}

		
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {

				nums[nonZeroIndex] = nums[i];
				nonZeroIndex++;
			}

		}
		
		   while(nonZeroIndex<nums.length){
	            nums[nonZeroIndex] = 0;
	            nonZeroIndex++;
	        }
		
		   return ;
	}

}

package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SetMismatch {

//	You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
//
//	You are given an integer array nums representing the data status of this set after the error.
//
//	Find the number that occurs twice and the number that is missing and return them in the form of an array.
//
//	 
//
//	Example 1:
//
//	Input: nums = [1,2,2,4]
//	Output: [2,3]
//	Example 2:
//
//	Input: nums = [1,1]
//	Output: [1,2]
//	 
//
//	Constraints:
//
//	2 <= nums.length <= 104
//	1 <= nums[i] <= 104
	
	
	public int[] findErrorNums(int[] nums) {
    
		int duplicateNumber = 0, index = 0;
		
		for(int i=0;i<nums.length;i++) {
			
			for(int j=i+1;j<nums.length;j++) {
				
				if(nums[i] == nums[j]) {
					
					duplicateNumber = nums[j];
					index = j;
				}
				
			}
		}
		
		int resultArray[] = new int[2];
			
			resultArray[1] = duplicateNumber;
			resultArray[2] = ++duplicateNumber;
		
		return resultArray;
    }
	
	//PROPER SOLUTION
//
//	 Approach 2(Vector)
//	 Array Initialization:
//
//	 Initialize a vector v of size n+1 with all elements set to 0. This array will be used to keep track of the occurrences of each number.
//	 Count Occurrences:
//
//	 Iterate through the given nums array and update the count of each number in the v array.
//	 Identify Duplicate and Missing:
//
//	 Iterate through the v array.
//	 If the count of a number is 2, it is the duplicate number.
//	 If the count of a number is 0, it is the missing number.
//	 Return Result:
//
//	 Return a vector containing the duplicate and missing numbers.

	
	 public int[] findErrorNums2(int[] nums) { 
		 
		 int duplicate =-1, missing = 0;
		 int count = 0;
		 
		 for(int i=1;i<=nums.length;i++) {
			 
			 count = 0;
			 for(int j=0;j<nums.length;j++) {
				 
				 
				 if(nums[j] == i) {
					 
					 count++;
					 
				 }
				  
			 }
			 
			 if(count == 2) {
				 
				 duplicate = i;
			 }
			 
			 else if( count == 0) {
				 
				 missing = i;
			 }
			 
		 }
		
		 int result[] = new int[] {duplicate,missing};
		 
		 return result;
		 
	 }
	        	

//	 Approach 4(Maps)
//	 Create an unordered_map mp to count the occurrences of numbers from 1 to n.
//	 Iterate through numbers in the input vector nums:
//	 Increment the count of each number in mp.
//	 Decrement the count of each number in mp.
//	 Iterate through the entries in mp:
//	 Identify the number with a count of -1 as the duplicate.
//	 Identify the number with a count of 1 as the missing number.	 
//	 

//	 
//	 Approach 4(Maps)
//	 Create an unordered_map mp to count the occurrences of numbers from 1 to n.
//	 Iterate through numbers in the input vector nums:
//	 Increment the count of each number in mp.
//	 Decrement the count of each number in mp.
//	 Iterate through the entries in mp:
//	 Identify the number with a count of -1 as the duplicate.
//	 Identify the number with a count of 1 as the missing number.
	 
	 public int[] findErrorNums4(int[] nums) {
	        int n = nums.length;
	        Map<Integer, Integer> mp = new HashMap<>();

	        for (int i = 1; i <= n; i++) {
	            mp.put(i, 0);
	        }

	        for (int a : nums) {
	            mp.put(a, mp.get(a) - 1);
	        }

	        int duplicate = 0, missing = 0;

	        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
	            if (entry.getValue() == -1) {
	                duplicate = entry.getKey();
	            }
	            if (entry.getValue() == 1) {
	                missing = entry.getKey();
	            }
	        }

	        return new int[]{duplicate, missing};
	    }
}

package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisappearedNumberInArray {

// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
// Example 2:

// Input: nums = [1,1]
// Output: [2]
 

// Constraints:

// n == nums.length
// 1 <= n <= 105
// 1 <= nums[i] <= n
 

// Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.	
	
	
//	 public static List<Integer>findDisappearedNumbers(int[] arr)
//		{
//		   List<Integer>al=new ArrayList<>();
//	           int n=arr.length;
//		   for(int i=1;i<=n;i++)
//	             if(linearSearch(arr,n,i)==false) {
	//	               al.add(i);
//}
//		       
//		   return al;
//		}
//		
//	    public static boolean linearSearch(int[] arr,int n,int key)
//		{
//		   for(int i=0;i<n;i++)
//	             if(arr[i]==key)
//	               return true;
//		     
//		   return false;
//		}
	
// solution 3 using hashset	
	
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
		
		Set<Integer> set = new HashSet<>();
		List<Integer> resultantList = new ArrayList<Integer>();
		int arrayLenght = nums.length;
		
		for(int i=0;i<nums.length;i++) {
			
			set.add(nums[i]);
		}
		
		
		for(int i=1;i<=arrayLenght;i++) {
			
			if(set.contains(i) == false) {
				
				resultantList.add(i);
			}
		}
	
		
		return resultantList;
	}

	
}

package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayIntersection1 {

	
//	Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
//
//			 
//
//			Example 1:
//
//			Input: nums1 = [1,2,2,1], nums2 = [2,2]
//			Output: [2]
//			Example 2:
//
//			Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//			Output: [9,4]
//			Explanation: [4,9] is also accepted.
//			 
//
//			Constraints:
//
//			1 <= nums1.length, nums2.length <= 1000
//			0 <= nums1[i], nums2[i] <= 1000

	
	
	
	public static void main(String[] args) {
		
		int nums1[] = new int[] {1,2,2,1};
		int nums2[] = new int[] {2,2};
		
		
		int resultArray[]  = intersection(nums1, nums2);
		
		for(int i=0;i<resultArray.length;i++)
		{
			System.out.print(resultArray[i] + " ");
		}
		
	}
	
//	  public static int[] intersection2(int[] nums1, int[] nums2) {
//	     
//		  
//		  int result[] = new int [nums1.length] ;
//		  int count =0, k=0;
//		  
//		  for(int i=0; i<nums1.length;i++) {
//			  
//			  for(int j=0;j<nums2.length;j++) {
//				  
//				  if(nums1[i] == nums2[j] ) {
//					  
//					  count++;
//				  }
//			  }
//				  if(count >=2 ) {
//					  
//					 int temp = nums2[i];
//					  result[k] = temp ;
//					  k++;
//				  }
//				  count = 0;
//			 
//		  }
//		  return result;
//	    }
	
	  
	  public static int[] intersection(int[] nums1, int[] nums2) { 
		  
		  Set<Integer> set = new HashSet<>();
		  List<Integer> list = new ArrayList<>();
		  
		  for(int i=0; i<nums1.length;i++) {
			  
			  set.add(nums1[i]);
		  }
		 
		  for(int j=0; j<nums2.length;j++) {
			  
			  if(set.contains(nums2[j])) {
				  
				  list.add(nums2[j]);
			  }
			  
			  set.remove(nums2[j]);
			  
		  }
		  
		  int resultArray[]  = new int [list.size()] ;
		  
		  for(int i=0; i< list.size(); i++) {
			  
			  resultArray[i] = list.get(i);
		  }
		  
		  
		  return resultArray;
		  
	  }

	  public static int[] intersection2(int[] nums1, int[] nums2) { 
		  
		  Set<Integer> hashSet1 = new HashSet<>();
		  Set<Integer> hashSet2 = new HashSet<>();
		  
		  for(int i : nums1) {
			  
			  hashSet1.add(i);
		  }
		  
		  for(int j=0; j<nums2.length;j++) {
			  
			  if(hashSet1.contains(nums2[j])) {
				  
				  hashSet2.add(nums2[j]);
			  }
		  }
		  
		  int resultArray[] = new int [hashSet2.size()] ;
		  
		  int l =0;
		  for( int  k: hashSet2) {
			  
			 resultArray[l] = k;
			 l++;
		  }
		  return resultArray;
	  }

	  
	  
}

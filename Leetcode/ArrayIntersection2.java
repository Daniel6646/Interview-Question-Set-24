package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayIntersection2 {

//	Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
//
//			 
//
//			Example 1:
//
//			Input: nums1 = [1,2,2,1], nums2 = [2,2]
//			Output: [2,2]
//			Example 2:
//
//			Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//			Output: [4,9]
//			Explanation: [9,4] is also accepted.
//			 
//
//			Constraints:
//
//			1 <= nums1.length, nums2.length <= 1000
//			0 <= nums1[i], nums2[i] <= 1000
//			 
	
	public static void main(String[] args) {
		
		int array1[] = new int [] {1,2,2,1};
		int array2[] = new int [] {2,2};
		int array3[] = new int [] {4,9,5};
		int array4[] = new int [] {9,4,9,8,4};
		
		int result[] = intersect(array1, array2);
				
		for(int k=0; k< result.length; k++) {
			
			System.out.print(result[k] + " ");
		}
		
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		List<Integer> list = new ArrayList<>();
		
		int n1 = nums1.length;
		int n2 = nums2.length;
		
		int i=0,j=0;
		
		while(i < n1 && j < n2) {
			
			if ( nums1[i] == nums2[j]) {
				
				list.add(nums1[i]);
				i++;// to avoid duplicate move both these pointers
				j++;// to avoid duplicate move both these pointers
			} 
			
			else if (nums1[i] < nums2[j]) {
				
				i++;
			}
			
			else {
				
				j++;
			}
			
		}
		
		int result[] = new int [list.size()];
		int l =0;
		
		for(int k=0; k< list.size(); k++) {
			
			result[k] = list.get(k);
		}
		
		return result;
	}
	

	
}

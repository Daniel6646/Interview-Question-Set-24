package LeetCode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RelativeSortArray {

//	Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
//
//	Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
//
//	 
//
//	Example 1:
//
//	Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//	Output: [2,2,2,1,4,3,3,9,6,7,19]
//	Example 2:
//
//	Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
//	Output: [22,28,8,6,17,44]
//	 
//
//	Constraints:
//
//	1 <= arr1.length, arr2.length <= 1000
//	0 <= arr1[i], arr2[i] <= 1000
//	All the elements of arr2 are distinct.
//	Each arr2[i] is in arr1.
	
	
	
	    public int[] relativeSortArray(int[] arr1, int[] arr2) {
	        List<Integer> result = new ArrayList<>();

	        // Traverse through the relative order array
	        for (int i = 0; i < arr2.length; i++) {
	            // Traverse through the target array
	            for (int j = 0; j < arr1.length; j++) {
	                // If element in target array matches with relative order element
	                if (arr1[j] == arr2[i]) {
	                    // Add it to the result array
	                    result.add(arr1[j]);
	                    // Mark the element in target array as visited
	                    arr1[j] = -1;
	                }
	            }
	        }

	        // Sort the remaining elements in the target array
	        Arrays.sort(arr1);
	        // Add the remaining elements to the result array
	        for (int i = 0; i < arr1.length; i++) {
	            if (arr1[i] != -1) {
	                result.add(arr1[i]);
	            }
	        }

	        // Convert ArrayList to array
	        int resultArr[] = new int[result.size()];
	        
	        int i=0;
	        for(int res: result) {
	        	
	        	resultArr[i] = res;
	        	i++;
	        }
	        
	        return resultArr;
	    }
	
	
}

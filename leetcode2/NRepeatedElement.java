package LeetCode2;

import java.util.Arrays;
import java.util.HashSet;

public class NRepeatedElement {

//	You are given an integer array nums with the following properties:
//
//		nums.length == 2 * n.
//		nums contains n + 1 unique elements.
//		Exactly one element of nums is repeated n times.
//		Return the element that is repeated n times.
//
//		 
//
//		Example 1:
//
//		Input: nums = [1,2,3,3]
//		Output: 3
//		Example 2:
//
//		Input: nums = [2,1,2,5,3,2]
//		Output: 2
//		Example 3:
//
//		Input: nums = [5,1,5,2,5,3,5,4]
//		Output: 5
//		 
//
//		Constraints:
//
//		2 <= n <= 5000
//		nums.length == 2 * n
//		0 <= nums[i] <= 104
//		nums contains n + 1 unique elements and one of them is repeated exactly n times.
	
	
	
	
	
	public int repeatedNTimes1(int[] arr) {
        HashSet<Integer> hp = new HashSet<>();

        for(var a : arr){
            if(hp.contains(a)) return a;
            else hp.add(a);
        }
        return -1;
    }
	
    public int repeatedNTimes2(int[] nums) {
        
    	int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        
        for(int i=0;i<n-1;i++){
        
        	if(nums[i]==nums[i+1]) {
                ans = nums[i];
                break;
            
        	}
        }
        return ans;
    }

	
    public int repeatedNTimes3(int[] nums) {
        int i,j;
    
        for(i=0;i<nums.length;i++){
        
        	for(j=i+1;j<nums.length;j++){
            
        		if(nums[i]==nums[j]){
                
        			return nums[i];
                
        		}
            }
        }
        return nums[i];
    }
    
}

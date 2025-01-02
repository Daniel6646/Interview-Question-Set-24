package LeetCode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurence {

	
//	Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
//
//			 
//
//			Example 1:
//
//			Input: arr = [1,2,2,1,1,3]
//			Output: true
//			Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
//			Example 2:
//
//			Input: arr = [1,2]
//			Output: false
//			Example 3:
//
//			Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
//			Output: true
//			 
//
//			Constraints:
//
//			1 <= arr.length <= 1000
//			-1000 <= arr[i] <= 1000

	
	
	

//approach 1

	 public boolean uniqueOccurrences(int[] arr) {
		    
		    Arrays.sort(arr);
			int count=1;
		    List<Integer> list= new  ArrayList<Integer>();


		    for(int i=0;i<arr.length-1;i++)
		    {
		        if(arr[i]==arr[i+1])
		            count++;
		        
		        else
		        {
		            list.add(count);
		            count=1;
		        }
		        
		    }
		    
		    list.add(count);
		    
		    Collections.sort(list);
		    
		    
		    for(int i=0;i<list.size()-1;i++)
		    {
		        if(list.get(i)==list.get(i+1))
		            return false;
		    }
		    
		    return true;
		    }

//APPROACH2	 
	 public boolean uniqueOccurrences2(int[] arr) {
	        Map<Integer, Integer> freq = new HashMap<>();
	        for (int x : arr) {
	            freq.put(x, freq.getOrDefault(x, 0) + 1);
	        }

	        Set<Integer> s = new HashSet<>();
	        for (int x : freq.values()) {
	            s.add(x);
	        }

	        return freq.size() == s.size();
	    }
	 
	 
	 
	
}

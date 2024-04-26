package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {

//	You are given a sorted unique integer array nums.
//
//	A range [a,b] is the set of all integers from a to b (inclusive).
//
//	Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
//
//	Each range [a,b] in the list should be output as:
//
//	"a->b" if a != b
//	"a" if a == b
//	 
//
//	Example 1:
//
//	Input: nums = [0,1,2,4,5,7]
//	Output: ["0->2","4->5","7"]
//	Explanation: The ranges are:
//	[0,2] --> "0->2"
//	[4,5] --> "4->5"
//	[7,7] --> "7"
//	Example 2:

//	Input: nums = [0,2,3,4,6,8,9]
//	Output: ["0","2->4","6","8->9"]
//	Explanation: The ranges are:
//	[0,0] --> "0"
//	[2,4] --> "2->4"
//	[6,6] --> "6"
//	[8,9] --> "8->9"
	
	public static void main(String[] args) {
		
	}

	public static List<String> summaryRange(int nums[]) {

       
		
		List<String> list = new ArrayList<>();
		
			for(int i=0; i<nums.length; i++) {
		
			int start = nums[i];
			
			while(i+1 < nums.length && nums[i]+1 == nums[i+1] ) {
			
				i++;
              
			}
				
				if(start != nums[i]) {
	
					list.add(""+start+"->"+nums[i]);
				}
				
				else {
					
					list.add(""+start);
				}
			
		}
		return list;

    }
	
	

	
	public static List<String> summaryRange2(int nums[]) {

        
		
		List<String> result = new ArrayList<>();
		
		if(nums.length == 0 || nums == null) {
			
			return result;
		}
		
		int i = 0;
		int length = nums.length;
	
		
		while(i < length) {
			
			String range = String.valueOf(nums[i]) ;
			String rangeEnd = "";
			
			while(i+1 < length && nums[i+1] - nums[i] == 1 ) {
				
				 rangeEnd =  String.valueOf(nums[++i]) ;
			}
			
			if(rangeEnd.length() > 0) {
				
				range = range + "->" + rangeEnd;
			}
			result.add(range);
			i++;
			
		} 
		

		return result;
		
	}
	
	
}

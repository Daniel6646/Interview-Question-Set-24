package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RelativeRanks {

//	You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.
//
//	The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
//
//	The 1st place athlete's rank is "Gold Medal".
//	The 2nd place athlete's rank is "Silver Medal".
//	The 3rd place athlete's rank is "Bronze Medal".
//	For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
//	Return an array answer of size n where answer[i] is the rank of the ith athlete.
//
//	 
//
//	Example 1:
//
//	Input: score = [5,4,3,2,1]
//	Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
//	Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
//	Example 2:
//
//	Input: score = [10,3,8,9,4]
//	Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
//	Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].
//
//	 
//
//	Constraints:
//
//	n == score.length
//	1 <= n <= 104
//	0 <= score[i] <= 106
//	All the values in score are unique
	
	
	
	
	public String[] findRelativeRanks(int[] score) {
    
		//to arrange in descending order
		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		
		for(int i=0;i<score.length;i++) {
			
			
			pqueue.add(score[i]);
		}
		
		Map<Integer, String> map = new HashMap<>();
		int idx = 1;
		
		while(!pqueue.isEmpty()) {
			
			
			if(idx ==1) {
				
				map.put(pqueue.remove(), "Gold Medal");
			}
			
			if(idx ==2) {
				
				map.put(pqueue.remove(), "Silver Medal");
			}
			
			if(idx ==3) {
				
				map.put(pqueue.remove(), "Bronze Medal");
			}
			
			else {
				
				map.put(pqueue.remove(), String.valueOf(idx));
			}
			idx++;
		}
		
		String result[] = new String[score.length];
		
		for(int i=0; i<score.length;i++) {
			
			result[i]  = map.get(score[i]);
		}
		
		return result;
    }
	
	
	
	//
//	
//	public String[] findRelativeRanks(int[] score) {
//    
//		int sortedArray[] = arrayInDescending(score);
//		
//		Map<Integer, String> map = new HashMap<>();
//		int idx = 1;
//		
//		for(int i=0;i<sortedArray.length;i++) {
//			
//			if(idx == 1) {
//				map.put(idx, "Gold Medal");
//			}
//			
//			if(idx == 2) {
//				map.put(idx, "Silver Medal");
//			}
//		
//			if(idx == 3) {
//				map.put(idx, "Bronze Medal");
//			}
//			
//			
//			else {
//				map.put(idx, String.valueOf(i));
//			}
//			idx++;
//		}
//		
//		
//		String finalArray[] = new String [score.length] ;
// 		
//		for(int i =0;i<score.length;i++) {
//			
//		finalArray[i] = map.get(score[i]);
//
//		}
//		return finalArray;
//    }
//	
//	
//	
//	public int[] arrayInDescending(int array[]) {
//		
//		
//		int temp = 0;
//		
//		for(int i=0;i<array.length;i++) {
//			
//			for(int j=i+1;j<array.length;j++) {
//				
//				if(array[i] < array[j] ) {
//					
//					temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//				} 
//			}
//			
//		}
//		return array;
//	}
//




}

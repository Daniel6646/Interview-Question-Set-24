package LeetCode;

public class SmallestLetterGreaterThanTarget {
	
	
//	You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
//
//	Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
//
//	 
//
//	Example 1:
//
//	Input: letters = ["c","f","j"], target = "a"
//	Output: "c"
//	Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
//	Example 2:
//
//	Input: letters = ["c","f","j"], target = "c"
//	Output: "f"
//	Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
//	Example 3:
//
//	Input: letters = ["x","x","y","y"], target = "z"
//	Output: "x"
//	Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
//	 
	

	//SOLUTION
	
	
//	
//	Intuition
//	Given that the array letters is sorted in non-decreasing order, and the problem asks for the smallest character lexicographically greater than the target, binary search seems like a suitable approach. The sorted nature of the array suggests that we can efficiently narrow down the search space to find the desired character.
//
//	Approach
//	Binary Search: Start with a binary search approach. Initialize pointers start and end to the first and last indices of the array, respectively. In each iteration:
//
//	Calculate the middle index (mid).
//	If the target is less than the character at mid, update end to mid - 1 because the desired character, if present, must be in the left half.
//	If the target is greater than or equal to the character at mid, update start to mid + 1 as the desired character, if present, must be in the right half.
//	Wrap Around: Since the array is circular, consider the wrap-around case. Return letters[start % letters.length] to handle cases where the search extends beyond the end of the array.
	
	public char nextGreatestLetter(char[] letters, char target) {
	   
		int start = 0;
	    int end = letters.length - 1;
	    
	    while (start <= end) {
	    
	      int mid = start + (end - start) / 2;
	      
	      if (target < letters[mid]) {
	        end = mid - 1;
	      }
	      else {
	        start = mid + 1;
	      }
	    
	    }
	    
	    return letters[start % letters.length];
	  }
	
	
}

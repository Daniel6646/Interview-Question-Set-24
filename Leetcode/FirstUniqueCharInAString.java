package LeetCode;

import java.util.HashMap;

public class FirstUniqueCharInAString {

	
	
//	Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//
//			 
//
//			Example 1:
//
//			Input: s = "leetcode"
//			Output: 0
//			Example 2:
//
//			Input: s = "loveleetcode"
//			Output: 2
//			Example 3:
//
//			Input: s = "aabb"
//			Output: -1
//			 
//
//			Constraints:
//
//			1 <= s.length <= 105
//			s consists of only lowercase English letters.

	
	
	public static void main(String[] args) {
		
		
		String s1 = "leetcode";
		String s2 = "loveleetcode";
		String s3 = "";
		int result = firstUniqChar(s1);
		System.out.println("Result "+result);
	}
			
		
		public static int firstUniqChar(String s) { 
			
			HashMap<Character, Integer> map = new HashMap<>();
			
			//getOrDefault will add a value for that key if key already there +1 as map does not hold duplicate keys
			for(Character a: s.toCharArray()) {
				
				map.put(a, map.getOrDefault(a, 0)+1 );
			}
			
			for(int i=0;i<s.length(); i++) {
				
				if(map.get(s.charAt(i)) ==1 ) {
					return i;
				}
			}
			
			return -1;
		}
	
		
	
	public static int firstUniqChar2(String s) { 
		
		int count = 1, visited = -1, foundOrNot = 0;
		
		int frequency[] = new int[s.length()];
		
		for(int i=0;i<s.length();i++) {
			
			count = 1;
			for(int j = i+1; j<s.length(); j++) {
				
				if(s.charAt(i) == s.charAt(j)) {
					
					count++;
					frequency[j] = visited;
				}
				
				if(frequency[i] != visited ) {
					
					frequency[i] = count;
				}
				
			}
		
		}
		
		
		
	
		for(int k=0; k<frequency.length;k++) {
			
			if(frequency[k] == 1) {
				
				foundOrNot =  k;
				break;
			}
			
			else {
				foundOrNot = -1;
			}
		}
		
		return foundOrNot;
	}

	
}

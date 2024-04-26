package LeetCode;

public class SegmentsInString {

	
//	Given a string s, return the number of segments in the string.
//
//			A segment is defined to be a contiguous sequence of non-space characters.
//
//			 
//
//			Example 1:
//
//			Input: s = "Hello, my name is John"
//			Output: 5
//			Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
//			Example 2:
//
//			Input: s = "Hello"
//			Output: 1
//			 
//
//			Constraints:
//
//			0 <= s.length <= 300
//			s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:".
//			The only space character in s is ' '.

	
	
		public int countSegments(String s) {
        
		if(s.length() == 0 ) {
			
			return s.length();
		}	
			
		int count = 1;
		
		char strArray[] = s.toCharArray();
			
		for(int i=0;i<strArray.length;i++) {
			
			if(strArray[i] == ' ') {
				
				count++;
			}
		}
		
		if(count ==1) {
			
			return count;
		}
		
		return count;
		
    }
		
		 public int countSegments2(String s) {
			 
			 
			String words[] = s.split(" ");
			int count = 0;
			
			
			for(String word: words) {
				
				if(!word.isEmpty()) {
					
					count++;
				}
			}
			
		return count;	
		 }
	
}

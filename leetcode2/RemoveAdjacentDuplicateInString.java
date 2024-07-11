package LeetCode2;

public class RemoveAdjacentDuplicateInString {

	
//	You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
//
//	We repeatedly make duplicate removals on s until we no longer can.
//
//	Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
//
//	 
//
//	Example 1:
//
//	Input: s = "abbaca"
//	Output: "ca"
//	Explanation: 
//	For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
//	Example 2:
//
//	Input: s = "azxxzy"
//	Output: "ay"
//	 
//
//	Constraints:
//
//	1 <= s.length <= 105
//	s consists of lowercase English letters.
//	Seen this question in a real interview before?

	
	 public String removeDuplicates(String s) {
	     
		 
		 StringBuilder strbuilder = new StringBuilder();
		 
		 char charArray[] = s.toCharArray();
		 
		 for(int i=0;i<charArray.length;i++) {
			 
			 
			 if(strbuilder.length()>0 && 
					 charArray[i] == strbuilder.charAt(strbuilder.length()-1)) {
				 
				 strbuilder.deleteCharAt(strbuilder.length()-1);
				 
			 }
			 
			 else {
				 
				 strbuilder.append(charArray[i]);
			 }
			 
		 }
		 
		 return strbuilder.toString();
	    }
	
}

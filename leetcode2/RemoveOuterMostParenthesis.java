package LeetCode2;

public class RemoveOuterMostParenthesis {

//	A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
//
//	For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
//	A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
//
//	Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
//
//	Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
//
//	 
//
//	Example 1:
//
//	Input: s = "(()())(())"
//	Output: "()()()"
//	Explanation: 
//	The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
//	After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
//	Example 2:
//
//	Input: s = "(()())(())(()(()))"
//	Output: "()()()()(())"
//	Explanation: 
//	The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
//	After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
//	Example 3:
//
//	Input: s = "()()"
//	Output: ""
//	Explanation: 
//	The input string is "()()", with primitive decomposition "()" + "()".
//	After removing outer parentheses of each part, this is "" + "" = "".
//	 
//
//	Constraints:
//
//	1 <= s.length <= 105
//	s[i] is either '(' or ')'.
//	s is a valid parentheses string.
	
	
	public static void main(String[] args) {
		
		String s1 = "(()())(())(()(()))";
		String result = removeOuterParentheses(s1);
		System.out.println("Result" +result);
		
	}
	
	
	public static String removeOuterParentheses(String s) {
        
	    int len = s.length();
        if (len <= 2) return ""; 
		 
		char chars[] = s.toCharArray();
		int openBracket = 1; 
		StringBuilder strbuilder = new StringBuilder();
		
		for(int i =1; i<len;i++) {
		 
		 if(chars[i] == '(' ) {
			 
			 
			 openBracket++;
			 
			 if(openBracket > 1) {
				 strbuilder.append('(');	 
			 }
			 
		 }
		 
		 else {
			 
			 if(openBracket > 1) {
				 
				 strbuilder.append(')');
			 }
			 openBracket--;

		 }
 		 
		}
		return strbuilder.toString();
	
    }
	
}

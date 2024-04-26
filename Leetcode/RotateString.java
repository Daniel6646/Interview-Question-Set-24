package LeetCode;

public class RotateString {

//	Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
//
//			A shift on s consists of moving the leftmost character of s to the rightmost position.
//
//			For example, if s = "abcde", then it will be "bcdea" after one shift.
//			 
//
//			Example 1:
//
//			Input: s = "abcde", goal = "cdeab"
//			Output: true
//			Example 2:
//
//			Input: s = "abcde", goal = "abced"
//			Output: false
//			 
//
//			Constraints:
//
//			1 <= s.length, goal.length <= 100
//			s and goal consist of lowercase English letters.

	
	
public boolean rotateString(String s, String goal) {
        
        StringBuilder ans = new StringBuilder(s);

        for(int i=0; i<s.length(); i++){

            char ch = ans.charAt(0);
            ans.deleteCharAt(0);

            ans.append(ch);

            if(ans.toString().equals(goal)) return true;
        }

        return false;
    }
	
}

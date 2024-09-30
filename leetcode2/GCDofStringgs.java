package LeetCode2;

public class GCDofStringgs {

//	For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
//
//			Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
//
//			 
//
//			Example 1:
//
//			Input: str1 = "ABCABC", str2 = "ABC"
//			Output: "ABC"
//			Example 2:
//
//			Input: str1 = "ABABAB", str2 = "ABAB"
//			Output: "AB"
//			Example 3:
//
//			Input: str1 = "LEET", str2 = "CODE"
//			Output: ""
//			 
//
//			Constraints:
//
//			1 <= str1.length, str2.length <= 1000
//			str1 and str2 consist of English uppercase letters.
//	

	
	public String gcdOfStrings(String str1, String str2) {
		// Check if concatenated strings are equal or not, if not return ""
		if (!(str1 + str2).equals(str2 + str1))
			return "";
		// If strings are equal than return the substring from 0 to gcd of size(str1),
		// size(str2)
		int gcd = gcd(str1.length(), str2.length());
		return str1.substring(0, gcd);
	}

	private int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	
// SOLUTION 2	
	public String gcdOfStrings2(String str1, String str2) {
		if (!(str1 + str2).equals(str2 + str1)) {
			return "";
		}
		int j = gcd2(str1.length(), str2.length());
		return str1.substring(0, j);
	}

	public static int gcd2(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd2(b, a % b);
	}	
	
	
	
	
	
	
}

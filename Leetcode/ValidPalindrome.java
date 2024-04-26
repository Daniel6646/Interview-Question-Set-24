package LeetCode;

public class ValidPalindrome {

//	Example 1:
//
//		Input: s = "A man, a plan, a canal: Panama"
//		Output: true
//		Explanation: "amanaplanacanalpanama" is a palindrome.
//		Example 2:
//
//		Input: s = "race a car"
//		Output: false
//		Explanation: "raceacar" is not a palindrome.
//		Example 3:
//
//		Input: s = " "
//		Output: true
//		Explanation: s is an empty string "" after removing non-alphanumeric characters.
//		Since an empty string reads the same forward and backward, it is a palindrome.
//		 
//
//		Constraints:
//
//		1 <= s.length <= 2 * 105
//		s consists only of printable ASCII characters.
	
	
	public static void main(String[] args) {
		
	}
	
	public static boolean isPalindrome(String str) {
		
		StringBuilder stringBuilder = new StringBuilder();
		String reverseString = "", finalString =" ";
		boolean flag = true;
		
		
	char charString[] = str.toCharArray();
		
	for(int i=0; i< charString.length; i++) {
		
		if(Character.isLetterOrDigit(charString[i])) {
			
			stringBuilder.append(Character.toLowerCase(charString[i]) );
		}
		
	}
	
		 finalString = stringBuilder.toString(); 
		 reverseString = stringBuilder.reverse().toString();
		
		if(finalString.equals(reverseString) ) {
			
			flag  = true;;
		}
		
		else {
			
			flag = false;
		}
		return flag;
	}
	
}


//
//public boolean isPalindrome(String s) {
//    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//    StringBuilder sb = new StringBuilder(s);
//    return s.equals(sb.reverse().toString());
//}
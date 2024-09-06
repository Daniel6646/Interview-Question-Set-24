package LeetCode2;

public class ReverseWordsInAString {

//	Given an input string s, reverse the order of the words.
//
//	A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
//
//	Return a string of the words in reverse order concatenated by a single space.
//
//	Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
//
//	 
//
//	Example 1:
//
//	Input: s = "the sky is blue"
//	Output: "blue is sky the"
//	Example 2:
//
//	Input: s = "  hello world  "
//	Output: "world hello"
//	Explanation: Your reversed string should not contain leading or trailing spaces.
//	Example 3:
//
//	Input: s = "a good   example"
//	Output: "example good a"
//	Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
//	 
//
//	Constraints:
//
//	1 <= s.length <= 104
//	s contains English letters (upper-case and lower-case), digits, and spaces ' '.
//	There is at least one word in s.
//	 
//
//	Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
//

	public static void main(String[] args) {
		
		String str = "the sky is blue";
		String result = reverseWords(str);
		System.out.println("Final String:: "+result);
	
	}
	
    public static String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
        //        for (int i = str.length - 1; i >= 0; i--) {
	
            // Append the current word and a space to the output
            out += str[i] + " ";
        }
        System.out.println("Normal final str "+out );
        System.out.println("after adding last element " +out + str[0]);
        // Append the first word to the output (without trailing space)
        return out + str[0];
    }

	
}

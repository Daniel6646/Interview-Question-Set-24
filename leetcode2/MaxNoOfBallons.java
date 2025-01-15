package LeetCode2;

public class MaxNoOfBallons {

//	Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
//
//	You can use each character in text at most once. Return the maximum number of instances that can be formed.
//
//	 
//
//	Example 1:
//
//
//
//	Input: text = "nlaebolko"
//	Output: 1
//	Example 2:
//
//
//
//	Input: text = "loonbalxballpoon"
//	Output: 2
//	Example 3:
//
//	Input: text = "leetcode"
//	Output: 0
//	 
//
//	Constraints:
//
//	1 <= text.length <= 104
//	text consists of lower case English letters only.
//	 
//
//	Note: This question is the same as 2287: Rearrange Characters to Make Target String.
//
//	Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
//
//	You can use each character in text at most once. Return the maximum number of instances that can be formed.
//
//	 
//
//	Example 1:
//
//
//
//	Input: text = "nlaebolko"
//	Output: 1
//	Example 2:
//
//
//
//	Input: text = "loonbalxballpoon"
//	Output: 2
//	Example 3:
//
//	Input: text = "leetcode"
//	Output: 0
//	 
//
//	Constraints:
//
//	1 <= text.length <= 104
//	text consists of lower case English letters only.
//	 
//
//	Note: This question is the same as 2287: Rearrange Characters to Make Target String.
//

	
	
	
    public int maxNumberOfBalloons(String text) {
        int a = 0, b = 0, l = 0, o = 0, n = 0, i = 0;

     for (char c: text.toCharArray()){
         switch (c){
             case 'a' -> a++;
             case 'b' -> b++;
             case 'l' -> l++;
             case 'n' -> n++;
             case 'o' -> o++;
         }
         if (a >= 1 && b >= 1 && n >= 1 && l >= 2 && o >= 2)
         {
             i++;
             a -= 1; b -= 1; n -= 1; l -= 2; o -= 2;
         }
     }
     
     return i; 
     }
	
}

package LeetCode2;

public class ReverseOnlyLetters {

//	Given a string s, reverse the string according to the following rules:
//
//		All the characters that are not English letters remain in the same position.
//		All the English letters (lowercase or uppercase) should be reversed.
//		Return s after reversing it.
//
//		 
//
//		Example 1:
//
//		Input: s = "ab-cd"
//		Output: "dc-ba"
//		Example 2:
//
//		Input: s = "a-bC-dEf-ghIj"
//		Output: "j-Ih-gfE-dCba"
//		Example 3:
//
//		Input: s = "Test1ng-Leet=code-Q!"
//		Output: "Qedo1ct-eeLg=ntse-T!"
//		 
//
//		Constraints:
//
//		1 <= s.length <= 100
//		s consists of characters with ASCII values in the range [33, 122].
//		s does not contain '\"' or '\\'.
	
	 public String reverseOnlyLetters(String s) {
	     
		 char temp[] = s.toCharArray();      
	        int low = 0 , high = s.length()-1;
	     
	        while(low < high){
	        
	        	if(Character.isAlphabetic(temp[low]) && Character.isAlphabetic(temp[high])){
	                char i = temp[low];temp[low] = temp[high];
	                temp[high] = i;//   Please UPVOTE \U0001f64b‍♂️\U0001f64b\U0001f481\U0001f647\U0001f647\U0001f647‍♂️\U0001f647‍♀️\U0001f647\U0001f647
	                low++; high--;
	            }
	        	
	        	else if(!Character.isAlphabetic(temp[low]))  
	        		low++;
	            
	        	else if(!Character.isAlphabetic(temp[high]))  
	        		high--;   
	        }
	        return String.valueOf(temp);
	    
	 }
	
}

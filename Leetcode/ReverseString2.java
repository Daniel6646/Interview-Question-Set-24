package LeetCode;

public class ReverseString2 {

	
//	Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
//
//	If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
//
//	 
//
//	Example 1:
//
//	Input: s = "abcdefg", k = 2
//	Output: "bacdfeg"
//	Example 2:
//
//	Input: s = "abcd", k = 2
//	Output: "bacd"
//	 
//
//	Const
	
	 public String reverseStr(String s, int k) {
	        char[] str = s.toCharArray();
	        int n = str.length;
	        for(int i = 0 ; i <= n-1; i += 2*k){
	            if(i+k-1 <= n-1){
	                reverseK(i,i+k-1,str);// acc to i=0 and its next element is less than lenght to reverse, then i=4 and i+k-1 4+2-1 = 5 less than length then ii and i+k-1 reverse it
	            }else{
					//for fewer than k characters left (edge case)
	                reverseK(i,n-1,str);
	            }
	        }
	        String ans = new String(str);
	        return ans;
	    }
	    public void reverseK(int i, int j, char[] str) {
	        while(i < j){
	            char temp = str[i];
	            str[i] = str[j];
	            str[j] = temp;
	            i++;
	            j--;
	        }
	
	    	}

}

package LeetCode;

public class IsSubsequence {

	public static void main(String[] args) {
		
	}
	
	 public boolean isSubsequence(String s, String t) { 
		 
		 int i=0, j=0;
		 
		 while(i < s.length() && j < t.length()) {
			 
			 if(s.charAt(i) == t.charAt(j)) {
				 
				 i++;
			 }
			 j++;
		 }
		 return i == s.length();
	 }

	
	 public boolean isSubsequence2(String s, String t) {
	     
		 boolean flag = false;
		 int count = 0;
	
		 for(int i=0; i<s.length();i++) {
			 
			 for(int j=0;j<t.length();j++) {
				 
				 if(s.charAt(i) == t.charAt(j)) {
					 
					 count++;
				 }
				 
			 }
			 
		 }
		 return count == s.length();

	 }
	
}

package LeetCode;

public class FirstOccurence {

	 public int strStr(String haystack, String needle) {
	     
//		int index = haystack.indexOf(needle);		 
//	   
//		return index;
		 
		 if(haystack.contains(needle)) {
			 
			 return haystack.indexOf(needle);
		 }
		 return -1;
	 }
	
}

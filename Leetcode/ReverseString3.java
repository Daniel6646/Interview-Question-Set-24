package LeetCode;

public class ReverseString3 {

	
	
//	Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
//	 
//
//	Example 1:
//
//	Input: s = "Let's take LeetCode contest"
//	Output: "s'teL ekat edoCteeL tsetnoc"
//	Example 2:
//
//	Input: s = "Mr Ding"
//	Output: "rM gniD"
//	 
//
//	Constraints:
//
//	1 <= s.length <= 5 * 104
//	s contains printable ASCII characters.
//	s does not contain any leading or trailing spaces.
//	There is at least one word in s.
//	All the words in s are separated by a single space.
//

	
//	SOLUTION 1
	public String reverseWords(String s) {
    
		
		String str[] =  s.split(" ");
		StringBuilder reverse = new StringBuilder();
		
		for(String word : str) {
			
			StringBuilder reverseWord = new StringBuilder(word);
			reverseWord.reverse();
			reverse.append(reverseWord).append(" ");
			
		}
		
		return reverse.toString().trim();
		
		
    }
	
	// SOLUTION 2
	public String reverseWords2(String s) { 
		
		String finalString = "";
		String words[] = s.split(" ");
		
		for(int i=0; i<words.length;i++) {
			
			finalString +=  reverseString(words[i]);
			
		}
		
		return finalString;
		
	}
	
	public String reverseString (String string) {
		
		
		char charWords[] = string.toCharArray();
		int i=0;
		int j = charWords.length;
		
		char temp = charWords[i];
		charWords[i] = charWords[j];
		charWords[j] = temp;
		i++;
		j--;
		
		
		String finalString = new String(charWords);
		
		return finalString;
	}

	
	
	
	
	
	
	
	//SOLUTION 3
	
	 public String reverseWords(String s) {
	      String[] f=s.split(" ");
	      String l=" ";
	      for(int i=0;i<f.length;i++){
	          l+=revWord(f[i]);
	          if(i<f.length-1) l+=" ";
	      }
	        return l.trim();
	    }
	    public String revWord(String s3){
	          char[] a=s3.toCharArray();
	        int i=0;
	        int j=a.length-1;
	        while(i<j){
	            char temp=a[i];
	            a[i]=a[j];
	            a[j]=temp;
	            i++;
	            j--;
	        }
	        String s1=new String(a);
	        return s1;

	    }
	
	
}

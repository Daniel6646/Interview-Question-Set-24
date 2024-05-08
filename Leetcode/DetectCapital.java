package LeetCode;

public class DetectCapital {

	
	
	
//	
//	We define the usage of capitals in a word to be right when one of the following cases holds:
//
//		All letters in this word are capitals, like "USA".
//		All letters in this word are not capitals, like "leetcode".
//		Only the first letter in this word is capital, like "Google".
//		Given a string word, return true if the usage of capitals in it is right.
//
//		 
//
//		Example 1:
//
//		Input: word = "USA"
//		Output: true
//		Example 2:
//
//		Input: word = "FlaG"
//		Output: false
//		 
//
//		Constraints:
//
//		1 <= word.length <= 100
//		word consists of lowercase and uppercase English letters.

	
	
	
	

	
	
	
	
	
	 public boolean detectCapitalUse(String word) {
	    	
	        String[] words=word.split(" "); // if a single string contains multiple words 
	        boolean bool=false;
	       
	        for(int i=0; i<words.length; i++){
	         
	        	bool=detectCapital(words[i]);
	          
	        	if(!bool) {
	        		return false;
	        	}         //checking all the strings are in the form or not 
	       
	        }
	        return true;
	     }
	    
	    
	     public boolean detectCapital(String word){
	        
	    	 int capital=0;
	         int lower=0;
	         char b=word.charAt(0);
	         
	         if(b>='a' && b<='z') 
	        	 return smaller(word);  
	         
	         for(int i=1; i<word.length(); i++){
	            
	        	 char a=word.charAt(i);
	            
	        	 if(a>='A' && a<='Z')
	        		 capital++;
	             
	        	 else 
	        		 lower++;
	        	 
	             if(!(capital==0 || lower==0))
	            	 return false;
	         }
	         return true;
	     }
	     
	     public boolean smaller(String word){    //for this type of cases mLLLLL
	         
	    	 for(int i=1; i<word.length(); i++){
	         
	    		 char a=word.charAt(i);
	           
	    		 if(a>='A' && a<='Z') 
	    			 return false;
	         }
	    	 
	         return true;
	     }
		
	

	
	
	public boolean detectCapitalUse2(String word) {
        int capital = 0, small = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
                small++;
            else
                capital++;
        }
        if((capital == 1 && (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')) || capital == word.length() || word.length() == 1 || capital == 0)
	{
	return true;
	}
		return false;
    }
	
	
	
	
	
	
	
	
	
//	public boolean detectCapitalUse( String word) {
//		
//		
//		String words[] = word.split(" ");
//		boolean flag = false;
//		
//		for(int i=0;i<words.length;i++) {
//			
//			String wordFromArray =  words[i];
//			flag =  detectCapital(wordFromArray);
//			
//			if(flag != true) {
//				
//				return false;
//			}
//		}
//		
//		return true;
//
//	}
//
//	public boolean detectCapital(String wordFromArray) {
//
//		int capitalCount = 0;
//		int lowerCount = 0;
//		
//		char firstChar = wordFromArray.charAt(0);
//		if(firstChar >= 'a' || firstChar <= 'z') {
//			return smallerWord(wordFromArray);
//		}
//		
//		for(int i=1; i<wordFromArray.length(); i++) {
//			
//			 char a = wordFromArray.charAt(i);
//			if(a >= 'A' || a <= 'Z') {
//				
//			capitalCount++;
//				
//			}
//			
//			else {
//				
//				lowerCount++;
//			}
//			
//			if(!(capitalCount ==0 || lowerCount ==0)) {
//				
//				return true;
//				
//			} 
//			
//		}
//		
//		
//		return false;
//	}
//
//	public boolean smallerWord(String wordFromArray) {
//
//		for(int i=1; i<wordFromArray.length();i++) {
//			
//			char smallerWord =  wordFromArray.charAt(i);
//			
//			if(smallerWord >= 'A' && smallerWord <= 'Z') {
//				
//				return false;
//			}
//		
//		}
//		return true;
//	}
//	
//	
	
	
	
	
	
	
	
	
	}
	


package LeetCode;

public class RansomNote {

//	Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//			Each letter in magazine can only be used once in ransomNote.
//
//			 
//
//			Example 1:
//
//			Input: ransomNote = "a", magazine = "b"
//			Output: false
//			Example 2:
//
//			Input: ransomNote = "aa", magazine = "ab"
//			Output: false
//			Example 3:
//
//			Input: ransomNote = "aa", magazine = "aab"
//			Output: true
//			 
//
//			Constraints:
	
//	Ok ok I got it. So for those who were lost just like me, just forget about the existence of ransomNote and magazine and consider them as string1 and string2.
//	string1 = "aa", string2 = "aab"
//	We want to verify if string1 is a subset of string2 i.e if all the letters of string1 are present in string2. If yes then return true else return false
//

		public boolean canConstruct(String ransomNote, String magazine) {
    
		int count[] = new int[25];
	
		for(char ch : magazine.toCharArray()) {
	
			//ascii value of a is 97 so we are adding count in array of character
			//for eg char a so 97-97 = 0 so on 0th index increase count so it will be one
			//if char is b so b-a so 98-97 =1 so on 1st index count will be 1 due to ++; 
			count[ch - 'a']++;
				
		}
		
		for(char ch : ransomNote.toCharArray()) {
			
			if(count[ch-'a'] == 0) {
				return false;
			}
			count[ch-'a']--;
			
		}
	return true;
	
	}
	
	
	public boolean canConstruct2(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) return false;
     
		//array to store alphabets as total aphabets is 26
		int[] alphabets_counter = new int[26];
        
		//ascii value of a is 97 so we are adding count in array of character
		//for eg char a so 97-97 = 0 so on 0th index increase count so it will be one
		//if char is b so b-a so 98-97 =1 so on 1st index count will be 1 due to ++; 
        // for eg aab then in array it will be 0th element = 2 due to 2 a and 1st element will be 1 due to b
		//ch -'a'i.e 97-97 = 0 means count[0] for ch-'a' b-'a' 98-97 is 1 so count[1]++
		
		for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        
        
        for (char c : ransomNote.toCharArray()){
            
        	//for eg element in ransomNote is not in magzine
        	// as per our question if ransomnote has elements/ subset of magazine then return true
        	//for eg: ransomnote = aa magazine = aab, so as aa is present in aab then it is true
        	//eg charac d so d is 100 so a is 97 aplabet_counter[100-97] aplbt_counter[3] = 0 means element not present return false;
        	if (alphabets_counter[c-'a'] == 0) 
        		return false;
            
            alphabets_counter[c-'a']--;
        }
        return true;
    }
}

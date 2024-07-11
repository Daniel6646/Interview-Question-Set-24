package LeetCode2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacter {

	
//	Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

	
//			Example 1:
//
//			Input: words = ["bella","label","roller"]
//			Output: ["e","l","l"]
//			Example 2:
//
//			Input: words = ["cool","lock","cook"]
//			Output: ["c","o"]
//			 
//
//			Constraints:
//
//			1 <= words.length <= 100
//			1 <= words[i].length <= 100
//			words[i] consists of lowercase English letters.

		
//	
//	Initialization: The function initializes an empty list res to store the common characters and a set word1 with the characters from the first word in the input list.
//	Loop Through Characters: It then iterates over each character in word1.
//	Find Minimum Frequency: For each character, it finds the minimum frequency of that character across all words in the input list using a list comprehension.
//	Add to Result: Finally, it adds the character to the result list res that many times.
	
		
	public List<String> commonChars(String[] words) {
    
		String firstWord =  words[0];
		Map<Character, Integer> firstMap = new HashMap<>();
        
		//Storing the frequency of each letter in HashMap	
		for(int i=0;i<firstWord.length();i++) {
			
			char c = firstWord.charAt(i);
			firstMap.put(c, firstMap.getOrDefault(c, 0)+1);
			
		}
		
		for(int i=1;i<words.length;i++) {
			
			String word = words[i];
			Map<Character, Integer> secondMap = new HashMap<>();
			
            //Storing the frequency of each letter of each word in the array. 
			for(int j=0;j<word.length();j++) {
				
				char c = word.charAt(j);
				secondMap.put(c, secondMap.getOrDefault(c, 0)+1);	
				
			}
			
            //Comparing and finding the minimum frequency of the each letter in both in the words.
			for(Character key :firstMap.keySet()) {
				
				if(secondMap.containsKey(key) & firstMap.get(key) > 0 ) {
					
					firstMap.put(key, Math.min(secondMap.get(key), firstMap.get(key))); 
					
				}
				else {
					
					firstMap.put(key, 0);
				}
				
			}
			
			
		}
		
		//The loop for array of strings has ended.
        //Creating a List for storing all the characters common to all the word.
		List<String> result = new ArrayList<>();
	
		for(Character key: firstMap.keySet()) {
			
		  if(firstMap.get(key) > 0 ) {
			
			  for(int i=0; i<firstMap.get(key);i++) {
				  
				  result.add(key+"");
				  
			  }
			  
		  }
		}
		return result;
    }
	
	
}

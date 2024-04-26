package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

//	Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
//
//			In the American keyboard:
//
//			the first row consists of the characters "qwertyuiop",
//			the second row consists of the characters "asdfghjkl", and
//			the third row consists of the characters "zxcvbnm".
//
//			 
//
//			Example 1:
//
//			Input: words = ["Hello","Alaska","Dad","Peace"]
//			Output: ["Alaska","Dad"]
//			Example 2:
//
//			Input: words = ["omk"]
//			Output: []
//			Example 3:
//
//			Input: words = ["adsdf","sfd"]
//			Output: ["adsdf","sfd"]
//			 
//
//			Constraints:
//
//			1 <= words.length <= 20
//			1 <= words[i].length <= 100
//			words[i] consists of English letters (both lowercase and uppercase). 

	
	
	public String[] findWords(String[] words) {
    

        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 ="zxcvbnmZXCVBNM";
		
        int j =0;
        List<String> resultantList = new ArrayList<>();
		for(int i=0;i<words.length;i++) {
			
			String word = words[i];
			
			if(checkRowOne(word, row1)  ) {
				
				j++;
				resultantList.add(word);
				
			}
			
			if(checkRowTwo(word, row2)  ) {
				
				j++;
				resultantList.add(word);
				
			}
			
			if(checkRowTwo(word, row3)  ) {
				
				j++;
				resultantList.add(word);
				
			}
			
		}
		
		String resultArray[] = new String[resultantList.size()];
		
		for(int i =0; i<resultantList.size();i++) {
			
		resultArray[i] = resultantList.get(i);
			
		}
				
		return resultArray;
    }
	
	
	public boolean checkRowOne(String word, String row) {
		
		int count = 0;
		
		for(int i=0;i<word.length();i++) {
			
		 	char ch =  word.charAt(i);
		 	
		 	if(row.contains(""+ch)) {
		 		
		 		count++;
		 		
		 	}
 		}
		
		if(count == word.length()) {
			
			return true;
		}
		
		else {
			
			return false;
		}
		
		
	}

	
	public boolean checkRowTwo(String word, String row) {
		
		int count = 0;
		
		for(int i=0;i<word.length();i++) {
			
		 	char ch =  word.charAt(i);
		 	
		 	if(row.contains(""+ch)) {
		 		
		 		count++;
		 		
		 	}
 		}
		
		if(count == word.length()) {
			
			return true;
		}
		
		else {
			
			return false;
		}
		
		
	}
	
	
	public boolean checkRowThree(String word, String row) {
		
		int count = 0;
		
		for(int i=0;i<word.length();i++) {
			
		 	char ch =  word.charAt(i);
		 	
		 	if(row.contains(""+ch)) {
		 		
		 		count++;
		 		
		 	}
 		}
		
		if(count == word.length()) {
			
			return true;
		}
		
		else {
			
			return false;
		}
		
		
	}
	

}

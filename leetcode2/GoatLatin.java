package LeetCode2;

public class GoatLatin {

	public String toGoatLatin(String sentence) {
    
//		You are given a string sentence that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.
//
//		We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:
//
//		If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
//		For example, the word "apple" becomes "applema".
//		If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
//		For example, the word "goat" becomes "oatgma".
//		Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
//		For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.
//		Return the final sentence representing the conversion from sentence to Goat Latin.
//
//		 
//
//		Example 1:
//
//		Input: sentence = "I speak Goat Latin"
//		Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
//		Example 2:
//
//		Input: sentence = "The quick brown fox jumped over the lazy dog"
//		Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
//		 
//
//		Constraints:
//
//		1 <= sentence.length <= 150
//		sentence consists of English letters and spaces.
//		sentence has no leading or trailing spaces.
//		All the words in sentence are separated by a single space.
//

		
		
		String vowels = "aeiouAEIOU";
		String words[] = sentence.split(" ");
		StringBuffer strbuff = new StringBuffer();
		int i=1;
		
		for(String word: words) {
			
			char ch = word.charAt(0);
			
		if(vowels.indexOf(ch) != -1) {
			
			
			strbuff.append(word);
		}	
		
		else {
			
			strbuff.append(word.substring(1));
			strbuff.append(ch);
		}
			
		
		strbuff.append("ma");
		strbuff.append("a".repeat(i++));
		strbuff.append(" ");

	
	}
		
	return strbuff.toString().substring(0, strbuff.toString().length()-1);
		
		
    }
	
	
	public String toGoatLatin2(String sentence) {
        
		String[] str=sentence.split(" ");
        StringBuilder ans=new StringBuilder();
        StringBuilder x=new StringBuilder();
        
        for(int i=0;i<str.length;i++){
         
        	x.append("a");
            
        	if(isVowel(str[i])){
                ans.append(str[i]);
            }
        	
        	else{
            
        		ans.append(str[i].substring(1));
                ans.append(str[i].charAt(0));
            }
        	
            ans.append("ma");
            ans.append(x);
            
            if(i<str.length-1) 
            ans.append(" ");
        
        }
        return ans.toString();
    }
    
	public boolean isVowel(String s){
        
		char ch=s.charAt(0);
        
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') 
        	return true;
        
        
        return false;
    }
	
}

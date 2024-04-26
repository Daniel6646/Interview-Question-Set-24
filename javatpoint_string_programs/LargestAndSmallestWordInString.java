package javatpoint_string_programs;

public class LargestAndSmallestWordInString {

	public static void main(String[] args) {
		
	String string = "Hardships often prepare ordinary people for an extraordinary destiny";
	String word = "";
	int index= 0;
	String wordArray[] = new String[100];
	String smallestWord ,largestWord ;
	
	for(int i=0;i<string.length(); i++) {
		
		if(string.charAt(i) !=' ') {
			
			word = word + string.charAt(i);
			
		}
		
		else {
			wordArray[index] = word;
			
			index++;
			word = "";
		}
	}
	
	smallestWord = wordArray[0];
	largestWord = wordArray[0];
	
	for (int i=0; i< index;i++) {
		
		if(smallestWord.length() > wordArray[i].length() ) {
			
			smallestWord = wordArray[i];
		}
	}
	
	for (int i=0; i< index;i++) {
		
		if(largestWord.length() < wordArray[i].length() ) {
			
			largestWord = wordArray[i];
		}
	}
	
	System.out.println("Smallest word in the string:: "+smallestWord);
	System.out.println("Largest word in the string:: "+largestWord);

	
	}
}

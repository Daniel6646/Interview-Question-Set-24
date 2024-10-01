package LeetCode2;

import java.util.ArrayList;
import java.util.List;

public class OccurenceAfterBigram {

//	Given two strings first and second, consider occurrences in some text of the form "first second third", where second comes immediately after first, and third comes immediately after second.
//
//	Return an array of all the words third for each occurrence of "first second third".
//
//	 
//
//	Example 1:
//
//	Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
//	Output: ["girl","student"]
//	Example 2:
//
//	Input: text = "we will we will rock you", first = "we", second = "will"
//	Output: ["we","rock"]
//	 
//
//	Constraints:
//
//	1 <= text.length <= 1000
//	text consists of lowercase English letters and spaces.
//	All the words in text are separated by a single space.
//	1 <= first.length, second.length <= 10
//	first and second consist of lowercase English letters.
//	text will not have any leading or trailing spaces.
	
	
	public String[] findOcurrences(String text, String first, String second) {

		String[] words = text.split(" "); // Split the text into words.
		List<String> ans = new ArrayList<>(); // Use a dynamic list to collect answers.

		// Iterate through the words, stopping at the third-to-last to avoid
		// out-of-bounds access.
		for (int i = 0; i <= words.length - 3; i++) {
			if (words[i].equals(first) && words[i + 1].equals(second)) {
				ans.add(words[i + 2]); // Add the word following the first and second words to the answer list.
			}
		}

		// Convert the List to an array of strings to match the return type.
		// return ans.toArray(new String[0]);

		String[] resultArray = new String[ans.size()];
		for (int i = 0; i < ans.size(); i++)
			resultArray[i] = ans.get(i);
		return resultArray;

	}
}

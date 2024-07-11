package LeetCode2;

import java.util.ArrayList;
import java.util.List;

public class PositionOfLargeGroups {

	
//	In a string s of lowercase letters, these letters form consecutive groups of the same character.
//
//	For example, a string like s = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z", and "yy".
//
//	A group is identified by an interval [start, end], where start and end denote the start and end indices (inclusive) of the group. In the above example, "xxxx" has the interval [3,6].
//
//	A group is considered large if it has 3 or more characters.
//
//	Return the intervals of every large group sorted in increasing order by start index.
//
//	 
//
//	Example 1:
//
//	Input: s = "abbxxxxzzy"
//	Output: [[3,6]]
//	Explanation: "xxxx" is the only large group with start index 3 and end index 6.

//	Example 2:
//
//	Input: s = "abc"
//	Output: []
//	Explanation: We have groups "a", "b", and "c", none of which are large groups.
//	Example 3:
//
//	Input: s = "abcdddeeeeaabbbcd"
//	Output: [[3,5],[6,9],[12,14]]
//	Explanation: The large groups are "ddd", "eeee", and "bbb".
//	 
//
//	Constraints:
//
//	1 <= s.length <= 1000
//	s contains lowercase English letters only.
//	
	public List<List<Integer>> largeGroupPositions(String s) {

		List<List<Integer>> resultList = new ArrayList<>();
		List<Integer> tempList = new ArrayList<>();
		int count = 1;

		for (int i = 0; i < s.length() - 1; i++) {
            // Increment the count until the next element is the same as the previous element. Ex: "aaa"
			if (s.charAt(i) == s.charAt(i + 1)) {

				count++;
			}

            // Add the first and last indices of the substring to the list when the next element is different from the previous element. Ex: "aaab"
			else if (s.charAt(i) != s.charAt(i + 1) && count >= 3) {
			
                // gives the starting index of substring
				tempList.add(i - count + 1);
                // gives the last index of substring 
				tempList.add(i);
				resultList.add(tempList);
				count = 1;
				tempList = new ArrayList<>();

			}

			else {

				count = 1;
			}

		}

        // Check for a large group at the end of the string. Ex: "abbb".
		if (count >= 3) {

			tempList.add(s.length() - count);
			tempList.add(s.length() - 1);
			resultList.add(tempList);

		}
		return resultList;
	}
	
}

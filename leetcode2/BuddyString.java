package LeetCode2;

public class BuddyString {

//	Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
//
//			Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
//
//			For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
//			 
//
//			Example 1:
//
//			Input: s = "ab", goal = "ba"
//			Output: true
//			Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
//			Example 2:
//
//			Input: s = "ab", goal = "ab"
//			Output: false
//			Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
//			Example 3:
//
//			Input: s = "aa", goal = "aa"
//			Output: true
//			Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
//			 
//
//			Constraints:
//
//			1 <= s.length, goal.length <= 2 * 104
//			s and goal consist of lowercase letters.

	public boolean buddyStrings(String s, String goal) {

		int n = s.length();
		int m = goal.length();

		char[] ch = s.toCharArray();
		char[] ch1 = goal.toCharArray();

		if (n != m) {
			return false;
		}

		if (n < 2) {
			return false;
		}

		int count = 0;
		int max = 0;

		if (n > 26) {

			for (int b = 0; b < n; b++) {

				if (ch[b] == ch1[b]) {
					max = max + 1;

				}
			}
			System.out.println(max);
			System.out.println(n);
			System.out.println(m);

			if (max == n | max == n - 2) {
				return true;
			}
		}

		else {

			char same = s.charAt(0);
			for (int k = 0; k < n; k++) {

				if (s.charAt(k) == same && same == goal.charAt(k)) {
					same = s.charAt(k);
					count++;
				} else {

					for (int i = 0; i < n; i++) {
						int j = 0;
						for (j = i + 1; j < n; j++) {
							char c = ch[i];
							ch[i] = ch[j];
							ch[j] = c;
							
							String s1 = new String(ch);
						
							if (s1.equals(goal)) {
								return true;
							}
							
							if (j < n) {
								char c1 = ch[j];
								ch[j] = ch[i];
								ch[i] = c1;

							}
						}

					}
				}
			}
		}

		if (count == n) {
			return true;
		}

		return false;
	}

}

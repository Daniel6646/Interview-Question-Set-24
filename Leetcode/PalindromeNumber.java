package LeetCode;

public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		int temp = x;
		int reverse = 0;

		if (x < 0) {
			return false;
		}

		while (temp != 0) {

			int lastDigit = temp % 10;
			reverse = reverse * 10 + lastDigit;
			temp = temp / 10;

		}

		if (x == reverse) {
			return true;
		}

		else {
			return false;
		}

	}
}

package LeetCode;

public class GuessNumberHigherOrLower {

//	We are playing the Guess Game. The game is as follows:
//
//		I pick a number from 1 to n. You have to guess which number I picked.
//
//		Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
//
//		You call a pre-defined API int guess(int num), which returns three possible results:
//
//		-1: Your guess is higher than the number I picked (i.e. num > pick).
//		1: Your guess is lower than the number I picked (i.e. num < pick).
//		0: your guess is equal to the number I picked (i.e. num == pick).
//		Return the number that I picked.
//
//		 
//
//		Example 1:
//
//		Input: n = 10, pick = 6
//		Output: 6
//		Example 2:
//
//		Input: n = 1, pick = 1
//		Output: 1
//		Example 3:
//
//		Input: n = 2, pick = 1
//		Output: 1
//		 
	
	
//	EXPLANATION::
//	-1 : My number is lower
//	1 : My number is higher
//	0 : Congrats! You got it!
//
//	Here "My" means the number which is given for you to guess not the number you put into guess(int num)
//	

	
// here guess is an call to an api that will return a particular value	
	
	public int guessNumber(int n) {

		int low = 1, high = n;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			//guess is an api
			if (guess(mid) == 0) {

				return mid;
			}

			else if (guess(mid) == 1) {

				low = mid + 1;

			}

			else {

				high = mid - 1;
			}

		}
		return low;

	}
	
}

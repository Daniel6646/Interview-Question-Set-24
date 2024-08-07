package LeetCode;

public class FibonacciSeries {

	
//	
//	The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//
//	F(0) = 0, F(1) = 1
//	F(n) = F(n - 1) + F(n - 2), for n > 1.
//	Given n, calculate F(n).
//
//	 
//
//	Example 1:
//
//	Input: n = 2
//	Output: 1
//	Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
//	Example 2:
//
//	Input: n = 3
//	Output: 2
//	Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
//	Example 3:
//
//	Input: n = 4
//	Output: 3
//	Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
//	 
//
//	Constraints:
//
//	0 <= n <= 30

	
	 public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
	
	public int fib2(int n) {

		if (n <= 1) {

			return n;
		}

		/* Declare an array to store Fibonacci numbers. */
		int f[] = new int[n + 1]; // 1 extra to handle case, n = 0

		/* 0th and 1st number of the series are 0 and 1 */
		f[0] = 1;
		f[1] = 1;

		for (int i = 2; i <= n; i++) {
			/* Add the previous 2 numbers in the series and store it */
			f[i] = f[i - 1] + f[i - 2];
		}

		// value in array after iteration
//        		f0 =1
//        		f1 = 1
//        		f2 = 2
//        		f3 = 3
//        		f4 = 5

		return f[n - 1];
		// n-1 because here our array stats from 0 index and normal fibonacco series number will start from 1 like normal numbers
	}

}

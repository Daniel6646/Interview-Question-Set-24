package LeetCode;

public class ArrangingCoins {

// You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

// Given the integer n, return the number of complete rows of the staircase you will build.
	
//	EXAMPLE 1
//	
//	Input: n = 5
//	Output: 2
//	Explanation: Because the 3rd row is incomplete, we return 2.
//			
//	EXAMPLE 2
//	Input: n = 8
//	Output: 3.
//	Explanation: Because the 4th row is incomplete, we return 3.
	
	
    public int arrangeCoins(int n) {
        int i = 1; // which row we are on
        
		while(n > 0){ // checking to see if we have used all our coins
			
			i++; // increasing our row
			
			n = n-i; // adding coins to our row
		}
		
		return i-1; // we return our current row minus one because the last row is our completed row
    }
	
}

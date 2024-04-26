package LeetCode;

public class ArrangingCoins {

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

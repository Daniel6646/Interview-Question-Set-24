package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaseballGame {

	
//	You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
//
//	You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
//
//	An integer x.
//	Record a new score of x.
//	'+'.
//	Record a new score that is the sum of the previous two scores.
//	'D'.
//	Record a new score that is the double of the previous score.
//	'C'.
//	Invalidate the previous score, removing it from the record.
//	Return the sum of all the scores on the record after applying all the operations.
//
//	The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
//
//	 
//
//	Example 1:
//
//	Input: ops = ["5","2","C","D","+"]
//	Output: 30
//	Explanation:
//	"5" - Add 5 to the record, record is now [5].
//	"2" - Add 2 to the record, record is now [5, 2].
//	"C" - Invalidate and remove the previous score, record is now [5].
//	"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
//	"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
//	The total sum is 5 + 10 + 15 = 30.
//	Example 2:
//
//	Input: ops = ["5","-2","4","C","D","9","+","+"]
//	Output: 27
//	Explanation:
//	"5" - Add 5 to the record, record is now [5].
//	"-2" - Add -2 to the record, record is now [5, -2].
//	"4" - Add 4 to the record, record is now [5, -2, 4].
//	"C" - Invalidate and remove the previous score, record is now [5, -2].
//	"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
//	"9" - Add 9 to the record, record is now [5, -2, -4, 9].
//	"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
//	"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
//	The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
//	Example 3:
//
//	Input: ops = ["1","C"]
//	Output: 0
//	Explanation:
//	"1" - Add 1 to the record, record is now [1].
//	"C" - Invalidate and remove the previous score, record is now [].
//	Since the record is empty, the total sum is 0.
//	 
//
//	Constraints:
//
//	1 <= operations.length <= 1000
//	operations[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 104, 3 * 104].
//	For operation "+", there will always be at least two previous scores on the record.
//	For operations "C" and "D", there will always be at least one previous score on the record.
	
	
	public int calPoints(String[] operations) {
		
		
		Stack<Integer> stack = new Stack<>();
		int sum = 0;
		
		//The stack is a linear data structure that is used to store the collection of objects. It is based on Last-In-First-Out (LIFO). Java collection framework provides many interfaces and classes to store the collection of objects. One of them is the Stack class that provides different operations such as push, pop, search, etc.
		
		for(String str : operations) {
			
			if(str.equals("+")) {
				
				int a =stack.pop();
				int b = stack.pop();
				int c = a + b;
				stack.push(b);
				stack.push(a);
				stack.push(c);
			}
		
			
			
			else if(str.equals("D")) {
				
				int a =  stack.pop();
				int x = a * 2;
				stack.push(a);
				stack.push(x);
			}
			
			else if(str.equals("C")) {
				
				stack.pop();
			}
			
			else {
				
				stack.push(Integer.parseInt(str));
			}
			
		}
		
		for (int stackValues : stack) {
			
			sum += stackValues;
			
		}
		
		return sum;
	}
	
	
	//Alternate Solution
    public int calPoints2(String[] operations) {
        
        int[] scores = new int[operations.length];
        int size = 0;
        
        for (String op : operations) {
            if (op.equals("+")) {
                scores[size] = scores[size - 1] + scores[size - 2];
                size++;
            } else if (op.equals("D")) {
                scores[size] = 2 * scores[size - 1];
                size++;
            } else if (op.equals("C")) {
                size--;
            } else {
                scores[size] = Integer.parseInt(op);
                size++;
            }
        }
        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += scores[i];
        }
        
        return sum;
    }

	
	
}

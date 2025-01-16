package LeetCode2;

public class NoOfEquivalentDominoPairs {

/*Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a == c and b == d), or (a == d and b == c) - that is, one domino can be rotated to be equal to another domino.

Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].

 

Example 1:

Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
Output: 1
Example 2:

Input: dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]]
Output: 3
 

Constraints:

1 <= dominoes.length <= 4 * 104
dominoes[i].length == 2
1 <= dominoes[i][j] <= 9
*/	
	
	
	public int numEquivDominoPairs(int[][] dominoes) {
		int count = 0;

        System.out.println("dominoes.length "+dominoes.length);
        // above statement   dominoes.length 4


		
		for (int i = 0; i < dominoes.length - 1; i++) {
			
			int one = dominoes[i][0];
			int second = dominoes[i][1];
			for (int j = i + 1; j < dominoes.length; j++) {
				
				int check1 = dominoes[j][0];
				int check2 = dominoes[j][1];
				
				if (one == check1) {
				
					if (second == check2) {
						count += 1;
					}
					
				} 
				else if (one == check2) {
					if (second == check1) {
						count += 1;
					}
				}
				
				
			}
		}
		return count;

	}
	
}


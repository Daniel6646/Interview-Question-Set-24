package LeetCode2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastStoneWeight {

//	You are given an array of integers stones where stones[i] is the weight of the ith stone.
//
//	We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
//
//	If x == y, both stones are destroyed, and
//	If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
//	At the end of the game, there is at most one stone left.
//
//	Return the weight of the last remaining stone. If there are no stones left, return 0.
//
//	 
//
//	Example 1:
//
//	Input: stones = [2,7,4,1,8,1]
//	Output: 1
//	Explanation: 
//	We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
//	we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
//	we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
//	we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.

//	Example 2:
//
//	Input: stones = [1]
//	Output: 1
//	 
//
//	Constraints:
//
//	1 <= stones.length <= 30
//	1 <= stones[i] <= 1000

	
	
	public int lastStoneWeight(int[] stones)
	{
			ArrayList<Integer> listStones = new ArrayList<>();
			for (int a : stones) {
				
				listStones.add(a);
			}
				

			while (listStones.size() > 1)
			{
				int secondLast = Integer.MAX_VALUE;
				int last = Integer.MIN_VALUE;
				int len = listStones.size();

//				if (len == 1 || len == 0)
//				{
//					break;
//				}

				Collections.sort(listStones);
				secondLast = listStones.get(len - 2);
			last = listStones.get(len - 1);

				if (secondLast < last)
				{
					last = last - secondLast;
					listStones.remove(listStones.size()-1);
					listStones.remove(listStones.size()-1);
					listStones.add(last);

				}
				else if (secondLast == last)
				{
					listStones.remove(listStones.size()-1);
					listStones.remove(listStones.size()-1);
				}
			}
			
	        if(listStones.size()==1) {
	         
	        	return listStones.get(0);
	        }
	        
	        return 0;
		}

	
	
	public int lastStoneWeight2(int[] stones) {

	    List<Integer> list = new ArrayList<>();
	    for (int s : stones) list.add(s);

	    while (list.size() > 1) {

	        Collections.sort(list); // sort ascending

	        int last = list.remove(list.size() - 1);     // biggest
	        int secondLast = list.remove(list.size() - 1); // second biggest
	        // gets last and second last elements, and stores it in variable
	        //if diff below we minus ad add it in list
	        
	        //if same no will be elimnated and iteration moves onto next numbers and those nos will be saved in above variables
	        
	        
	        if (last != secondLast) {
	            list.add(last - secondLast);
	        }
	    }

	    return list.isEmpty() ? 0 : list.get(0);
	}
	
}

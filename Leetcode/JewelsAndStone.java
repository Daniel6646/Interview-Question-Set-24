package LeetCode;

public class JewelsAndStone {

	
	
//	You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//
//	Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//	 
//
//	Example 1:
//
//	Input: jewels = "aA", stones = "aAAbbbb"
//	Output: 3
//	Example 2:
//
//	Input: jewels = "z", stones = "ZZ"
//	Output: 0
//	 
//
//	Constraints:
//
//	1 <= jewels.length, stones.length <= 50
//	jewels and stones consist of only English letters.
//	All the characters of jewels are unique
	
	//SOLUTION 1
	public int numJewelsInStones(String jewels, String stones) {
        
        int count = 0;

        for(int i=0; i<jewels.length(); i++){
            for(int j=0; j<stones.length(); j++){
                if (stones.charAt(j) == jewels.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }
	
	
	//Solution 2
	  public int numJewelsInStones2(String jewels, String stones) {
	        int count = 0;
	        for (int i = 0; i < stones.length(); i++) {
	            if (jewels.indexOf(stones.charAt(i)) != -1) {
	                count++;
	            }
	        }
	        return count;
	    }
	
	
}

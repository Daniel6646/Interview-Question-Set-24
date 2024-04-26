package LeetCode;

public class SingleNumber {

	public static void main(String[] args) {
		
		int array1[] = new int [] {4,1,2,1,2};
		int array2[] = new int [] {2,2,1};

		
		
	}
	
	  public int singleNumber(int[] nums) {
       
		  int xor = nums[0];
       
		  for(int i = 1; i < nums.length; i++) {
            
			  xor ^= nums[i];
       
		  }
        return xor; 
    }
	
}

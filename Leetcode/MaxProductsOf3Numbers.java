package LeetCode;

import java.util.Arrays;

public class MaxProductsOf3Numbers {

	public int maximumProduct(int nums[]) {
		
		int product = 1;
		
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length;i++) {
			
			product = product * nums[i];
			
		}
		
		return product;
		
	}
	
	public int maximunProduct2(int nums[]) {
		
		int min1, min2, max1, max2, max3;
		min1 = min2 = Integer.MAX_VALUE;
		max1 = max2 = max3 = Integer.MIN_VALUE;
		
		for(int i=0; i<nums.length;i++) {
			
			if( max1 < nums[i] ) {
				
				max3 = max2;
				max2 = max1;
				max1 = nums[i];
				
			}
			else if( max2 < nums[i] ) {
				
				max3 = max2;
				max2 =  nums[i] ;
				
			}
			
			else if(max3 < nums[i]) {
				
				max3 = nums[i];
			}
			
			
			 //Updating minimums
            if(min1 > nums[i]){
            	
                min2 = min1;
                min1 = nums[i];
            }
            
            else if(min2 > nums[i]){
                min2 = nums[i];
            }
            
		}
        return Math.max(max1 * max2 * max3 , min1 * min2 * max1);

	}
	
}

package LeetCode;

import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		int nums1 [] = new int [] {1,2,3,1};
		int num2[] = new int[] {1,2,3,4};
		
		boolean flag =  containsDuplicate(nums1);
		System.out.println("Flag value:: "+flag);
		
	}
	
//	   public static boolean containsDuplicate(int[] nums) {
//	     
//		   int count = 1;
//		   boolean flag = false;
//		   
//		for(int i=0 ;i<nums.length; i++) {
//			
//			for(int j=i+1;j<nums.length;j++) {
//				
//				if(nums[i] == nums[j]) {
//					flag = true;
//				}	
//			
// 			}
//		}   
//		   return flag;
//	    }
	   
	   
	  public boolean containsDuplicate(int[] nums) {

			  Arrays.sort(nums);
			  boolean flag =false;
			  
			  for (int i=1; i<nums.length; i++) {
				 
				  if( nums[i] == nums[i -1] )  {
				  
				  return true;
				  
			  }
		   }
			  
			  return flag;
	    }
	   
	   
	   
	   
	   
}

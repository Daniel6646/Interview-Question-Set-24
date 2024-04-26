package LeetCode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		
		int nums1[] = new int[] {1,3,5,6};
		//int nums2[] = new int [] {};
		int target1 = 5, target2 = 2, target3 = 7;
		int count = searchInsert(nums1, target3);
		System.out.println("Count:: "+count);
	}
	
	 public static int searchInsert(int[] nums, int target) {

		 int answer =0;
		 
		 for(int i=0; i<nums.length;i++) {
			 
			 if(nums[i] == target) {
				 
				answer =  i;
			 }
			 
			 else if (nums[i] < target) {
				 answer = i +1;
				 
			 }
			 
		 }
		 return answer;

	    }
	
}

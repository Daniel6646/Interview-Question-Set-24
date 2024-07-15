package LeetCode;


public class DuplicateInArray {

//	public static void main(String[] args) {
//		
//		int array1[] = new int[] {1,1,2};
//		int array2[] = new int [] {0,0,1,1,1,2,2,3,3,4};
//		int count = removeDuplicates(array2);
//		System.out.println("count:: "+count);
//	}
	
	
//	Example 1:
//
//		Input: nums = [1,1,2]
//		Output: 2, nums = [1,2,_]
//		Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//		It does not matter what you leave beyond the returned k (hence they are underscores).
//		Example 2:
//
//		Input: nums = [0,0,1,1,1,2,2,3,3,4]
//		Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//		Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//		It does not matter what you leave beyond the returned k (hence they are underscores).
//	

	
// The code starts iterating from i = 1 because we need to compare each element with its previous element to check for duplicates.

// The main logic is inside the for loop:

// If the current element nums[i] is not equal to the previous element nums[i - 1], it means we have encountered a new unique element.
// In that case, we update nums[j] with the value of the unique element at nums[i], and then increment j by 1 to mark the next position for a new unique element.
// By doing this, we effectively overwrite any duplicates in the array and only keep the unique elements.
// Once the loop finishes, the value of j represents the length of the resulting array with duplicates removed.

// Finally, we return j as the desired result.	
	
	
	public  int removeDuplicates(int [] nums) {
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}

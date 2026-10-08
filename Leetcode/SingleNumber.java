package LeetCode;

import java.util.Arrays;

public class SingleNumber {

//	Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//	You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//	 
//
//	Example 1:
//
//	Input: nums = [2,2,1]
//	Output: 1
//	Example 2:
//
//	Input: nums = [4,1,2,1,2]
//	Output: 4
//	Example 3:
//
//	Input: nums = [1]
//	Output: 1
//	 
//
//	Constraints:
//
//	1 <= nums.length <= 3 * 104
//	-3 * 104 <= nums[i] <= 3 * 104
//	Each element in the array appears twice except for one element which appears only once.

	
	
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

	  public int singleNumber2(int[] nums) {

		    int xor = 0;
		   // Arrays.sort(nums); not needed
		    // og array //	Input: nums = [4,1,2,1,2]
// makes it 1,1,2,2,4 xor cancelrs out the same number and keeps the unique no
		    for (int num : nums) {
		        xor ^= num;
		    }

		    return xor;
		}
	  
	  
	  /*
	   * 
	   * public int singleNumber2(int[] nums) {

    int xor = 0;

    for (int num : nums) {
        xor ^= num;
    }

    return xor;
}

For this input:
int[] nums = {4, 1, 2, 1, 2};

The loop passes each value into num.
Step-by-step
Initially:
xor = 0

1st iteration
num = 4
xor ^= 4;

which means:
xor = xor ^ 4;

So:
0 ^ 4 = 4

Now:
xor = 4

2nd iteration
num = 1
4 ^ 1 = 5

Now:
xor = 5

3rd iteration
num = 2
5 ^ 2 = 7

Now:
xor = 7

4th iteration
num = 1
7 ^ 1 = 6

Now:
xor = 6

5th iteration
num = 2
6 ^ 2 = 4

Now:
xor = 4

Loop finishes and:
return xor;

returns:
4

So the output is:
4

But why does XOR give us 4?
The important XOR rules are:
a ^ a = 0
a ^ 0 = a

Therefore our calculation:
0 ^ 4 ^ 1 ^ 2 ^ 1 ^ 2

can be rearranged as:
4 ^ (1 ^ 1) ^ (2 ^ 2)

And:
1 ^ 1 = 0
2 ^ 2 = 0

So:
4 ^ 0 ^ 0

and:
4 ^ 0 = 4

Therefore:
The numbers that occur twice cancel each other out, leaving the number that occurs once.
Your first method
This:
int xor = nums[0];

for(int i = 1; i < nums.length; i++) {
    xor ^= nums[i];
}

does exactly the same thing.
For:
[4, 1, 2, 1, 2]

the values are:
Starting:
xor = 4

i = 1:
xor = 4 ^ 1 = 5

i = 2:
xor = 5 ^ 2 = 7

i = 3:
xor = 7 ^ 1 = 6

i = 4:
xor = 6 ^ 2 = 4

So both methods return 4.
I'd recommend remembering the second version:
int xor = 0;

for (int num : nums) {
    xor ^= num;
}

return xor;

It's shorter and the 0 is important because 0 ^ number = number.
	   * 
	   * */
	  
}

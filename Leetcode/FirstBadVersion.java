package LeetCode;

public class FirstBadVersion {

//	You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
//
//	Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
//
//	You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
//
//	 
//
//	Example 1:
//
//	Input: n = 5, bad = 4
//	Output: 4
//	Explanation:
//	call isBadVersion(3) -> false
//	call isBadVersion(5) -> true
//	call isBadVersion(4) -> true
//	Then 4 is the first bad version.
//	Example 2:
//
//	Input: n = 1, bad = 1
//	Output: 1
//	 
//
//	Constraints:
//
//	1 <= bad <= n <= 231 - 1

	
	
	boolean isBadVersion(int version) {
		
		return true;
	}
	
	public int firstBadVersion(int n) {

		int low = 0;
		int high = n;

		while (low <= high) {

			int mid = low + (high - low) / 2;

// means mid is true and the element behind is false then that is what we need to return it			
			if (isBadVersion(mid) == true && isBadVersion(mid - 1) == false) {

				return mid;
			}

// if mid is false means it surely will be in second half so initialize low = mid+1 so portion of iteration will strt in second half from mid to high [ mid to the end ]			
			else if (isBadVersion(mid) == false) {

				low = mid + 1;
			}

// if no it means value is in first half hence we initialize high = mid so from low to high i.e find in first half
			else {

				high = mid;
			}

		}
		return -1;

	}
	
}

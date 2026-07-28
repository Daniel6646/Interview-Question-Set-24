package LeetCode2;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {

	
//	The array-form of an integer num is an array representing its digits in left to right order.
//
//	For example, for num = 1321, the array form is [1,3,2,1].
//	Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
//
//	 
//
//	Example 1:
//
//	Input: num = [1,2,0,0], k = 34
//	Output: [1,2,3,4]
//	Explanation: 1200 + 34 = 1234
//	Example 2:
//
//	Input: num = [2,7,4], k = 181
//	Output: [4,5,5]
//	Explanation: 274 + 181 = 455
//	Example 3:
//
//	Input: num = [2,1,5], k = 806
//	Output: [1,0,2,1]
//	Explanation: 215 + 806 = 1021
//	 
//
//	Constraints:
//
//	1 <= num.length <= 104
//	0 <= num[i] <= 9
//	num does not contain any leading zeros except for the zero itself.
//	1 <= k <= 104

	
	
	
	
	
	
	
	
//**********	APPROACH
	
//	Example: `num` = [2,1,5], `k` = 806
//	At index 2 num = [2, 1, 811] 
//	So, `k` = 81 and `num` = [2, 1, 1]
//
//	At index 1 num = [2, 82, 1]
//	So, `k` = 8 and `num` = [2, 2, 1]
//
//	At index 0 num = [10, 2, 1]
//	So, `k` = 1 and `num` = [0, 2, 1]
//
//	Now `k` > 0
//	So, we add at the beginning of num
//	`num` = [1, 0, 2, 1]
	
	
//	 public List<Integer> addToArrayForm(int[] num, int k) {
//		    
//		    List<Integer> res = new LinkedList<>();
//		    
//		    for (int i = num.length - 1; i >= 0; --i) {
//		    
//		        res.add(0, (num[i] + k) % 10);
//		        k = (num[i] + k) / 10;
//		    
//		    }
//		    
//		    while (k > 0) {
//		        res.add(0, k % 10);
//		        k /= 10;
//		    
//		    }
//		    return res;
//		  
//	 }

	public static void main(String[] args) {
		
		int arr1[]= new int [] {1,2,0,0};
		int k = 34;
		int resultArray[]= addArrayIntoNum(arr1, k);

		for(int i=0; i< resultArray.length;i++) {
			
			System.out.print(resultArray[i]+" ");
		}
		
	}
	 
	 
	 public static int[] addArrayIntoNum(int arr[], int numToAdd) {
		 
		int result[] = new int [arr.length]; 
		//List<Integer> finalString = new ArrayList<>();
		String no ="";
		int index = arr.length-1;

		
		for(int i=0;i<arr.length;i++) {
			
			no += arr[i] + "";
		}
		 
		int number = Integer.parseInt(no);
		int total = number + numToAdd;
		System.out.println("total final:: "+total);

 //convert no into int array
		int end = arr.length-1;
		while(total != 0) {
			
			arr[end] = total % 10;
			end--;
			total = total / 10;
			
		}
		return arr;
	 }
	 
	 
}
		// convert no into int array
//		String strValue = String.valueOf(total);
//		String strArray[] = convertStrIntoStringArray(strValue);
//
//		System.out.println("strValue: "+strValue);
//		
//		int resultArray[] = new int [strValue.length()];
//
//		
//		
//		for(int i=0; i< strArray.length; i++) {
//			
//			resultArray[i] = Integer.parseInt(strArray[i]) ;
////			System.out.println("char c:: "+c);
////			 =(int) c;
//		}
//		
//		
////		while (total != 0){
////			
////			result[index] = total % 10;
////			index--;
////			total = total /10;
////		}
//		
//		
//		return resultArray;
//	 }
//
//
//	private static String[] convertStrIntoStringArray(String strValue) {
//		// TODO Auto-generated method stub
//		String strResult[] = new String[strValue.length()];
//		
//		for(int i=0; i<strValue.length(); i++) {
//			
//			strResult[i] =String.valueOf(strValue.charAt(i)) ;
//		}
//		
//		return strResult;
//	}
	 


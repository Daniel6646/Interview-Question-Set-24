package LeetCode;

public class AddDigit {

	public static void main(String[] args) {
		
		int num1 =38, num2 = 0;
		int result = addDigit(num1);
		System.out.println("Final output "+result);
	}
	
	
	public static int addDigit(int num) {
		
		int digit, sum = 0;
		boolean flag = false;
		
		while(flag != true) {
		
//		while (number != 0) {
//		
//			digit = number % 10;
//			sum = sum + digit;
//			number = number / 10;
//				
//		}
		
		 sum = calculateSum(num);
			
		if(sum < 10) {
			
			flag =  true;
			break;
		}
		
		else {
			
			num = sum;
			
		}
	
		}
		
		return sum;
	}
	
	
	public static int calculateSum( int number) {
		
		int sum =0, digit =0;
		
		while (number != 0) {
		
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;
				
			
		}
		return sum;
	}
	
	
	
}

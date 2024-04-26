package LeetCode;

public class NimGame {

	
	public static void main(String[] args) {
	
	int n1 = 4;
	int n2= 2;
	int n3 = 1;
		
	boolean result = canWinNim(n2);
	System.out.println("Result:: "+result);
	
	}
	
//	public static boolean canWinNim(int n) {
//    
//		boolean flag = false;
//		
//		if( n == 0) {
//			
//			return false;
//		}
//		
//	for(int i=1;i<n;i++) {
//		
//		if(n-i != 0) {
//			
//			return flag;
//		}
//		
//		else {
//			
//		 flag = true;
//		}
//		
//	}	
//	
//	return flag;
//	
//    }
	
	
	public static boolean canWinNim(int n) { 
		
		// becasue only in sitation of 4 as per test case we will lose i.e false other test case it is true
		//return n % 4 != 0;
		
		boolean flag = false;
		
		if(n % 4 == 0) {
			
			flag = false;
		}
		else {
			
			flag = true;
		}
		
		return flag;
	}
	
}

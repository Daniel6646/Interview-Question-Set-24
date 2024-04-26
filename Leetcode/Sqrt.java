package LeetCode;

public class Sqrt {

	public static void main(String[] args) {
		
	}
	
	   public int mySqrt(int x) {
	        
		   if(x < 1) {
			   
			   return x;
		   }
		   
		   int start =1, end = (x/2) +1, mid =0, sqrt =0;
		   
		   while( start <= end) {
			   
			   mid = start + end / 2;
		   
			   if( mid * mid == x) {
				   
				   return (int) mid;
			   }
			   
			   else if(mid*mid < x) {
				   
	                start = (int) mid + 1;
	                sqrt = (int) mid;
	                
	            } else {
	            	
	                end = (int) mid - 1;
	                
	            }
		   }
			  return sqrt;

	    }
}

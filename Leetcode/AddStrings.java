package LeetCode;

public class AddStrings {

	  public String addStrings(String num1, String num2) {
	     
		  
		  int n1 = Integer.parseInt(num1);
		  int n2 = Integer.parseInt(num2);
		  int n3 = n1 + n2;
		  String result = String.valueOf(n3);
		  
		  return result;
	    }
	  
  public String addStrings2(String num1, String num2) {
	     
		  
		long n1 = Long.parseLong(num1);
		long n2 = Long.parseLong(num2);
		long n3 = n1 + n2;
		  String result = String.valueOf(n3);
		  
		  return result;
	    }
	  
}

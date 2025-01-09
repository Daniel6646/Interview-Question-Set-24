package LeetCode2;

public class concatTwoStringCharByChar {

	
	//String a = "abc"
		//String b = "xyzef";
		
		// result : axbyef.
		
	public static void main(String[] args) {
		
		
		String a ="abc";
		String b = "xyzef";
		String finalString = concatCharOfStrings(a, b);
		System.out.println("finalString :" +finalString);
		
	}
	
	
	public static String concatCharOfStrings(String a, String b) {
		
	int minLenght = 0;	
	int maxLength = 0;	
	String result = "";
	int index = 0;
	
	minLenght = minLengthOfString(a.length(), b.length());
	maxLength = maxLengthOfString(a.length(), b.length());
	
	System.out.println("line 32 minlength: "+ minLenght);
	System.out.println("line 32 maxlength: "+ maxLength);

	
	char aString[] = a.toCharArray();
	char bString[] = b.toCharArray();
	
	
	for(int i=0; i<minLenght;i++) {
		
		
	    result += 	a.charAt(i);
	    result += 	b.charAt(i);
	    index = i;

//		char aChar = a.charAt(i);
//		char bChar = b.charAt(i);
//		result = aChar + bChar;
//		
	}
	System.out.println("line 52 index: "+index);
	
	
	String largerString = largestString(a, b);
	System.out.println("line 56 largerString: "+largerString);
	System.out.println("line 57 largerString.len: "+largerString.length());

	for(int i=index+1; i<largerString.length(); i++) {
		
		result +=largerString.charAt(i);
		
	}
	
	System.out.println("line 64 result: "+result);
		return result;
	}
	
	public static int minLengthOfString (int a, int b) {
		
		int minLenght = 0;
		if (a < b )	{
			
			minLenght = a;	
		}
		else {  
			
			minLenght = b;
		}	
		return minLenght;
	}
	
	public static int maxLengthOfString (int a, int b) {
		
		int maxLenght = 0;
		if (a > b )	{
			
			maxLenght = a;	
		}
		else {  
			
			maxLenght = b;
		}	
		return maxLenght;
	}
	
	
	public static String largestString (String a, String b) {
		
		String maxString = "";
		if (a.length() > b.length() )	{
			
			maxString = a;	
		}
		else {  
			
			maxString = b;
		}	
		return maxString;
	}
	
}

package javatpoint_Array_Programs;

public class SecondSmallestArray {

	public static void main(String[] args) {
		
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second smallest: "+secondSmallestNumberInArray(a));  
		System.out.println("Second smallest: "+secondSmallestNumberInArray(b)); 
		
	}
	
	public static int secondSmallestNumberInArray(int array[]) {
		
		int temp = 0, total =array.length;
		
		
		for(int i=0; i<array.length; i++) {
			
			for(int j = i+1; j<array.length; j++) {
				
				if(array[i] < array[j]) {
					
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
		}
		
		
		return array[total - 2];
	}
	
	
}

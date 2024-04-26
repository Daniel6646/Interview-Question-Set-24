package javatpoint_number_pattern;

public class NumberPattern5 {

	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				
				if(j <=i) {
					
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		
	}
	
}

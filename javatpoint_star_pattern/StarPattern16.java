package javatpoint_StarPattern;

public class StarPattern16 {

	public static void main(String[] args) {
		

		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				
				if(i==j || i+j==5-1 ) {//{0,0 1,1 2,2 etc} {0,4  1,3  2,2   3,1   4,0 See the similarity first and last - 0,4 with 4,0  1,3 with 3,1 second n second last then mid 2,2	
					System.out.print("*");
				}
				
				else {
					
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
	
		
	}
	
}

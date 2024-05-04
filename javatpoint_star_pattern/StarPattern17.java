package javatpoint_StarPattern;

public class StarPattern17 {
	
	public static void main(String args[]) {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				
				//if( i>=2 && j>=2 && i<=4 && j<=4)
					if( i>=2 && i<=4 && j>=2 && j<=4){// i is row up to down,j column left to right  
//i is column, j is row the condition is first creat blan spaces like if(i>=2 && j>=2, i<=2 && j<=2 					
// for blank spce i>=2, i<=2 in column up to down true then blank space, j>=2 & j<=2 for rows if true space not star 					
					System.out.print(" ");
				}
				
				else {
					
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}	
}


*****
*   *
*   *
*   *
*****

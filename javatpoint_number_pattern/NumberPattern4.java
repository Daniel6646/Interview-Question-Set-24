package javatpoint_number_pattern;

public class NumberPattern4 {

	public static void main(String[] args) {  
       
		for (int i = 1; i <= 10; i++)  
		{  
      
			for (int j = 1; j <= 10; j++)  
		{  
				
				if (i==1 || i==10 || j==1 || j==10 )  
           
					System.out.print(" 1");  
          
				else  
            
					System.out.print("  ");  
        }  
			
        System.out.println();  
    }  
   }
	
}


//output
//
//1 1 1 1 1 1 1 1 1 1
//1                 1
//1                 1
//1                 1
//1                 1
//1                 1
//1                 1
//1                 1
//1                 1
//1 1 1 1 1 1 1 1 1 1

package javatpoint_number_pattern;

public class NumberPattern3 {
	
	public static void main(String[] args) {
		
		int lines = 10;
		int i, j;
		int count;
		for (i = 1; i <= lines; i++) {// this loop is used to print lines
			
			count = 0;
			for (j = 1; j < lines; j++) {// this loop is used to print numbers in a line
			
				if (count < i - 1) {
			
					if (!(j < lines - i + 1)) {
			
						System.out.print(j);
						count++;
					
					}
				
				}
			
			}
			System.out.print("0");
			count = 0;
			for (--j; j >= 1; j--) {// this loop is used to print j and increment count
				
				if (count < i - 1) {
					System.out.print(j);
			
					count++;
				}
			}
			System.out.println("");
		}
	}
}

//output
//
//0
//909
//89098
//7890987
//678909876
//56789098765
//4567890987654
//345678909876543
//23456789098765432
//12345678909876543210

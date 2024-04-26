package LeetCode;

import java.util.ArrayList;
import java.util.List;

//	   1
//	  1  1
//	  1 2 1
//	1 3  3  1
// 1 4 6  4   1

public class PascalTriangle {

	public static void main(String[] args) {
		
		generate(5);
		
	}
	
	  public static List<List<Integer>> generate(int numRows) {
	        
	List<List<Integer>> result = new ArrayList<List<Integer>>(); 
	List<Integer> previous = null, row = null;	  
	
	for(int i=0; i < numRows; ++i) {
	
		row = new ArrayList<>();
		
		for(int j=0; j<i; ++j) {
			
			if(j == 0 || j == i) { // first and last element always has 1
				
				row.add(1);
			}
			else {
				
				row.add(previous.get(j-1) + previous.get(j));
				previous = row;
				result.add(row);
				
			  }
		  }
	  }
	
	return result;
  }
	
	  
	  
	  public static List<List<Integer>> generatePascalTriangle(int numRows) {
		  
		  List<List<Integer>> result = new ArrayList<>();
		  
		  if(numRows == 0) {
			  
			  return result;
		  }
		  
		  List<Integer> firstRow = new ArrayList<>();
		  firstRow.add(1);
		  result.add(firstRow);
		  
		  for(int i=1;i < numRows; i++) {
			  
			  List<Integer> previousRow =  result.get(i-1);
			  List<Integer> currentRow = new ArrayList<Integer>();
			  currentRow.add(1);  
			  
			  for(int j=1; j <i; j++) {
				  
				  currentRow.add(previousRow.get(j-1) + previousRow.get(j));
			  
			  }
			  
			  currentRow.add(1);
			  result.add(currentRow);
		  }
		  return result;
	  }

}

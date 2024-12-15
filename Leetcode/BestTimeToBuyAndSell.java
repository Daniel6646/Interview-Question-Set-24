package LeetCode;

public class BestTimeToBuyAndSell {

//	Example 1:
//
//		Input: prices = [7,1,5,3,6,4]
//		Output: 5
//		Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//		Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//		Example 2:
//
//		Input: prices = [7,6,4,3,1]
//		Output: 0
//		Explanation: In this case, no transactions are done and the max profit = 0.
//		 
//
//		Constraints:
//
//		1 <= prices.length <= 105
//		0 <= prices[i] <= 104
	
	
	
	public static void main(String[] args) {
		
		int prices1[] = new int[] {7,6,4,3,1};
		int prices2[] = new int[] {7,1,5,3,6,4};
		
		int profit = maxProfit(prices1);
		System.out.println("Profit is::: "+profit);
	}
	
	 public static int maxProfit(int[] prices) {
	        
		 int maxProfit = 0, currentPrice = 0;;
		 
		 for(int i=0; i<prices.length; i++) {
			 
			 for(int j=i+1; j<prices.length;j++) {
				 
				 currentPrice = prices[j]-prices[i];
				 
				 if (currentPrice > 0 ) {
					 
					 if(currentPrice > maxProfit) {
						 
						 maxProfit = currentPrice;
					 }
					 
				 }
				 
			 }
			 
		 }
		 return maxProfit;
	    }
	
	 public static int maxProfitt(int[] prices) {
		 
		 int lsf = Integer.MAX_VALUE;
		 int overallProfit = 0, profitIfSoldToday = 0;
		 
		 for(int i=0; i< prices.length;i++) {
			 
			 if(prices[i] < lsf ) {
				 
				 lsf = prices[i];
			 }
			 
			profitIfSoldToday = prices[i] - lsf;
			 
			if(overallProfit < profitIfSoldToday) {
				
				overallProfit = profitIfSoldToday;
				
			}
			
		 }
		 
		 
		 return overallProfit;
	 }
	 
}

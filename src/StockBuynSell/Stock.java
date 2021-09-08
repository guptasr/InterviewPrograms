package StockBuynSell;

public class Stock {

	public static void main(String args[]) {
		int price[] = { 100, 180, 260, 310,
            40, 535,695, 100 };
		
		int min = price[0];
		int profit=0,cost,maxcost = 0;
		 System.out.println( maxProfit(price, 0, price.length-1));
	}
		 static int maxProfit(int price[], int start, int end)
		 {
		  
			
		     // If the stocks can't be bought
		     if (end <= start)
		         return 0;
		  
		     // Initialise the profit
		     int profit = 0;
		  
		     // The day at which the stock
		     // must be bought
		     for (int i = start; i < end; i++)
		     {
		  
		         // The day at which the
		         // stock must be sold
		         for (int j = i + 1; j <= end; j++)
		         {
		  
		             // If byuing the stock at ith day and
		             // selling it at jth day is profitable
		             if (price[j] > price[i])
		             {
		  
		                 // Update the current profit
		                 int curr_profit = price[j] - price[i]
		                                 + maxProfit(price, start, i - 1)
		                                 + maxProfit(price, j + 1, end);
		  
		                 // Update the maximum profit so far
		                 profit = Math.max(profit, curr_profit);
		             }
		         }
		     }
		     return profit;
		 }
		
		/*for(int i=1; i < price.length;i++) {
			if(price[i] < min && (price[i] > price[i-1])) {
				profit += (price[i-1] - min);
				min = price[i];
			}else if(i == price.length - 1)
			{
				int a = (price[i] - min);
				profit += a;
			}
		}*/
		
}

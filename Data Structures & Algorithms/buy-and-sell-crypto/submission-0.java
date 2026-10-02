class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
		 int maxP=0;
		 int profit=0;
		 for(int i=0;i<n-1;i++)
		 {
			 int j=i+1;
			 while(j<n)
			 {
				 if(prices[i]<prices[j])
				 {
					 profit=prices[j]-prices[i];
					 
				 }
				 j++;
				 maxP=Math.max(maxP, profit);
			 }
		 }
	        return maxP;
    }
}

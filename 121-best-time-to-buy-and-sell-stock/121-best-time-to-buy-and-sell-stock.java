class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int  profit=0;
            
        for(int i =0;i< prices.length;i++){
           //capture min value  
            if(prices[i]<min)
                min = prices[i];
            //capture the max profit 
            profit = Math.max( profit , prices[i]-min);
        }
        
        return profit;
    }
}
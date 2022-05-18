public class Solution {

 
    public int coinChange(int[] coins, int amount){
    
        int dp[] = new int[amount+1];
        Arrays.fill(dp,amount+1);
         dp[0]=0;
        for(int i =1;i<=amount;i++){//calculate for each amount
            
            //iterate over each coin
            for(int currCoin=0;currCoin<coins.length;currCoin++){
                if(i>=coins[currCoin]){
                    
                    dp[i] = Math.min(dp[i], 1 + dp[i-coins[currCoin]]);
                }
                
            }
        }
        
        return dp[amount]>amount  ? -1:dp[amount];
        
  }
    
    
}
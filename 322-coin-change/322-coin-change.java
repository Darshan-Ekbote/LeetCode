public class Solution {

 
    public int coinChange(int[] coins, int amount){
    Arrays.sort(coins);
        int dp[] = new int[amount+1];
        Arrays.fill(dp,amount+1);
         dp[0]=0;
        
        for( int am=1;am<=amount;am++){
            
            for(int currCoin=0;currCoin<coins.length;currCoin++){
                if(am>=coins[currCoin])
                    dp[am] = Math.min(dp[am],1+dp[am-coins[currCoin]]);
                else
                    break;
            }
            
        }
        
        return dp[amount]>amount  ? -1:dp[amount];
        
  }
    
    
}
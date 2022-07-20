class Solution {
  public int change(int amount, int[] coins) {
    int[] dp = new int[amount + 1];
      //zero can be made with 0 coins ..so 1 combination
    dp[0] = 1;

      //iterate over each coin
    for (int coin : coins) {
        //iterate over from coin to amount
      for (int am = coin; am < amount + 1; am++) {
        dp[am] += dp[am - coin];
      }
    }
    return dp[amount];
  }
}
class Solution {
    public int fib(int n) {
        
        //bsae conditions
        if(n==0||n==1) return n;
        
        int [] dp = new int[n+1];
        
        dp[1]=1;
        dp[2]=1;
        
        for( int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        
        return dp[n];
    }
}
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWeath =Integer.MIN_VALUE;
        
        for( int[]  acc: accounts)
           maxWeath= Math.max( maxWeath, IntStream.of(acc).sum());
        
        return maxWeath;
    }
}
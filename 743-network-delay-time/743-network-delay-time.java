class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        

        
        int cost[] = new int[n+1];
        Arrays.fill(cost,Integer.MAX_VALUE);
        
        //set source to 0
        cost[k] = 0;
        
        //iterate over each vertex - V
        for( int i=1;i<=n;i++){
            
            //iterate over all the edges
            for(int [] time: times){
                
                int s = time[0];
                int d = time[1];
                int c = time[2];
                
                if(cost[s]!=Integer.MAX_VALUE && cost[d]> cost[s]+c){
                    cost[d]=c+cost[s];
                }
            }
        }
        
        int maxWait= Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            
            if(cost[i]==Integer.MAX_VALUE) return -1;
            
            maxWait = Math.max(cost[i], maxWait);
        }
        
        return maxWait;
    }
}
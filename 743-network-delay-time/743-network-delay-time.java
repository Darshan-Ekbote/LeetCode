class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        int dist[] = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        //starting point
        dist[k]=0;
        
        //time complexity O(V.E)
        
        //iterate over each vertex - V
        for( int i=1;i<=n;i++){
            
            //iterate over each edge - E
            for(int[] time : times){
                
                int src = time[0];
                int dest = time[1];
                int cost = time[2];
                //start from the given source, ie, from dist[src] ==0
                if(dist[src] != Integer.MAX_VALUE && dist[dest] > dist[src] + cost){
                    dist[dest] = dist[src] + cost;
                }
            }
        }
        
        int maxWait=0;
        for( int i=1;i<=n;i++){
            //cant reach this node
            if(dist[i]==Integer.MAX_VALUE ) return -1;
            maxWait = Math.max(maxWait,dist[i]);
        }
        
        return maxWait;
    }
}
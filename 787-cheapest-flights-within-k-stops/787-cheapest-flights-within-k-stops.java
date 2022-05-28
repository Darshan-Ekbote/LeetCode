class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        int[] prices = new int[n];
        Arrays.fill(prices,Integer.MAX_VALUE);
        
        //set src cost to 0
        prices[src] =0;

        //iterate for k times 
        for(int i=0;i<=k;i++) {

            int[] tmp = prices.clone();

            for(int[] flight : flights) {

                int source= flight[0], dest = flight[1], cost = flight[2];
                //start exploring from thr source , ie, when cost != infinity 
                if(prices[source] == Integer.MAX_VALUE)
                    continue;
                //relax the vetices with updated cost 
                if(prices[source] + cost < tmp[dest])
                    tmp[dest] = prices[source] + cost;
            }

            //change the prices arrayc
            prices = tmp.clone();
        }

            return  prices[dst] == Integer.MAX_VALUE ? -1:prices[dst] ;
    }
}
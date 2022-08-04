class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        
        
        Map<Integer, Set<Integer>> m = new HashMap<>();
        
        
        for( int i =0;i<n;i++) m.put(i, new HashSet<>());
        
        for( int[] road : roads){
            m.get(road[0]).add(road[1]);
            m.get(road[1]).add(road[0]);
        }
         
        //int size=size() + ;;
        
       int max = Integer.MIN_VALUE;
        // for each pair
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j <= n - 1; j++){
                // if two cities paried, need to remove one duplicate road
                if(m.containsKey(i) && m.get(i).contains(j)){
                    max = Math.max(max, m.get(i).size() + m.get(j).size() - 1);
                }
                // if not connted but have valid roads
                else if(m.containsKey(i) && m.containsKey(j)){
                    max = Math.max(max, m.get(i).size() + m.get(j).size());
                }
                // no connected roads
                else{
                    max = Math.max(max, 0);
                }
            }
        }
        
        return max;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
      int res[] = new int[k];
        
        Map <Integer,Integer> m = new HashMap<>();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(
        
            (n1,n2)-> m.get(n1)-m.get(n2)
        
        );
        
        for( int n : nums)
            m.put(n,m.getOrDefault(n,0)+1);
        
        for(int key : m.keySet()){
            
            pq.add(key);
            
            if(pq.size()>k) pq.poll();
        }
        
        int index =0;
        while(!pq.isEmpty())
            res[index++]=pq.poll();
        
        return res;
    }
}
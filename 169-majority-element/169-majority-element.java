class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> m = new HashMap<>();
        
        PriorityQueue <Integer> pq = new PriorityQueue <>(
        (n1,n2) -> m.get(n1) - m.get(n2)
            
        );
        
        
        for( int n : nums)
            m.put(n, m.getOrDefault(n,0)+1);
        
        for( int key : m.keySet()){
            
            pq.add( key);
            
            if(pq.size()>1)
                pq.poll();
                
        }
        
        return pq.poll();
        
    }
}
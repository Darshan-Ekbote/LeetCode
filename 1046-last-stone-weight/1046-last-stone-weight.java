class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer> pq =  new PriorityQueue<>(
       (n1,n2) -> n2-n1
       );
        
        for(int n : stones){
            pq.add(n);
        }
        
        int smashed = 0;
        while(pq.size()>1){
            
            smashed=pq.poll()-pq.poll();
            pq.add(smashed);
        }
        
        return pq.poll();
    }
}
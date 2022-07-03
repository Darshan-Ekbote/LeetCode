class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> b-a
        );
        
        for( int n: piles) pq.add(n);
        
        for( int i=0;i<k;i++){
            
            int temp = pq.poll();
            temp -= (int)Math.floor(temp/2);
            pq.add(temp);
        }
        
        int result =0;
        
        while(!pq.isEmpty())
            result+= pq.poll();
        
        return result;
        
    }
}
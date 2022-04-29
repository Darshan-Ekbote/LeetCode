class KthLargest {
    public int k;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    
    public KthLargest(int k, int[] nums) {
        this.k =k;
        for(int n: nums){
            pq.add(n);
            if(pq.size()>k)
                pq.poll();
            
        }
    }
    
    public int add(int val) {
        
        pq.add(val);
        
        if(pq.size()>k)
            pq.poll();
        
        return pq.size()>0 ? pq.peek(): null;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
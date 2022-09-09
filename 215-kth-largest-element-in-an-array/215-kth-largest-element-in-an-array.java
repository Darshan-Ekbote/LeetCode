class Solution {
    public int findKthLargest(int[] nums, int k) { // o nlog n
      
        
        // default min heap
        PriorityQueue<Integer> pq =
            new PriorityQueue<Integer>();

       
        for (int n: nums) {//n     
          pq.add(n);// log n
            
          if (pq.size() > k)
             pq.poll();
        }

        // output
        return pq.poll();        
  }
}
class Solution {
       
        
      public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
          
          // nums1 , nums2 index and sum
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[2]-b[2]);
          
        List<List<Integer>> res = new ArrayList<>();
          
        if(nums1.length==0 || nums2.length==0 || k==0) return res;
          
        for(int i=0; i<Math.min(nums1.length ,k); i++) 
            pq.add(new int[]{i, 0, nums1[i] + nums2[0]});
          
        while(k-- > 0 && !pq.isEmpty()){
            
            int[] curr = pq.poll();
            int i = curr[0], j = curr[1];
            res.add(Arrays.asList(nums1[i], nums2[j]));
            
            if(j+1 == nums2.length) continue;
            
            pq.add(new int[]{i, j+1, nums1[i] + nums2[j+1]});
            
        }
          
        return res;
     }
        
    
}
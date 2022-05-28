class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map <Integer,Integer> m1 = new HashMap<>();
        Map <Integer,Integer> m2 = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        
        for (int n : nums1) m1.put(n,m1.getOrDefault(n,0)+1);
        for(int n: nums2) m2.put(n,m2.getOrDefault(n,0)+1);
        
        
        for(int key : m1.keySet())
            if(m2.containsKey(key)) al.add(key);
        
        int res[] = new int[al.size()];
        
        res =  al.stream().mapToInt(x->x).toArray();
        return res;
            
    }
}
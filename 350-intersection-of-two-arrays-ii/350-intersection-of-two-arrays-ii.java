class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Map <Integer,Integer> set1 = new HashMap<>();
        Map <Integer,Integer> set2 = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        
        for (int n : nums1) set1.put(n,set1.getOrDefault(n,0)+1);
        for(int n: nums2) set2.put(n,set2.getOrDefault(n,0)+1);
        
        
        for(int num : set1.keySet())
            if(set2.containsKey(num)) {
                int freq = Math.min(set1.get(num),set2.get(num));
                set2.remove(num);
                for(int i=0;i<freq;i++)
                    al.add(num);
            }
        
        int res[] = new int[al.size()];
        
        res =  al.stream().mapToInt(x->x).toArray();
        return res;  
    }
}
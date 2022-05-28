class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> set1 = new HashSet<>();
        Set <Integer> set2 = new HashSet<>();
        List<Integer> al = new ArrayList<>();
        
        for (int n : nums1) set1.add(n);
        for(int n: nums2) set2.add(n);
        
        
        for(int num : set1)
            if(set2.contains(num)) al.add(num);
        
        int res[] = new int[al.size()];
        
        res =  al.stream().mapToInt(x->x).toArray();
        return res;
            
    }
}
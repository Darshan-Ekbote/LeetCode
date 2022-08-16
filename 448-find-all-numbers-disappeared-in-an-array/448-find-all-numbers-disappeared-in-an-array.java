class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> res= new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for( int n: nums) set.add(n);
        
        for( int i=1;i<=nums.length;i++){
            if(!set.contains(i))
                res.add(i);
        }
        
        return res;
    }
}
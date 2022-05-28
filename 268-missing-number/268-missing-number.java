class Solution {
    public int missingNumber(int[] nums) {
        
        Set <Integer> s = new HashSet<>();
        int i=0;
        for( int n : nums ) s.add(n);
        
        for( ;i<nums.length;i++) 
            if(!s.contains(i)) return i;
        if(i==nums.length) return nums.length;
        return -1;
    }
}
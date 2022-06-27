class Solution {
    public int longestConsecutive(int[] nums) {
     
       Set <Integer> set= new HashSet<>();
        for(int n: nums) set.add(n);
        
        int longest = 0;
        for (int n : nums) {
            if (!set.contains(n-1)) { //start of a sequence
                int len = 1;
                while (set.contains(n+len)) {
                    set.remove(n+len);
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }
        return longest;
    }
}
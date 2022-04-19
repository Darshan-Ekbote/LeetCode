class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        int[] result = new int[2];
        for( int i=0;i<nums.length;i++){
            int n = nums[i];
            if(m.containsKey(target-n)){
                result[0]= i;
                result[1]=m.get(target-n);
            }else{
                m.put(n,i);
            }
        }
        
        return result;
    }
}
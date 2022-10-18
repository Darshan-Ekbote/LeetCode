class Solution {
    public int countDistinctIntegers(int[] nums) {
       Set<Integer> map = new HashSet<>();

        for (int num : nums){
            map.add(num);
            map.add(revrse(num));
        }

        return map.size();
    }

    static int revrse(int num) {
        int res = 0;
        while (num > 0) {
            res = res * 10 + num % 10;
            num /= 10;
        }
        return res;
    }
}
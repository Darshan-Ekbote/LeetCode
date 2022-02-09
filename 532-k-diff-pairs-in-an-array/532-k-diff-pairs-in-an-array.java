public class Solution {
    public int findPairs(int[] nums, int k) {

        int result = 0;

        HashMap <Integer,Integer> m = new HashMap<>();
        for (int n: nums) {
            m.put(n, m.getOrDefault(n, 0)+1);
        }

        for (int key: m.keySet()) {
            int x = m.get(key);
            
            if (k > 0 && m.containsKey(key + k)) {
                result++;
            } else if (k == 0 && x > 1) {
                result++;
            }
        }
        return result;
    }
}
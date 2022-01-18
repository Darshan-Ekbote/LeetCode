class Solution {
  public int singleNumber(int[] nums) {
    int a = 0;
      /*
      res = 7 ^ (3 ^ 3) ^ (4 ^ 4) ^ (5 ^ 5)
          = 7 ^ 0 ^ 0 ^ 0
          = 7 ^ 0
          = 7
      */
    for (int i : nums) {
      a ^= i;
    }
    return a;
  }
}
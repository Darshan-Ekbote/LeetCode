class Solution {
    public long minimumHealth(int[] damage, int armor) {
       long maxDamage = 0;
        long sumDamage = 1;
        for (int d : damage) {
            maxDamage = Math.max(maxDamage, d);
            sumDamage += d;
        }
        if (maxDamage >= armor) {
            return sumDamage - armor;
        } else {
            return sumDamage - maxDamage;
        }
    }
}
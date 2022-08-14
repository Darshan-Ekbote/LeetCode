class Solution {
    public long minimumHealth(int[] damage, int armor) {
       long maxDamage = 0;
        long sumDamage = 1;
        for (int d : damage) {
            maxDamage = Math.max(maxDamage, d);
            sumDamage += d;
        }
        //to get the most optimal use of armour, it needs to be used when damage is more than the armour
        if (maxDamage >= armor) {
            return sumDamage - armor;
        } else {
            return sumDamage - maxDamage;
        }
    }
    
}
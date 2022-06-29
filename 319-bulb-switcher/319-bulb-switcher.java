class Solution {
    public int bulbSwitch(int n) {
        // https://www.youtube.com/watch?v=lyZhLR292yY
        /*
            A bulb would be toggled if the round is a divisor of that bulb position
            Also, in a odd round, the bulb will be toggled on
            off off off (initial)
            off on  off ( 1 )
            
            We need to find the numbers for which the count of divisors are odd.
            Numbers with odd divisors are perfect squares.
            We need to find count of perfect sq less than n.
            eg = n = 16
            
            1, 2, 4, 16
        */
        return (int)Math.sqrt(n);
    }
}
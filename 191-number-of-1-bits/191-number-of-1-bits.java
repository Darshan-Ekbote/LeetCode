public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        String s =  Integer.toBinaryString(n);
        int oneCount =0;
        for( char c : s.toCharArray())
            if(c=='1')
                oneCount++;
        
        
        return oneCount;
    }
}
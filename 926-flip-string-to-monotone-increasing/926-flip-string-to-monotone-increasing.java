class Solution {
    public int minFlipsMonoIncr(String s) {
        
         int ones = 0;
        
        int flips = 0;
        
        
        for(char ch: s.toCharArray()){
            if(ch == '1') ones++;
            
            if(ch == '0')   flips++;
            
            flips = Math.min(flips, ones);
            
        }
        return  flips;
    }
}
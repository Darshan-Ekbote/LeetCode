class Solution {
    public int[] countBits(int n) {
       
        int [] res = new int[n+1];
        
        for( int num=0;num<= n;num++)
            res[num]= countOnes(num);
        
        
        return res;
    }
    public int countOnes( int num){
        
        String s = Integer.toBinaryString(num);
        int one=0;
        
        for( char c : s.toCharArray())
            if(  c=='1') one++;
      
        return one;
    }
}
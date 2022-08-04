class Solution {
    public int[] sumZero(int n) {
        
        if( n ==1) return new int[]{0};
        
        int [] res =new int[n];
        
        boolean isEven = n%2 ==0 ; 
        
        int i =0;
        int index=0;
        for ( ;i< n/2 ;i++){
            res[index++] = i+1;
            res[index++] = (i+1) *-1;
        }
        
        if(!isEven) res[index++]=0;
        
        return res;
    }
}
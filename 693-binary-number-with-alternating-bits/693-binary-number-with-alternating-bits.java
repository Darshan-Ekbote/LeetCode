class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=  Integer.toBinaryString(n);
        int index =0;
        char temp='a';
        
        //101
        for( char  c : s.toCharArray()){
            
            if( index ==0) temp =c;
            
            else{
                if( (temp == '0' && c=='1') || (temp=='1' && c=='0'))
                    temp =c;
                else
                    return false;
            }
            
            index++;
        }
        return true;
    }
}
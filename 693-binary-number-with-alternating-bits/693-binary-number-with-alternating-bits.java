class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=  Integer.toBinaryString(n);
        int index =0;
        char temp='a';
        for( char  c : s.toCharArray()){
            if( index ==0) temp =c;
            else{
                if( (temp != c))temp =c;
                else return false;
            }
            index++;
        }
        return true;
    }
}
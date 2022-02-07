class Solution {
    public char findTheDifference(String s, String t) {
        
        char[] ss = new char[s.length()];
        char[] tt = new char[t.length()];
        
        ss= s.toCharArray();
        Arrays.sort(ss);
        tt= t.toCharArray();
        Arrays.sort(tt);
        
        int count=0;
        for( int i =0;i< ss.length;i++){
            if( tt[i]!=ss[i])
                return tt[i];
            
            count++;
        }
        
        return  count==s.length() ? tt[count] : '-';
            
    }
}
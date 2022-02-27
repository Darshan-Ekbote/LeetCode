class Solution {
    public boolean checkInclusion(String s1, String s2) {
        for( int i =0;i< s2.length(); i++)
                if(slidingWindow(s1,s2,i))
                    return true;
        
        return false;
    }
    
    public boolean slidingWindow(String s1, String s2, int index){
        if(index+s1.length()>s2.length())
            return false;
        
        Map <Character, Integer> sTwo= new HashMap<>();
        
        for(char c:s2.substring(index,index+s1.length()).toCharArray() ){
            sTwo.put(c, sTwo.getOrDefault(c,0)+1);
        }
        
        
        for(char c:s1.toCharArray() ){
            if(sTwo.containsKey(c)&& sTwo.get(c)>0){
                int val=sTwo.get(c)-1 ;
                sTwo.put( c, val);
            }
                
             else
                 return false;
        }
        
        return true;
    }
}
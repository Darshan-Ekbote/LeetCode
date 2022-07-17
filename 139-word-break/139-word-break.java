class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        boolean dp[] = new boolean[s.length()+1];
        //Set<String> set= new HashSet<>(wordDict);
        dp[s.length()]=true;
        
        for( int i=s.length();i>=0;i--){
            
            for(String w : wordDict){
                
                if(i+w.length()<=s.length() && s.substring(i,i+w.length()).startsWith(w))
                    dp[i]= dp[i+w.length()];
               
                //found the match move to the next index in s
                if(dp[i])
                    break;
            }
        }
        
        return dp[0];
}
}
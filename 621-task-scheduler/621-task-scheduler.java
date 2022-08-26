class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int freq[] = new int[26];
        
        for( char c : tasks)
            freq[c-'A']++; 
            
        
        Arrays.sort(freq);
        //get max freq
        int maxFreq = freq[25];
        
        //this is the maximum idle time 
        int totalIdleTime= ( maxFreq-1 )* n;
        
        // AB_AB_A
        for(int j=0;j<25;j++ ){
            totalIdleTime -= Math.min(maxFreq-1,freq[j]);
        }
        
        return totalIdleTime<=0 ? tasks.length: totalIdleTime+tasks.length;
        
        
        
    }
}
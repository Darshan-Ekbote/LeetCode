class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int freq[] = new int[26];
        
        for( char c : tasks)
            freq[c-'A']++; 
            
        
        Arrays.sort(freq);
        
        int maxFreq = freq[25];
        
        int totalIdleTime= ( maxFreq-1 )* n;
        
        for(int j=24;j>=0;j-- ){
            totalIdleTime -= Math.min(maxFreq-1,freq[j]);
        }
        
        return totalIdleTime<=0 ? tasks.length: totalIdleTime+tasks.length;
        
        
        
    }
}
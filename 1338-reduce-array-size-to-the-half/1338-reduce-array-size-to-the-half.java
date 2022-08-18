class Solution {
    public int minSetSize(int[] arr) {
        
        Map<Integer,Integer> m = new HashMap<>();
        
        for( int n: arr) 
            m.put(n, m.getOrDefault(n,0)+1);
        
                       
        ArrayList<Integer> al=  new ArrayList<Integer>(m.values());
        Collections.sort(al,Collections.reverseOrder());
        
        int ans=1,sum=0;      
        
        for(int i=0;i<al.size();i++){
           sum+=al.get(i);
             if(sum>=arr.length/2){
                ans+=i;
                break;
            }
        }
        
        return ans;
        
    }
}
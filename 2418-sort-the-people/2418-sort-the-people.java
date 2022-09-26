class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> m = new TreeMap<>();
        
        for( int i=0; i< heights.length;i++){
            m.put(heights[i],names[i]);
        }
        
        
        String results[] = new String[heights.length];
        
        int i=heights.length-1;
        for(int n : m.keySet()){
            
           results[i--] = m.get(n);
        }
        
        return results;
    }
}
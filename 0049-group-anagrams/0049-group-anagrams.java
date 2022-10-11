class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map < String, List<String>> m = new HashMap<>();
        
     
        for( String s: strs){
            
            char[] sArr = s.toCharArray();
            
            Arrays.sort(sArr);
            String sNew = new String(sArr);
            
            if(m.containsKey(sNew)){
                m.get(sNew).add(s);
            }else{
                List <String> temp = new ArrayList<>();
                temp.add(s);
                m.put(sNew,temp);
            }
            
            
        }
        
        for(String key : m.keySet()){
            res.add(new ArrayList<>(m.get(key)));
        }
        
        return res;
    }
}
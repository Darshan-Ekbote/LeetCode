class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map < String, List<String>> m = new HashMap<>();
        
        for( String str : strs){
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String ss = new String(s);
            if(m.containsKey(ss))
                m.get(ss).add(str);
            else{
                List<String> temp = new ArrayList< >( );
                temp.add(str);
                m.put(ss, temp);
            }
        }
        
        for( String key : m.keySet()){
             List<String> temp = m.get(key);
            res.add( temp);
        }
        
        return res;
    }
}
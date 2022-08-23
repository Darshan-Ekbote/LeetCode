class Solution {
    Map<String , Integer> map;
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        map = new HashMap<>();
        for(String w : words){
            map.put(w , map.getOrDefault(w , 0) + 1);
        }
        List<String> res = new ArrayList<>();
        for(String w : words){
            map.remove(w);
            if(find(w)){
                res.add(w);
            }
            map.put(w , 1);
        }
        return res;
    }
    boolean find(String w){
        if(w.equals("")) return true;
        for(int i = 1; i <= w.length(); i++){
            String pre = w.substring(0 , i);
            if(map.containsKey(pre)){
                String remaining = w.substring(i);
                if(find(remaining)){
                    return true;
                }
            }
        }
        return false;
    }
}
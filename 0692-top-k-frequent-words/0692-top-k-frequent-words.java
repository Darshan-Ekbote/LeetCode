class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s: words)
            map.put(s, map.getOrDefault(s, 0)+ 1);
        
		//custom comparator for comparing the words
        Queue<String> q = new PriorityQueue<>((w1, w2) -> map.get(w1)==(map.get(w2)) ?
                w2.compareTo(w1) : map.get(w1) - map.get(w2));
        
		//add to the heap
        for (String word: map.keySet()){
            q.add(word);
            if (q.size() > k) q.poll();
        }
                                       
        //add to the result
        List<String> result = new ArrayList<>();
        while (!q.isEmpty())
            result.add(q.poll());
        Collections.reverse(result);
        return result;
    }
}
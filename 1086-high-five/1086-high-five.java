class Solution {
    public int[][] highFive(int[][] items) {
        
        HashMap<Integer,List<Integer>> m = new HashMap<>();
       
        for( int[] item :  items){
            if(m.containsKey(item[0]))
                m.get(item[0]).add(item[1]);
              else{
                  
                  List<Integer> temp = new ArrayList<>();
                  temp.add(item[1]);
                  m.put(item[0],temp);
                  
              }  
        }
        
        int index=0;
        int [][] result = new int[m.size()][2];
        
        for( int id : m.keySet()){
            
            List<Integer> scores = new ArrayList<>();
            scores = m.get(id);
            //sor the scores to get the top 5 scores
            Collections.sort(scores, (a,b)->b-a);
            int sum=0;
            //get thte total of top 5 scores
            for( int i=0;i<5;i++){
                sum += scores.get(i);
            }
            result[index++]=  new int[]{id, (int)(sum/5) };
            
        }
        return result;
        
        
    }
}
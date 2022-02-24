class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map< Integer,Integer> m = new HashMap<Integer,Integer>();
        int[] res = new int[2];
        int i=0;
        for( int n: numbers){
            
            if(m.containsKey(target-n)){
                res[0]=m.get(target-n)+1 ;
                res[1] = i+1;
                
                return res;
            }
            else
                m.put(n, i);
            
            i++;
            
        }
        
        return res;
    }
}
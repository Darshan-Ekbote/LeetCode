class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map < Integer, Integer> m1 = new LinkedHashMap<>();
        Map < Integer, Integer> m2 = new LinkedHashMap<>();
        int res[] = new int[nums1.length];
        
        int i=0;
        for( int n : nums1) m1.put(n,i++);
        
         i=0;
        for( int n : nums2) m2.put(n,i++);
        int j=0;
        for( int n:nums1){
            
            //see if exists-> always exists
            //get index
            int index= m2.get(n);
            int element =n;
            //get the greater one if exists
            for(int key: m2.keySet()){
                
                //found the next greater and on the right hand side of the element
                if(key >element && m2.get(key)>index){
                    res[j++]=key;
                    element =key;
                    break;
                }
            }
            //not found
            if(element==n) res[j++]=-1;
        }
       
        return res;
        
    }
}
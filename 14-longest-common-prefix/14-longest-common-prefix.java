class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs, (a,b) -> a.length()-b.length());
        
        int len = strs[0].length();
        String smallest = strs[0];
        StringBuilder sb = new StringBuilder();
       // List<String> allComms = new ArrayList<>();
        int i=0;
        int j=0;
      
        while(i< len){
             char c = smallest.charAt(i);
            for(j=0;j<strs.length;j++){
                if(c== strs[j].charAt(i)) continue;
                else  break;
            }
            //found common
            if(j==strs.length && i==sb.length() ){
                sb.append(c);
            }
            i++;
        }
        
        return sb.toString();
    }
}
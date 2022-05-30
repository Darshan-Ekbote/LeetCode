class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
       
        int rev = words.length-1;
        
        for( int j=rev;j>=0;j--){
            if(!words[j].equals(" ") && !words[j].isEmpty()){
                if(j != 0) sb.append(words[j]+" ");
                else sb.append(words[j]);
            }
            
        }
        
        return sb.toString().trim();
        
    }
}
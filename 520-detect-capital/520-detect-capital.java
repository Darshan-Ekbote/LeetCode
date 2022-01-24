class Solution {
    public boolean detectCapitalUse(String word) {
      
        if(word.length()==1) return true;
          int count=0;
         boolean flag2 = false;
        boolean flag1 = false;
        
        if(word.charAt(0) >='A' && word.charAt(0) <= 'Z' ||  word.charAt(0) >='a' && word.charAt(0) <= 'z' ) {
            
            for(int i=1;i<word.length();i++){
                if( word.charAt(i)>='a' && word.charAt(i)<='z'){
                    count++;
                    flag1= true;
                }else {
                   break; 
                }
            }
            
        }
        int count2=0;
        if(word.charAt(0) >='A' && word.charAt(0) <= 'Z' ){
            
            for(int i=1;i<word.length();i++){
                if( word.charAt(i)>='A' && word.charAt(i)<='Z'){
                    count2++;
                    flag2= true;
                }else {
                    break;
                }
            }
            
        }
        
        if(flag1)
            return count +1 == word.length() ;
        else if( flag2)
             return count2 +1 == word.length() ;
            
        return false;
    }
} 
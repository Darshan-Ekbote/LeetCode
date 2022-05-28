class Solution {
    public int compress(char[] chars) {
        
        if(chars.length==1)
            return 1;
        char s = chars[0];
        int ptr=0;
        
        StringBuffer sb = new StringBuffer();
        int count =1;int i =0;
        for(;i< chars.length;i++){
            
            i=ptr+1;
            
            
             if(s!=chars[i])
                {
                    
                 if(count!=1)
                    sb.append(String.valueOf(s)+""+count);
                else
                    sb.append(String.valueOf(s));
                 
                 s=chars[i];
                 count=0;
                }
            else{
                count++;
                ptr++;
            }
        }
        if(count==1||count==0)
             sb.append(String.valueOf(chars[i-1]));
        else
             sb.append(String.valueOf(chars[i-1])+""+count);
        
        String str = sb.toString();
        
        for(int k=0;k<str.length();k++){
           chars[k]=str.charAt(k);
        }
        return str.length(); 
    }
}
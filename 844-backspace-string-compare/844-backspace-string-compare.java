class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder ss= new StringBuilder();
        StringBuilder tt= new StringBuilder();
        
        for(int i =0;i<  s.length() ; i++ ){
            
            if(s.charAt(i)!='#')
                ss.append(s.charAt(i));
            else if(ss.length()>0)
                ss.deleteCharAt(ss.length()-1);
            
            
        }
        
     for(int i =0;i<  t.length() ; i++ ){
                    if(t.charAt(i)!='#')
                        tt.append(t.charAt(i));
                    else if(tt.length()>0)
                         tt.deleteCharAt(tt.length()-1);
     }
    
        return  ss.toString().equals(tt.toString());
    }
}
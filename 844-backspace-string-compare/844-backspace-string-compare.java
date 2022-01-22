class Solution {
    public boolean backspaceCompare(String s, String t) {
        return   getString(s).equals(getString(t));
    }
    
    public String getString(String  s){
        StringBuilder ss= new StringBuilder();
        
        for(int i =0;i<  s.length() ; i++ ){
            if(s.charAt(i)!='#')
                ss.append(s.charAt(i));
            else if(ss.length()>0)
                ss.deleteCharAt(ss.length()-1);
        }
        
        return ss.toString();
    }
}
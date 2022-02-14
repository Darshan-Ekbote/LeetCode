public class Codec {
    StringBuilder sb = new StringBuilder();
    
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        
        if(strs.isEmpty()) return "";
        
        for( String str : strs){
            sb.append(str).append("\u0000");
        }
        sb.deleteCharAt(sb.length()-1);
        
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> strs = new ArrayList<>();
        if(s.isEmpty()){
            strs.add("");
            return strs;
        }
        
        String[] ss = s.split("\u0000",-1);
        
        for( String str : ss){
            
            strs.add(str);
        }
        
        return strs;
        
    }
}
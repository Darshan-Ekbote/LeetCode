class Solution {
    public String destCity(List<List<String>> paths) {
        
        ArrayList<String> outDegree = new ArrayList<String>() ;

        for(List<String> path : paths)
            outDegree.add(path.get(0));
        
        
        for( List<String> path : paths)
            if(!outDegree.contains(path.get(1))) return path.get(1);
        
       return "-1" ;
        
    }
}
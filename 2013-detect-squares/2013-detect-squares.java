class DetectSquares {
    Map<Pair<Integer,Integer>, Integer> map;
    List<int[]> lists;
    public DetectSquares() 
    {
        map = new HashMap<>();
        lists = new ArrayList<>();
    }
    
    public void add(int[] point)
    {
        Pair temp = new Pair<>(point[0], point[1]);
        map.put(temp, map.getOrDefault(temp, 0) +1);
        lists.add(point);
    }
    
    public int count(int[] point) 
    {
        int res =0;
        int qx = point[0];
        int qy = point[1];
        for(int[] list: lists)
        {
            int lx = list[0];
            int ly = list[1];
            //not a square , find the diagonal point , if exists then get the other two points
            if(Math.abs(qy-ly) != Math.abs(qx-lx) || qx == lx || qy == ly)
                continue;
            res += map.getOrDefault(new Pair<>(lx,qy), 0) * map.getOrDefault(new Pair<>(qx, ly),0);
        }
        return res;
    }
}
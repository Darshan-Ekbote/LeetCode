class Vector2D {

    List<Integer> al;
    ListIterator <Integer> it ; 
    
    public Vector2D(int[][] vec) {
        al =new ArrayList<>();
        
        for( int[] n : vec)
            for(int i : n)
                 al.add(i);
        
        
        it = al.listIterator();
    }
    
    public int next() {
       return it.next();
        
    }
    
    public boolean hasNext() {
        return it.hasNext();
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D obj = new Vector2D(vec);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
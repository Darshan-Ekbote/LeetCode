class MedianFinder {
    ArrayList <Integer> al ;
    
    public MedianFinder() {
        al = new ArrayList<>();
    }
    
    public void addNum(int num) {
         if(al.size() == 0) {
            al.add(num);    
        } else {
            // binary search for next index to append
            int s = 0, e = al.size() - 1;
            while(s <= e) {
                int mid = s + (e-s)/2;
                if(al.get(mid) == num) {
                    s = mid;
                    break;
                } else if(num < al.get(mid)) {
                    e = mid-1;
                } else {
                    s = mid+1;
                }
            }
            
            al.add(s, num);
        }
            
    }
    
    public double findMedian() {
        int len = al.size();
        if( len ==2){
            double sum =0.0;
            for( int n: al )
                sum+=n;
            
            return sum/2;
        }
        if( len %2 == 0  && len >0){
            
           double sum = al.get(len/2) + al.get(len/2 - 1);
            return sum/2;
        }
        
        if( len %2 ==1){
            double med = al.get(len/2 );
            return med;
        }
        return -1.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
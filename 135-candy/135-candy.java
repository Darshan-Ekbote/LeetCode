class Solution {
    public int candy(int[] ratings) {
        
        int leftCandies[] = new int[ratings.length];
        int rightCandies[] = new int[ratings.length];
        
        //every child gets atleast 1 candy
        Arrays.fill(leftCandies,1);
        Arrays.fill(rightCandies,1);
        //[1,0,2]
        
        //check rating with the left child
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1])
                leftCandies[i] = leftCandies[i-1]+1;
            
        }
        
        //check rating with the right child
          for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])
                rightCandies[i] = rightCandies[i+1]+1;
            
        }
        
        int candies =0;
        
        for( int i=0;i<ratings.length;i++)
            candies+= Math.max(rightCandies[i],leftCandies[i]);
            
        
        
        return candies;
    }
    
    
}
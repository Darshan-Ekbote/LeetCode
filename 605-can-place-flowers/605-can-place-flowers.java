class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        
        for( int i =0 ;i< flowerbed.length && n>0;i++){
           
            //plant for alternate 0 after 1
           
            if(flowerbed[i]==0 && (i==0 ||flowerbed[i-1]==0) && (i== flowerbed.length-1 || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                n--;
            }
               
               if(n==0)
                return true;
        }
        
        return n==0;
    }
}
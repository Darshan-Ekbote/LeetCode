class Solution {
    public List<List<String>> suggestedProducts(String[] products, String word) {
        List<List<String>> result=new ArrayList();
        Arrays.sort(products);
        
        String str="";
        
        for(int i=0;i<word.length();i++)
        {
            List<String> tempList=new ArrayList();
            str+=word.charAt(i);
            for(int j=0;j<products.length;j++)
            {
                if(products[j].startsWith(str))
                {
                    tempList.add(products[j]);
                    if(tempList.size()==3)
                        break;
                }
            }
            result.add(tempList);
        }
        return result;
    }
}
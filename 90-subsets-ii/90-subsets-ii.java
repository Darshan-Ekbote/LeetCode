class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        //sorting is very important 
        Arrays.sort(nums);
        
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<Integer>());

        int subsetSize = 0;

        for (int i = 0; i < nums.length; i++) {
            int startingIndex = (i >= 1 && nums[i] == nums[i - 1]) ? subsetSize : 0;
            // subsetSize refers to the size of the subset in the previous step. This value also indicates the starting index of the subsets generated in this step.
            //because the previous combinations are already added to result list with the same element ...so just start from previous level...fro this sorting is important else result woult be wrong
            subsetSize = subsets.size();
            for (int j = startingIndex; j < subsetSize; j++) {
                List<Integer> temp = new ArrayList<>(subsets.get(j));
                temp.add(nums[i]);
                subsets.add(temp);
            }
        }
        return subsets;
    }
}
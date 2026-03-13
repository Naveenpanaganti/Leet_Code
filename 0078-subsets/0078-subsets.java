class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> templist = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        subset(nums, 0, templist, result);
        return result;    
    }

    void subset(int[] nums, int idx, List<Integer> templist, List<List<Integer>> result){
        if(idx >= nums.length){
            result.add(new ArrayList<>(templist));
            return;
        }
        templist.add(nums[idx]);
        subset(nums, idx+1, templist, result);
        templist.remove(templist.size()-1);
        subset(nums, idx+1, templist, result);
    }
}
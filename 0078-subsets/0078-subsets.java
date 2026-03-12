class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> templist = new ArrayList<>();
        subset(nums, templist ,result, 0);
        return result;
    }
    public void subset(int[] nums, List<Integer> templist, List<List<Integer>> result, int idx){
        if(idx >= nums.length){
            result.add(new ArrayList<>(templist));
            return;
        }
        templist.add(nums[idx]);
        subset(nums, templist, result, idx+1);
        templist.remove(templist.size()-1);
        subset(nums, templist, result, idx+1);        
    }
}
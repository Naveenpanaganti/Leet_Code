class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0, nums, temp, res);
        return res;
        
    }
    public void solve(int idx, int[] nums, List<Integer> temp, List<List<Integer>> res){
        if(idx >= nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        solve(idx+1, nums, temp, res);
        temp.remove(temp.size()-1);
        solve(idx+1, nums, temp, res);
    }
}
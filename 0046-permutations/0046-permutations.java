class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, ans);
        return ans;        
    }
    public void backtrack (int idx, int[] nums, List<List<Integer>> ans){
        if(idx == nums.length){
            List<Integer> templist = new ArrayList<>();
            for(int num : nums){
                templist.add(num);
            }
            ans.add(new ArrayList(templist));
            return;
        }
        for(int i = idx; i < nums.length; i++){
            swap(i, idx, nums);
            backtrack(idx+1, nums, ans);
            swap(i, idx, nums);
        }
    }
    public void swap(int i, int j, int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j]= t;
    }
}
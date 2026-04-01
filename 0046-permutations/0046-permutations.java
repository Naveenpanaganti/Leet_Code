class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Solve(0, nums,ans);
        return ans;
    }
    public void Solve(int idx, int[] nums, List<List<Integer>> ans){
        if(idx == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num : nums){
                temp.add(num);
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx; i<nums.length; i++){
            swap(i, idx, nums);
            Solve(idx+1, nums, ans);
            swap(i, idx, nums);
            }
        }
    public void swap(int i, int idx, int[] nums){
        int t = nums[i];
        nums[i] = nums[idx];
        nums[idx] =t;
    }
}
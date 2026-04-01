class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        Solve(0, nums,temp,freq,ans);
        return ans;
    }
    public void Solve(int idx, int[] nums, List<Integer> temp,boolean[] freq, List<List<Integer>> ans){
        if(idx == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!freq[i]){
                temp.add(nums[i]);
                freq[i] = true;
                Solve(idx+1,nums,temp,freq, ans);
                temp.remove(temp.size()-1);
                freq[i] = false;
            }
        }
    }
}
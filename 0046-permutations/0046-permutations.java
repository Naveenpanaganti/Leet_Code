class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> templist = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];

        backtrack(0, nums, freq, templist, ans);
        return ans;
    }
    public void backtrack(int idx, int[] nums, boolean[] freq, List<Integer> templist, List<List<Integer>> ans){
        if(templist.size() == nums.length){
            ans.add(new ArrayList(templist));
            return;
        }
        for(int i =0; i<nums.length; i++){
            if(!freq[i]){
                freq[i] = true;
                templist.add(nums[i]);
                backtrack(idx+1, nums, freq, templist, ans);
                templist.remove(templist.size()-1);
                freq[i] =false;
            }
        }
    }
}
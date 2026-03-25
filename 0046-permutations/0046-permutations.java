class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> templist = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        solu(0, nums, freq, templist, ans);
        return ans;
    }
    public void solu(int idx, int[] nums, boolean freq[], List<Integer> templist, List<List<Integer>> ans){
        if(templist.size() == nums.length){
            ans.add(new ArrayList(templist));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(!freq[i]){
                freq[i] = true;
                templist.add(nums[i]);
                solu(idx+1, nums, freq, templist, ans);
                templist.remove(templist.size()-1);
                freq[i] = false;
            }
        }
        return;
    }
}
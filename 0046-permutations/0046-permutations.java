class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        backtrack(0, nums, freq, temp, ans);
        return ans;        
    }
    public void backtrack(int idx, int[] nums, boolean[] freq, List<Integer> temp, List<List<Integer>> ans){
        if(temp.size() == nums.length){
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i=0; i< nums.length; i++){
            if(!freq[i]){
                temp.add(nums[i]);
                freq[i]=true;
                backtrack(i+1, nums, freq, temp, ans);
                temp.remove(temp.size()-1);
                freq[i]= false;
            }
        }
    }
}
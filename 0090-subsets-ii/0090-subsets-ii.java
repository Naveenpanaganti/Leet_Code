class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> templist = new ArrayList<>();
        Arrays.sort(nums);
        subset(0, nums, templist, ans);
        return ans;        
    }
    public void subset(int idx , int[] nums, List<Integer> templist, List<List<Integer>> ans){
       ans.add(new ArrayList(templist));
       for(int i =idx; i< nums.length; i++){
        if(i > idx && nums[i]==nums[i-1]) continue;
        templist.add(nums[i]);
        subset(i+1, nums, templist, ans);
        templist.remove(templist.size()-1);
       }
    }
}
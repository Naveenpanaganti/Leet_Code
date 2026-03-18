class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> templist = new ArrayList<>();
        Arrays.sort(nums);
        subset(0, nums, res, templist);
        return res;        
    }
    public void subset(int idx, int[] nums, List<List<Integer>> res, List<Integer> templist){
            res.add(new ArrayList(templist));
       

        for(int i=idx ; i<nums.length; i++){
            if(i > idx && nums[i]==nums[i-1]) continue;
            templist.add(nums[i]);
            subset(i+1, nums,res, templist);
            templist.remove(templist.size()-1);
        }
    }
}
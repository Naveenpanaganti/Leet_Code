class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> templist = new ArrayList<>();
        combination(0, candidates, target, templist, ans);
        return ans;  
    }
    public void combination(int idx, int[] candidates, int target, List<Integer> templist, List<List<Integer>> ans){
        if(idx == candidates.length){
            if(target == 0){
                ans.add(new ArrayList(templist));
            }
            return;
        }
        if(candidates[idx] <= target){
            templist.add(candidates[idx]);
            combination(idx, candidates, target-candidates[idx], templist, ans);
            templist.remove(templist.size()-1);
        }
        combination(idx+1, candidates, target, templist, ans);
    }
}
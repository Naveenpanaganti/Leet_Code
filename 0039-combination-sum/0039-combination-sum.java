class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findcombination(0, candidates, target, ans, ds);
        return ans;  
    }
    public void findcombination(int idx, int[] candidates, int target,List<List<Integer>> ans, List<Integer> ds){
        if(idx == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[idx] <= target){
            ds.add(candidates[idx]);
            findcombination(idx, candidates, target-candidates[idx], ans, ds);
            ds.remove(ds.size()-1);
        }
        findcombination(idx+1,candidates, target, ans, ds); 
    }
}
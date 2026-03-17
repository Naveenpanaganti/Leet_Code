class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combination(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
    public void combination(int idx, int[] arr, int target, List<Integer> templist, List<List<Integer>> ans ){
        if(target == 0){
            ans.add(new ArrayList<>(templist));
            return;
        }
        for(int i=idx; i<arr.length; i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i] > target) break;
            templist.add(arr[i]);
            combination(i+1, arr, target-arr[i], templist, ans);
            templist.remove(templist.size()-1);
        }
    }
}
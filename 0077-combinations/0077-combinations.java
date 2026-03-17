class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> templist = new ArrayList<>();
        combination(1,n, ans, templist,k);
        return ans;        
    }
    public void combination(int s,int n, List<List<Integer>> ans, List<Integer> templist, int k){
        if(templist.size() == k){
            ans.add(new ArrayList<>(templist));
            return;
        }
        for(int i=s; i<=n ;i++){
        templist.add(i);
        combination(i+1,n, ans, templist,k);
        templist.remove(templist.size()-1);
        // combination(idx+1, arr, ans, templist,k);
    }
    }
}
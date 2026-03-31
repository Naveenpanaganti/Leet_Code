class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        Solve(0,s, temp, ans);    
        return ans;    
    }
    public void Solve(int idx, String s, List<String> temp, List<List<String>> ans){
        if(idx == s.length()){
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i=idx; i<s.length(); i++){
            if(ispalindrome(idx, i, s, temp)){
                temp.add(s.substring(idx, i+1));
                Solve(i+1, s, temp, ans);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean ispalindrome(int start, int end, String s, List<String> temp){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end))
            return false;
            start++;
            end--;
        }
        return true;

    }
}
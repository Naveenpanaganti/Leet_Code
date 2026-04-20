class Solution {
    public boolean canJump(int[] nums) {
        //int jump =0;
        int n = nums.length;
        int maxidx =0;
        for(int i=0; i<n; i++){
            if(i>maxidx) return false;
            maxidx = Math.max(maxidx,i+nums[i]);
        }
        return true;
    }
}
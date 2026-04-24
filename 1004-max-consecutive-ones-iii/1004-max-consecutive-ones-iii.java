class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0, maxlen=0, zeros=0;
        int n= nums.length;
        for(int r=0; r<n; r++){
            if(nums[r] == 0){
                zeros++;
            }
            while(zeros>k){
                if(nums[l]==0){
                    zeros--;
                }
                l++;
            }
            maxlen = Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
}
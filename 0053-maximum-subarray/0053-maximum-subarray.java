class Solution {
    public int maxSubArray(int[] nums) {
        int currsum =nums[0];
        int maxsum =nums[0];
        int n = nums.length;
        for(int i=1; i<n; i++){
            currsum = Math.max(nums[i], currsum+nums[i]);
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
        
    }
}
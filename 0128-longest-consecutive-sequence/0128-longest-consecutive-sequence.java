class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        int streak=1;
        int maxstreak =1;
        for(int i=1; i<n; i++){
            if(nums[i] != nums[i-1]){
                if(nums[i] == nums[i-1]+1){
                    streak++;    
                }
                else{
                    maxstreak = Math.max(streak, maxstreak);
                    streak =1;
                }
            }
        }
        return Math.max(maxstreak, streak);
        
    }
}
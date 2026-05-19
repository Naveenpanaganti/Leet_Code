class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n ==0){
            return 0;
        }
        int currstreak =1;
        int maxstreak =1;
        for(int i=1; i<n; i++){
            if(nums[i] != nums[i-1]){
                if(nums[i] == nums[i-1]+1){
                    currstreak++;
                }
                else{
                    maxstreak = Math.max(currstreak, maxstreak);
                    currstreak=1;
                }
            }
        }
        return Math.max(currstreak, maxstreak);
        
    }
}
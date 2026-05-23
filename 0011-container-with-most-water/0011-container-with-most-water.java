class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l =0;
        int r = n-1;
        int maxwtr =0;
        while(l<=r){
            int w = r-l;
            int h = Math.min(height[l], height[r]);
            int water = h*w;
            maxwtr = Math.max(maxwtr, water);
            if(height[l]> height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return maxwtr;
    }
}
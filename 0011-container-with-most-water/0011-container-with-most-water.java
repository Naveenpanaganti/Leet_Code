class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int lp =0;
        int rp =n-1;
        int maxwtr =0;
        while(lp < rp){
            int w = rp-lp;
            int h = Math.min(height[lp], height[rp]);
            int curwtr = w*h;
            maxwtr = Math.max(curwtr, maxwtr);
            if(height[lp] < height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwtr;        
    }
}
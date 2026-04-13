class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        int maxwtr =0;
        int left = 0;
        int right = n-1;
        while(left < right ){
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h*width;
            maxwtr = Math.max(maxwtr, area);
            if(height[left] < height[right]){
                left++;
            } 
            else{
                right--;
            }
        }
        
        return maxwtr;
        
    }
}
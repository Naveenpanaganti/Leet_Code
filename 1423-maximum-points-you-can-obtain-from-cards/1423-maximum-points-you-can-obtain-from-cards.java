class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum =0;
        int rightsum =0;
        
        int n = cardPoints.length;
        for(int i=0; i<k; i++){
            leftsum = leftsum + cardPoints[i]; 
        }
        int maxsum =leftsum;
        for(int i=0; i<k; i++){
            leftsum = leftsum - cardPoints[k-1-i];
            rightsum = rightsum + cardPoints[n-1-i];
            maxsum = Math.max(maxsum, leftsum+rightsum);
        }
        
        return maxsum;
    }
}
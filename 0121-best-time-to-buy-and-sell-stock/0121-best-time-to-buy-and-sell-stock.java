class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int Maxprofit =0;
        for(int i=1; i<prices.length; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            Maxprofit = Math.max(Maxprofit,prices[i]- buy);
        }
        return Maxprofit;
    }
}
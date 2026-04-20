class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five =0;
        int ten =0;
        int twenty =0;
        for(int n : bills){
            if( n == 5){
                five++;
            }
            else if(n == 10){
                if(five>0){
                    ten++;
                    five--;
                }
                else return false;
            }
            else if( n ==20){
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }
                else if(five>=3){
                    five -= 3;
                }
                else return false;
                
            }
        }
        return true;
    }
}
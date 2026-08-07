class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE,profit=0,min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            profit=prices[i]-min;
            if(max<profit){
                max=profit;
            }
        }
        return max;
    }
}
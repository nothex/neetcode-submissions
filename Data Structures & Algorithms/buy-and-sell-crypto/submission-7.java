class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0],profit=0,sell=0;
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]) buy=prices[i];
            sell=prices[i];
            profit=Math.max(profit,sell-buy);
        }
        return profit;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minBuy=Integer.MAX_VALUE;
        for(int i=0; i <= prices.length-1;i++){
            minBuy=Math.min(minBuy, prices[i]);
            profit=Math.max(profit,(prices[i]-minBuy));
        }
        return profit;
    }
}

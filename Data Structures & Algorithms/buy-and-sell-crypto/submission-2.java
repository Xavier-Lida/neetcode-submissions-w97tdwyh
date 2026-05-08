class Solution {
    public int maxProfit(int[] prices) {
        int priceToBuy = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            priceToBuy = Math.min(priceToBuy, price);
            maxProfit = Math.max(maxProfit, price - priceToBuy);
        }
        return maxProfit;
    }
}

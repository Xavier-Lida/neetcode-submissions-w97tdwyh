class Solution {
    public int maxProfit(int[] prices) {
        int priceToBuy = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            maxProfit = Math.max(maxProfit, price - priceToBuy);
            priceToBuy = Math.min(priceToBuy, price);
        }

        return maxProfit;
    }
}

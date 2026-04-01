// Last updated: 4/1/2026, 10:45:39 PM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minipro = Integer.MAX_VALUE;
        int maxpro = 0;
        for (int i = 0; i < n; i++) {
            minipro = Math.min(minipro, prices[i]);
            maxpro = Math.max(maxpro, prices[i] - minipro);
        }
        return maxpro;
    }
}
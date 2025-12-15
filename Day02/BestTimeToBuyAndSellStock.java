class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, num = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (num > prices[i]) {
                num = prices[i];
            }
            max = Math.max(max, prices[i] - num);
        }
        if (max == -1) {
            return 0;
        }
        return max;
    }
}

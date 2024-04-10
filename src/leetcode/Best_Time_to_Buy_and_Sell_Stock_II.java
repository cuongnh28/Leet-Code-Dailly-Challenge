package leetcode;

public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1])
                res += prices[i] - prices[i-1];
        }

        return res;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{7,1,5,3,6,4}; //-> n = 4, k = 2
        System.out.println(maxProfit(nums));
    }
}

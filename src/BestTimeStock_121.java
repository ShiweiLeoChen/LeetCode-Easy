import __HELPER_CLASSES__.StrIntArr;

public class BestTimeStock_121 {
    public static int maxProfit(int[] prices) {
        int max_profit = 0;
        int min_price_before = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_price_before) {
                min_price_before = prices[i];
            }
            else {
                max_profit = prices[i] - min_price_before > max_profit?
                        prices[i] - min_price_before: max_profit;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] arr = StrIntArr.strIntArr(args[0]);
        System.out.println("Maximum profit is: "+maxProfit(arr));
    }
}

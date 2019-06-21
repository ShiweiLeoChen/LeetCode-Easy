import __HELPER_CLASSES__.StrIntArr;

public class BestTimeStockII_122 {
    public static int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                ans += prices[i] - prices[i-1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = StrIntArr.strIntArr(args[0]);
        System.out.println("The maximum profit is: "+maxProfit(arr));
    }
}

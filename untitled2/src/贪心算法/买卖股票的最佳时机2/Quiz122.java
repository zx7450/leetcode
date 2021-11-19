package 贪心算法.买卖股票的最佳时机2;

/**
 * @author zx
 * @date 2021/11/04 10:23
 */
public class Quiz122 {
    public int maxProfit(int[] prices) {
        if (prices.length==1)
            return 0;
        int maxProfit=0;
        for (int i = 1; i < prices.length; i++) {
//            if (prices[i]<prices[i-1]){
//                continue;
//            } else {
//                maxProfit+=prices[i]-prices[i-1];
//            }
            maxProfit+=Math.max(prices[i]-prices[i-1],0);
        }
        return maxProfit;
    }
}

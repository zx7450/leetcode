package 贪心算法.买卖股票的最佳时机含手续费;

/**
 * @author zx
 * @date 2021/11/09 10:02
 */
public class Quiz714 {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int buy = prices[0] + fee;
        int profit = 0;
        for (int i = 1; i < n; ++i) {
            if (prices[i] + fee < buy) {//如果当前的股票价格prices[i]加上手续费fee小于buy，那么与其使用buy的价格购买股票，我们不如以prices[i]+fee的价格购买股票，因此我们将buy更新为prices[i]+fee；
                buy = prices[i] + fee;
            } else if (prices[i] > buy) {//如果当前的股票价格prices[i]大于buy，那么我们直接卖出股票并且获得prices[i]−buy的收益。但实际上，我们此时卖出股票可能并不是全局最优的（例如下一天股票价格继续上升），因此我们可以提供一个反悔操作，看成当前手上拥有一支买入价格为prices[i]的股票，将buy 更新为prices[i]。这样一来，如果下一天股票价格继续上升，我们会获得prices[i+1]−prices[i]的收益，加上这一天prices[i]−buy的收益，恰好就等于在这一天不进行任何操作，而在下一天卖出股票的收益；
                profit += prices[i] - buy;
                buy = prices[i];
            }
            //对于其余的情况，prices[i] 落在区间 [buy−fee,buy] 内，它的价格没有低到我们放弃手上的股票去选择它，也没有高到我们可以通过卖出获得收益，因此我们不进行任何操作。
        }
        return profit;
    }
}

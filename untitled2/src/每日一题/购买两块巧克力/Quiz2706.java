package 每日一题.购买两块巧克力;

import java.util.Arrays;

/**
 * @author zx
 * @date 2023/12/29 11:01
 */
public class Quiz2706 {
    public int buyChoco(int[] prices, int money) {
        if (prices.length == 2) {
            int ans = money - prices[0] - prices[1];
            return ans >= 0 ? ans : money;
        }
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min1) {
                min2 = min1;
                min1 = price;
            } else if (price < min2)
                min2 = price;
        }
        return money < min1 + min2 ? money : money - min1 - min2;
    }
}

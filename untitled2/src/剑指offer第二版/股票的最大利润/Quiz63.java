package 剑指offer第二版.股票的最大利润;

/**
 * @author zx
 * @date 2022/3/11 10:05
 */
public class Quiz63 {
    public int maxProfit(int[] prices) {//dp（也包含贪心思想）
        int days=prices.length;
        if (days<2)
            return 0;
        int low=Integer.MAX_VALUE;
        int res=0;
        for (int i = 0; i < days; i++) {
            low=prices[i]<low?prices[i]:low;//表示第i天前（含第i天）股票的最低售价
            res=prices[i]-low>res?prices[i]-low:res;
        }
        return res;
    }

}

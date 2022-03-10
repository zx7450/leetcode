package 剑指offer第二版.n个骰子的点数;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zx
 * @date 2022/3/10 9:23
 */
public class Quiz60 {
    public double[] dicesProbability(int n) {
        double[] dp=new double[6];
        Arrays.fill(dp,1.0/6.0);//一个骰子的情况
        for (int i = 2; i <= n; i++) {
            double[] temp=new double[5*i+1];
            for (int j = 0; j < dp.length; j++) {//处理所有可能情况
                for (int k = 0; k < 6; k++) {
                    temp[j+k]+=dp[j]/6.0;
                }
            }
            dp=temp;
        }
        return dp;
    }
}

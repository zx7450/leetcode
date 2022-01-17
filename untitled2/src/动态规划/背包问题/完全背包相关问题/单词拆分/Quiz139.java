package 动态规划.背包问题.完全背包相关问题.单词拆分;

import java.util.List;

public class Quiz139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (wordDict.contains(s.substring(j,i))&&dp[j]==true) {
                    dp[i]=true;
                }
            }
        }
        return dp[s.length()];
    }
}

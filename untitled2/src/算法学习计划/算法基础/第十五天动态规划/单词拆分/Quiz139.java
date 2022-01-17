package 算法学习计划.算法基础.第十五天动态规划.单词拆分;

import java.util.List;

/**
 * @author zx
 * @date 2022/1/17 22:38
 */
public class Quiz139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int slen=s.length();
        boolean[] dp=new boolean[slen+1];
        dp[0]=true;
        for (int i = 1; i <= slen; i++) {
            for (int j = 0; j < i; j++) {
                if (wordDict.contains(s.substring(j,i))&&dp[j])
                    dp[i]=true;
            }
        }
        return dp[slen];
    }
}

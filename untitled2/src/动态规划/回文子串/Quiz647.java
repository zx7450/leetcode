package 动态规划.回文子串;

/**
 * @author zx
 * @date 2021/11/25 9:35
 */
public class Quiz647 {
    public int countSubstrings(String s) {
        int slen = s.length();
        if (slen == 1)
            return 1;
        else if (slen == 2)
            if (s.charAt(0) == s.charAt(1))
                return 3;
            else return 2;
        boolean[][] dp = new boolean[slen][slen];
        int ans = 0;
        for (int i = slen - 1; i >= 0; i--)
            for (int j = i; j < slen; j++) {
                if (s.charAt(i) == s.charAt(j))
                    if (j - i <= 1) {
                        dp[i][j] = true;
                        ans++;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                        if (dp[i][j] == true)
                            ans++;
                    }
            }
        return ans;
    }
}

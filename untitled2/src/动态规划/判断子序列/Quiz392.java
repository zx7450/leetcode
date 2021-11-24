package 动态规划.判断子序列;

/**
 * @author zx
 * @date 2021/11/24 9:12
 */
public class Quiz392 {
//    public boolean isSubsequence(String s, String t) {//双指针法
//        int slen=s.length();
//        int tlen=t.length();
//        if (slen==0)
//            return true;
//        if (slen>tlen)
//            return false;
//        int j=0;
//        for (int i = 0; i < tlen; i++) {
//            if (s.charAt(j)==t.charAt(i)) {
//                j++;
//                if (j == slen)
//                    return true;
//            }
//        }
//        return false;
//    }
    public boolean isSubsequence(String s, String t) {//dp
        int slen=s.length();
        int tlen=t.length();
        if (slen==0)
            return true;
        if (slen>tlen)
            return false;
        int[][] dp=new int[slen+1][tlen+1];
        for (int i = 1; i <= slen; i++) {
            for (int j = 1; j <= tlen; j++) {
                if (s.charAt(i-1)==t.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=dp[i][j-1];
            }
        }
        return dp[slen][tlen]==slen;
    }
}

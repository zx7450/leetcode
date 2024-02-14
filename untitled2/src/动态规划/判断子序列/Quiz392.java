package 动态规划.判断子序列;

/**
 * @author zx
 * @date 2021/11/24 9:12
 */
public class Quiz392 {
    //    public boolean isSubsequence(String s, String t) {//双指针法
//        int slen = s.length();
//        int tlen = t.length();
//        if (slen == tlen)
//            return s.equals(t);
//        else if (slen > tlen)
//            return false;
//        int sflag = 0, tflag = 0;
//        while (sflag < slen && tflag < tlen) {
//            while (tflag < tlen && s.charAt(sflag) != t.charAt(tflag))
//                tflag++;
//            if (tflag == tlen)
//                return false;
//            sflag++;
//            tflag++;
//        }
//        return sflag == slen;
//    }
    public boolean isSubsequence(String s, String t) {//dp
        int slen = s.length();
        int tlen = t.length();
        if (slen == 0)
            return true;
        if (slen == tlen)
            return s.equals(t);
        else if (slen > tlen)
            return false;
        int[][] dp = new int[slen][tlen];
        for (int i = 0; i < slen; i++) {
            for (int j = 0; j < tlen; j++) {
                if (s.charAt(i) == t.charAt(j))
                    dp[i][j] = (i == 0 || j == 0) ? 1 : dp[i - 1][j - 1] + 1;
                else if (j > 0)
                    dp[i][j] = dp[i][j - 1];
            }
        }
        return dp[slen - 1][tlen - 1] == slen;
    }
}

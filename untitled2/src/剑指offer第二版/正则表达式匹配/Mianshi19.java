package 剑指offer第二版.正则表达式匹配;

/**
 * @author zx
 * @date 2022/3/15 9:36
 */
public class Mianshi19 {
    public boolean isMatch(String s, String p) {
        int slen=s.length()+1,plen=p.length()+1;
        if (slen==0&&plen==0)
            return true;
        else if (plen==0)
            return false;
        boolean[][] dp=new boolean[slen][plen];
        dp[0][0]=true;
        for (int i = 2; i < plen; i++) {
            dp[0][i]=dp[0][i-2]&&p.charAt(i-1)=='*';
        }
        for (int i = 1; i < slen; i++) {
            for (int j = 1; j < plen; j++) {
                dp[i][j]=p.charAt(j-1)=='*'?
                        dp[i][j-2]||dp[i-1][j]&&(s.charAt(i-1)==p.charAt(j-2)||p.charAt(j-2)=='.'):
                        dp[i-1][j-1]&&(p.charAt(j-1)=='.'||s.charAt(i-1)==p.charAt(j-1));
            }
        }
        return dp[slen-1][plen-1];
    }
}

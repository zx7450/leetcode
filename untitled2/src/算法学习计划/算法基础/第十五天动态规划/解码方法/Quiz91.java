package 算法学习计划.算法基础.第十五天动态规划.解码方法;

/**
 * @author zx
 * @date 2022/1/17 21:00
 */
public class Quiz91 {
    public int numDecodings(String s) {
        int slen=s.length();
        if (s.charAt(0)=='0')//首个数字为0，不符合要求，直接返回0
            return 0;
        else if (slen==1)
            return 1;
        int[] dp=new int[slen+1];
        dp[0]=1;//下标为0代表空字符串的情况
        for (int i = 1; i < slen + 1; i++) {
            if (s.charAt(i-1)!='0')//dp的i为下标加一
                dp[i]+=dp[i-1];
            if (i>1&&s.charAt(i-2)!='0'&&((s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0')<=26))
                dp[i]+=dp[i-2];
        }
        return dp[slen];
    }
}

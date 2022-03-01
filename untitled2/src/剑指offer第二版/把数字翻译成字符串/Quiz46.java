package 剑指offer第二版.把数字翻译成字符串;

/**
 * @author zx
 * @date 2022/3/1 9:33
 */
public class Quiz46 {
    public int translateNum(int num) {
        if (num<10)
            return 1;
        else if (num<=25)
            return 2;
        else if (num<=99)
            return 1;
        String stringOfnum=String.valueOf(num);
        int numlen=stringOfnum.length();
        int[] dp=new int[numlen+1];
        dp[0]=1;
        for (int i = 1; i < numlen + 1; i++) {
            dp[i]+=dp[i-1];
            if (i>1&&stringOfnum.charAt(i-2)!='0'&&((stringOfnum.charAt(i-2)-'0')*10+(stringOfnum.charAt(i-1)-'0')<=25))
                dp[i]+=dp[i-2];
        }
        return dp[numlen];
    }
}

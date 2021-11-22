package 动态规划.最长重复子数组;

/**
 * @author zx
 * @date 2021/11/22 9:32
 */
public class Quiz718 {
    public int findLength(int[] nums1, int[] nums2) {
        int num1len=nums1.length;
        int num2len=nums2.length;
        if (num1len==1&&num2len==1)
            if (nums1[0]==nums2[0])
                return 1;
            else return 0;
        int[] dp=new int[num2len+1];
        int res=0;
        for (int i = 1; i <= num1len; i++) {
            for (int j = num2len; j > 0; j--) {
                if (nums1[i-1]==nums2[j-1])
                    dp[j]=dp[j-1]+1;
                else
                    dp[j]=0;
                res=Math.max(res,dp[j]);
            }
        }
        return res;
    }
}

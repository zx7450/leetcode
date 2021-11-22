package 动态规划.最长连续递增子序列;

/**
 * @author zx
 * @date 2021/11/22 9:16
 */
public class Quiz674 {
    public int findLengthOfLCIS(int[] nums) {
        int numlen=nums.length;
        if (numlen==1)
            return 1;
        else if (numlen==2)
            if (nums[0]>=nums[1])
                return 1;
            else
                return 2;
        int res=1;
        int ans=0;
        for (int i = 1; i < numlen; i++) {
            if (nums[i]>nums[i-1]) {
                res++;
                if (i == numlen - 1 && res > ans)
                    ans = res;
            }
            else {
                if (res>ans)
                    ans=res;
                res=1;
            }
        }
        return ans;
    }
}

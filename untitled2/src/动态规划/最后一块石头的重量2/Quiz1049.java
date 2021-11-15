package 动态规划.最后一块石头的重量2;

public class Quiz1049 {
    public int lastStoneWeightII(int[] stones) {
        int stonesnum=stones.length;
        int allsum=0;
        for (int i = 0; i < stonesnum; i++) {
            allsum+=stones[i];
        }
        int target=allsum/2;
        int[] dp=new int[target+1];
        for (int i = 0; i < stonesnum; i++) {
            for (int j=target;j>=stones[i];j--){
                dp[j]=Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return allsum-2*dp[target];
    }
}

package 算法学习计划.算法基础.第十三天动态规划.跳跃游戏2;

/**
 * @author zx
 * @date 2022/1/13 0:36
 */
public class Quiz45 {
    public int jump(int[] nums) {
        int curdistance=0;//当前最大覆盖距离
        int nextdistance=0;//下一步最大覆盖距离
        int ans=0;
        int numlen=nums.length;
        for (int i = 0; i <= numlen - 2; i++) {//只需判断倒数第二个位置，若此时覆盖范围已经大于该位置，则无需增加步数，否则加一
            nextdistance=Math.max(i+nums[i],nextdistance);//计算下一步能跳到的最大距离
            if (i==curdistance) {//表示已经达到当前一步能达到的最大距离，步数应该加一，并用下一次最大距离更新本次最大距离
                ans++;
                curdistance = nextdistance;
            }
        }
        return ans;
    }
}

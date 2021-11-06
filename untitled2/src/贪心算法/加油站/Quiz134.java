package 贪心算法.加油站;

/**
 * @author zx
 * @date 2021/11/06 10:16
 */
public class Quiz134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int cursum=0,totalsum=0;
        int start=0;
        for (int i = 0; i < gas.length; i++) {
            cursum+=gas[i]-cost[i];
            totalsum+=gas[i]-cost[i];
            if (cursum<0) {//若cursum小于0，则[start,i]位置均无法走完全程，应从i+1位置开始重新计算
                start=i+1;
                cursum=0;
            }
        }
        if (totalsum<0) return -1;//总油量小于总耗油量，无法走完全程
        return start;
    }
}

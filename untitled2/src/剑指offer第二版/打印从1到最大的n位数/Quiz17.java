package 剑指offer第二版.打印从1到最大的n位数;

/**
 * @author zx
 * @date 2022/2/4 22:54
 */
public class Quiz17 {
    public int[] printNumbers(int n) {
        int maxnum=(int) Math.pow(10,n)-1;
        int[] ans=new int[maxnum];
        for (int i = 0; i <= maxnum-1; i++) {
            ans[i]=i+1;
        }
        return ans;
    }
}

package 剑指offer第二版.二进制中1的个数;

/**
 * @author zx
 * @date 2022/2/4 22:21
 */
public class Quiz15 {
    public int hammingWeight(int n) {//思路：每部循环将n与n-1进行与运算（结果为将n的最低位置为0的效果），循环至n=0即可
        int ans=0;
        while (n!=0) {
            n&=n-1;
            ans++;
        }
        return ans;
    }
}

package 剑指offer第二版.剪绳子2;

/**
 * @author zx
 * @date 2022/2/1 23:26
 */
public class Quiz14_2 {
    public int cuttingRope(int n) {//贪心思路：根据均值不等式及求导推导，尽可能把绳子分成长度为3的小段，这样乘积最大
        if (n<4)
            return n-1;
        long res=1;
        while (n>4) {
            res=res*3%1000000007;
            n-=3;
        }
        return (int) (res*n%1000000007);
    }
}

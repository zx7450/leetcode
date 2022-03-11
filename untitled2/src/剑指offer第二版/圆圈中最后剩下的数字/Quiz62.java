package 剑指offer第二版.圆圈中最后剩下的数字;

/**
 * @author zx
 * @date 2022/3/11 9:29
 */
public class Quiz62 {
    public int lastRemaining(int n, int m) {
        return f(n,m);
    }

    public int f(int n,int m) {
        if (n==1)
            return 0;
        int x=f(n-1,m);
        return (x+m)%n;
    }
}

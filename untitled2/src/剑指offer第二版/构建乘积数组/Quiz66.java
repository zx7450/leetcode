package 剑指offer第二版.构建乘积数组;

/**
 * @author zx
 * @date 2022/3/14 9:46
 */
public class Quiz66 {
    public int[] constructArr(int[] a) {
        int len=a.length;
        if (len==0)
            return new int[0];
        int[] b=new int[len];
        b[0]=1;
        for (int i = 1; i < len; i++) {
            b[i]=b[i-1]*a[i-1];
        }
        int tmp=1;
        for (int i = len-2; i >= 0; i--) {
            tmp*=a[i+1];
            b[i]*=tmp;
        }
        return b;
    }
}

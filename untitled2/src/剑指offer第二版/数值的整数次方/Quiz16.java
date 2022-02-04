package 剑指offer第二版.数值的整数次方;

/**
 * @author zx
 * @date 2022/2/4 22:27
 */
public class Quiz16 {
    public double myPow(double x, int n) {//思路，将n由十进制转换为二进制，n=1b_1+2b_2+...+2^(m-1)b_m，则x^n=x^b_1+x^2(b_2)+...+x^(2^(m-1)b_m)
        if (x==0)
            return 0;
        else if (n==0)
            return 1;
        double ans=1.0;
        long b=n;
        if (b<0) {
            x=1/x;
            b=-b;
        }
        while (b>0) {
            if ((b&1)==1) ans*=x;
            x*=x;
            b>>=1;
        }
        return ans;
    }
}

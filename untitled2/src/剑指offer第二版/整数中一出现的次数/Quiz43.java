package 剑指offer第二版.整数中一出现的次数;

/**
 * @author zx
 * @date 2022/2/28 9:15
 */
public class Quiz43 {
    public int countDigitOne(int n) {
        long k=1;
        int ans=0;
        while (n>=k) {
            ans+=(n/(10*k))*k+Math.min(Math.max(n%(10*k)-k+1,0),k);
            k*=10;
        }
        return ans;
    }
}

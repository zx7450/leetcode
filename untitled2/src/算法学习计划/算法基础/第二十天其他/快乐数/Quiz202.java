package 算法学习计划.算法基础.第二十天其他.快乐数;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zx
 * @date 2022/1/31 22:37
 */
public class Quiz202 {
    public boolean isHappy(int n) {
        if (n==1)
            return true;
        else if (n==2)
            return false;
        Set<Integer> isOccur=new HashSet<>();
        while (isOccur.contains(n)==false) {
            isOccur.add(n);
            n=change(n);
            if (n==1)
                return true;
        }
        return false;
    }

    public int change(int n) {
        int sum=0;
        int now=0;
        while (n!=0) {
            now=n%10;
            sum+=now*now;
            n/=10;
        }
        return sum;
    }
}

package 哈希表.快乐数;

import java.util.HashSet;
import java.util.Set;

public class Quiz202 {
    public boolean isHappy(int n) {
        if (n==1)
            return true;
        Set<Integer> happyset=new HashSet<Integer>();
        while (happyset.contains(n)==false){
            happyset.add(n);
            n=getres(n);
            if (n==1)
                return true;
        }
        return false;
    }
    public int getres(int num){
        int sum=0;
        int now=0;
        while (num!=0){
            now=num%10;
            sum+=now*now;
            num/=10;
        }
        return sum;
    }
}

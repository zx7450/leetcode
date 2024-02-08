package 哈希表.快乐数;

import java.util.HashSet;
import java.util.Set;

public class Quiz202 {
    public boolean isHappy(int n) {
        if (n == 1)
            return true;
        else if (n == 2 || n == 4)
            return false;
        Set<Integer> occ = new HashSet<>();
        while (!occ.contains(n)) {
            occ.add(n);
            n = cal(n);
            if (n == 1)
                return true;
        }
        return false;
    }

    public int cal(int n) {
        int sum = 0;
        while (n > 0) {
            int cur = n % 10;
            sum += cur * cur;
            n /= 10;
        }
        return sum;
    }
}

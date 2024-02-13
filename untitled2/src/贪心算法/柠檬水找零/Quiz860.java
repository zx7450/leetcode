package 贪心算法.柠檬水找零;

/**
 * @author zx
 * @date 2021/11/06 14:49
 */
public class Quiz860 {
    public boolean lemonadeChange(int[] bills) {
        if (bills[0] != 5)
            return false;
        int n = bills.length;
        if (n == 1)
            return true;
        int[] changes = new int[2];
        changes[0] = 1;
        for (int i = 1; i < n; i++) {
            if (bills[i] == 5)
                changes[0]++;
            else if (bills[i] == 10) {
                if (changes[0] == 0)
                    return false;
                changes[0]--;
                changes[1]++;
            } else {
                if (changes[1] > 0 && changes[0] > 0) {
                    changes[1]--;
                    changes[0]--;
                } else if (changes[0] > 2) {
                    changes[0] -= 3;
                } else
                    return false;
            }
        }
        return true;
    }
}

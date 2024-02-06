package 数组.有效的完全平方数;

/**
 * @author zx
 * @date 2024/1/31 8:51
 */
public class Quiz367 {
    public boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;
        int l = 0, r = num;
        while (l <= r) {
            int mid = (r-l) >> 1+l;
            long res =(long) mid * mid;
            if (res == num)
                return true;
            else if (res < num)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return false;
    }
}

package 数组.x的平方根;

/**
 * @author zx
 * @date 2024/1/31 8:41
 */
public class Quiz69 {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        int l = 0, r = x;
        int ans = 0;
        while (l <= r) {
            int mid = (l + r) >> 1;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else
                r = mid - 1;
        }
        return ans;
    }
}

package 随意练习.到最近的人的最大距离;

/**
 * @author zx
 * @date 2024/1/9 8:53
 */
public class Quiz849 {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        if (n == 2) return 1;
        int l = 0, r = 1, ans = 0;
        while (r < n) {
            while (r < n && seats[r] == 0) r++;
            if (seats[l] == 0) {
                if (r == n) ans = Math.max(ans, r - l - 1);
                else ans = Math.max(ans, r - l);
            } else {
                if (r == n) ans = Math.max(ans, r - l - 1);
                else ans = Math.max(ans, (r - l) / 2);
            }
            l = r;
            r++;
        }
        return ans;
    }
}

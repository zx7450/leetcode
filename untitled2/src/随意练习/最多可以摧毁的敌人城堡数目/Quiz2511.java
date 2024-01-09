package 随意练习.最多可以摧毁的敌人城堡数目;

/**
 * @author zx
 * @date 2024/1/9 9:14
 */
public class Quiz2511 {
    public int captureForts(int[] forts) {
        int n = forts.length;
        if (n == 1) return 0;
        int currpos = 0, myfort = -1, dest = -1, ans = 0;
        while (currpos < n) {
            if (forts[currpos] == -1) {
                if (myfort >= 0 && dest < myfort) {
                    ans = Math.max(ans, currpos - myfort - 1);
                }
                dest = currpos;
            } else if (forts[currpos] == 1) {
                if (dest >= 0 && myfort < dest) {
                    ans = Math.max(ans, currpos - dest - 1);
                }
                myfort = currpos;
            }
            currpos++;
        }
        return ans;
    }
}

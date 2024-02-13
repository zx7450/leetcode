package 回溯算法.复原IP地址;

import java.util.ArrayList;
import java.util.List;

public class Quiz93 {
    List<String> ans;

    public List<String> restoreIpAddresses(String s) {
        ans = new ArrayList<>();
        if (s.length() > 12)
            return ans;
        turnToIP(s, 0, 0);
        return ans;
    }

    public void turnToIP(String s, int flag, int segnum) {
        if (flag == s.length())
            return;
        if (segnum == 3) {
            if (check(s, flag, s.length() - 1)) {
                ans.add(s);
            }
            return;
        }
        for (int i = flag; i < s.length() && i - flag + 1 <= 3; i++) {
            if (check(s, flag, i)) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                turnToIP(s, i + 2, segnum + 1);
                s = s.substring(0, i + 1) + s.substring(i + 2);
            }
        }
    }

    public boolean check(String s, int l, int r) {
        if (l == r)
            return true;
        else if (s.charAt(l) == '0')
            return false;
        int i = Integer.parseInt(s.substring(l, r + 1));
        return i <= 255;
    }
}

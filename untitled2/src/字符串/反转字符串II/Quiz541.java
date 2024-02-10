package 字符串.反转字符串II;

import java.util.Arrays;

/**
 * @author zx
 * @date 2024/2/10 21:42
 */
public class Quiz541 {
    public String reverseStr(String s, int k) {
        int l = 0, r = 0, n = s.length();
        char[] charofs = s.toCharArray();
        while (l < n) {
            r = l + k - 1;
            reverse(charofs, l, Math.min(r, n - 1));
            l += 2 * k;
        }
        return new String(charofs);
    }

    public void reverse(char[] charofs, int l, int r) {
        while (l < r) {
            char tmp = charofs[l];
            charofs[l++] = charofs[r];
            charofs[r--] = tmp;
        }
    }
}

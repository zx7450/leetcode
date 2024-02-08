package 双指针.反转字符串;

/**
 * @author zx
 * @date 2024/2/8 22:43
 */
public class Quiz344 {
    public void reverseString(char[] s) {
        int r = s.length;
        if (r == 1)
            return;
        int l = 0;
        r--;
        while (l < r) {
            char tmp = s[r];
            s[r--] = s[l];
            s[l++] = tmp;
        }
    }
}

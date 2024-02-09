package 双指针.反转字符串中的单词;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author zx
 * @date 2024/2/9 17:35
 */
public class Quiz151 {
    public String reverseWords(String s) {
        int l = 0, r = s.length() - 1;
        while (s.charAt(l) == ' ')
            l++;
        while (s.charAt(r) == ' ')
            r--;
        StringBuilder sb = new StringBuilder();
        while (l <= r) {
            char c = s.charAt(l++);
            if (c == ' ') {
                if (sb.charAt(sb.length() - 1) == ' ')
                    continue;
            }
            sb.append(c);
        }
        reverseString(sb, 0, sb.length() - 1);
        reverseEachwords(sb);
        return sb.toString();
    }

    public void reverseString(StringBuilder sb, int l, int r) {
        while (l <= r) {
            char c = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, c);
            l++;
            r--;
        }
    }

    public void reverseEachwords(StringBuilder sb) {
        int l = 0, r = 1, n = sb.length();
        while (l < n) {
            while (r < n && sb.charAt(r) != ' ')
                r++;
            reverseString(sb, l, r - 1);
            l = r + 1;
            r = l + 1;
        }
    }
}

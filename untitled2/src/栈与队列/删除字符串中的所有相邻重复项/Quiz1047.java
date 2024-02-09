package 栈与队列.删除字符串中的所有相邻重复项;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Quiz1047 {
    public String removeDuplicates(String s) {
        int n = s.length();
        if (n == 1)
            return s;
        else if (n == 2) {
            return s.charAt(0) == s.charAt(1) ? "" : s;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (ans.length() != 0) {
                if (ans.charAt(ans.length() - 1) == c) {
                    ans.deleteCharAt(ans.length() - 1);
                    continue;
                }
            }
            ans.append(c);
        }
        return ans.toString();
    }
}

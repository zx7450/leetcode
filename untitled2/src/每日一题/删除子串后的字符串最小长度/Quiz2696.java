package 每日一题.删除子串后的字符串最小长度;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author zx
 * @date 2024/1/10 10:39
 */
public class Quiz2696 {
    public static int minLength(String s) {
        //法1：直接调用方法模拟模拟
//        while (s.contains("AB") || s.contains("CD")) {
//            if (s.equals("AB") || s.equals("CD")) return 0;
//            String[] subs;
//            if (s.contains("AB")) subs = s.split("AB");
//            else subs = s.split("CD");
//            if (subs.length == 0) return 0;
//            s = subs[0];
//            if (subs.length == 1) continue;
//            for (int i = 1; i < subs.length; i++) {
//                s += subs[i];
//            }
//        }
//        return s.length();

        //法2栈
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B' || s.charAt(i) == 'D') {
                if (s.charAt(i) == 'B') {
                    if (stack.isEmpty() || stack.peek() != 'A') stack.addFirst('B');
                    else stack.poll();
                } else {
                    if (stack.isEmpty() || stack.peek() != 'C') stack.addFirst('D');
                    else stack.poll();
                }
            } else stack.addFirst(s.charAt(i));
        }
        return stack.size();
    }

    public static void main(String[] args) {
        System.out.println(minLength("CABDCABDAB"));
    }
}

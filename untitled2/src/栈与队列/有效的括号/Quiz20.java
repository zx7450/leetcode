package 栈与队列.有效的括号;


import java.util.ArrayDeque;
import java.util.Deque;

public class Quiz20 {
    public boolean isValid(String s) {
        int n = s.length();
        if (n == 1)
            return false;
        Deque<Character> sdeque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            switch (s.charAt(i)) {
                case ')':
                    if (sdeque.isEmpty() || !sdeque.peekLast().equals('('))
                        return false;
                    sdeque.pollLast();
                    break;
                case ']':
                    if (sdeque.isEmpty() || !sdeque.peekLast().equals('['))
                        return false;
                    sdeque.pollLast();
                    break;
                case '}':
                    if (sdeque.isEmpty() || !sdeque.peekLast().equals('{'))
                        return false;
                    sdeque.pollLast();
                    break;
                default:
                    sdeque.addLast(s.charAt(i));
                    break;
            }
        }
        return sdeque.isEmpty();
    }
}

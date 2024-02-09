package 栈与队列.逆波兰表达式求值;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Quiz150 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> ans = new ArrayDeque<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                    int num1 = ans.pollLast();
                    int num2 = ans.pollLast();
                    ans.addLast(num2 + num1);
                    break;
                case "-":
                    num1 = ans.pollLast();
                    num2 = ans.pollLast();
                    ans.addLast(num2 - num1);
                    break;
                case "*":
                    num1 = ans.pollLast();
                    num2 = ans.pollLast();
                    ans.addLast(num1 * num2);
                    break;
                case "/":
                    num1 = ans.pollLast();
                    num2 = ans.pollLast();
                    ans.addLast(num2 / num1);
                    break;
                default:
                    ans.addLast(Integer.valueOf(token));
                    break;
            }
        }
        return ans.peek();
    }
}

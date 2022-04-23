package 程序员面试金典.栈的最小值;

import java.util.Stack;

/**
 * @author zx
 * @date 2022/4/12 8:56
 */
public class MinStack {//Quiz03_02

    Stack<Integer> numstack;
    Stack<Integer> minstack;

    public MinStack() {
        numstack = new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int x) {
        numstack.push(x);
        if (minstack.isEmpty() || minstack.peek() >= x)
            minstack.push(x);
    }

    public void pop() {
        if (minstack.peek().equals(numstack.pop()))
            minstack.pop();
    }

    public int top() {
        return numstack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}

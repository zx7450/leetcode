package 剑指offer第二版.包含min函数的栈;

import java.util.Stack;

/**
 * @author zx
 * @date 2022/2/10 16:23
 */
public class MinStack {//Quiz30
    Stack<Integer> stack,minstack;//一个为正常栈一个为辅助栈，只存放栈内最小的几个元素
    public MinStack() {
        stack=new Stack<>();
        minstack=new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minstack.isEmpty()||x<=minstack.peek())
            minstack.push(x);
        return;
    }

    public void pop() {
        if (minstack.peek().equals(stack.pop()))
            minstack.pop();
        return;
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minstack.peek();
    }
}

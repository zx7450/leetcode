package 栈与队列.用栈实现队列;

import java.util.Stack;

public class MyQueue {//第232题
    Stack<Integer> instack;
    Stack<Integer> outstack;

    public MyQueue() {
        instack = new Stack<>();
        outstack = new Stack<>();
    }

    public void push(int x) {
        instack.push(x);
    }

    public int pop() {
        if (outstack.empty()) {
            while (!instack.empty())
                outstack.push(instack.pop());
        }
        return outstack.pop();
    }

    public int peek() {
        if (outstack.empty()) {
            while (!instack.empty())
                outstack.push(instack.pop());
        }
        return outstack.peek();
    }

    public boolean empty() {
        return instack.empty() && outstack.empty();
    }
}

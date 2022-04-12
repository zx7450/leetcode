package 程序员面试金典.化栈为队;

import java.util.Stack;

/**
 * @author zx
 * @date 2022/4/12 9:39
 */
public class MyQueue {
    Stack<Integer> inqueue;
    Stack<Integer> outqueue;
    /** Initialize your data structure here. */
    public MyQueue() {
        inqueue=new Stack<>();
        outqueue=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inqueue.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (outqueue.isEmpty())
            transfer();
        return outqueue.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (outqueue.isEmpty())
            transfer();
        return outqueue.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inqueue.isEmpty()&&outqueue.isEmpty();
    }

    public void transfer() {
        while (!inqueue.isEmpty()) {
            outqueue.push(inqueue.pop());
        }
    }
}

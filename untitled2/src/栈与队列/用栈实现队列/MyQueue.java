package 栈与队列.用栈实现队列;

import java.util.Stack;

public class MyQueue {//第232题
    Stack<Integer> simDeque;
    Stack<Integer> temp;
    public MyQueue() {
        simDeque=new Stack<Integer>();
        temp=new Stack<Integer>();
    }

    public void push(int x) {
        simDeque.push(x);
    }

    public int pop() {
        while (simDeque.empty()==false)
            temp.push(simDeque.pop());
        int ans= temp.pop();
        while (temp.empty()==false)
            simDeque.push(temp.pop());
        return ans;
    }

    public int peek() {
        while (simDeque.empty()==false)
            temp.push(simDeque.pop());
        int ans=temp.peek();
        while (temp.empty()==false)
            simDeque.push(temp.pop());
        return ans;
    }

    public boolean empty() {
        return simDeque.empty();
    }
}

package 栈与队列.用队列实现栈;

import java.util.LinkedList;
import java.util.Queue;

//public class MyStack {//两个队列
//    Queue<Integer> simStack;
//    Queue<Integer> temp;
//    public MyStack() {
//        simStack=new LinkedList<Integer>();
//        temp=new LinkedList<Integer>();
//    }
//
//    public void push(int x) {
//        simStack.add(x);
//    }
//
//    public int pop() {
//        int n=simStack.size();
//        for (int i = 0; i < n-1; i++)
//            temp.add(simStack.poll());
//        int ans=simStack.poll();
//        n=temp.size();
//        for (int i = 0; i < n; i++)
//            simStack.add(temp.poll());
//        return ans;
//    }
//
//    public int top() {
//        int n=simStack.size();
//        for (int i = 0; i < n-1; i++)
//            temp.add(simStack.poll());
//        int ans=simStack.peek();
//        temp.add(simStack.poll());
//        n=temp.size();
//        for (int i = 0; i < n; i++)
//            simStack.add(temp.poll());
//        return ans;
//    }
//
//    public boolean empty() {
//        if (simStack.isEmpty()==true)
//            return true;
//        return false;
//    }
//}
public class MyStack {//一个队列
    Queue<Integer> stackque;

    public MyStack() {
        stackque = new LinkedList<>();
    }

    public void push(int x) {
        stackque.add(x);
    }

    public int pop() {
        int n = stackque.size();
        for (int i = 0; i < n - 1; i++) {
            stackque.add(stackque.poll());
        }
        return stackque.poll();
    }

    public int top() {
        int n = stackque.size();
        for (int i = 0; i < n - 1; i++) {
            stackque.add(stackque.poll());
        }
        int i = stackque.poll();
        stackque.add(i);
        return i;
    }

    public boolean empty() {
        return stackque.isEmpty();
    }
}

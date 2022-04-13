package 程序员面试金典.栈排序;

import java.util.Stack;

/**
 * @author zx
 * @date 2022/4/13 9:08
 */
public class SortedStack {//Quiz03.05
    Stack<Integer> sortstack;
    Stack<Integer> temp;
    public SortedStack() {
        sortstack=new Stack<>();
        temp=new Stack<>();
    }

    public void push(int val) {
        while (!sortstack.isEmpty()&&sortstack.peek()<val) {
            temp.push(sortstack.pop());
        }
        sortstack.push(val);
        while (!temp.isEmpty()) {
            sortstack.push(temp.pop());
        }
    }

    public void pop() {
        if (!sortstack.isEmpty())
            sortstack.pop();
    }

    public int peek() {
        if (sortstack.isEmpty())
            return -1;
        return sortstack.peek();
    }

    public boolean isEmpty() {
        return sortstack.isEmpty();
    }
}
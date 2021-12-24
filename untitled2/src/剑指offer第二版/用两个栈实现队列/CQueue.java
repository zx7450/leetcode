package 剑指offer第二版.用两个栈实现队列;

import java.util.Stack;

/**
 * @author zx
 * @date 2021/12/24 15:44
 */
public class CQueue {//Quiz09
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

//    public int deleteHead() {
//        int queuesize=stack1.size();
//        if (queuesize==0)
//            return -1;
//        for (int i = 0; i < queuesize-1; i++) {
//            stack2.push(stack1.pop());
//        }
//        int deleteval=stack1.pop();
//        for (int i = 0; i < queuesize - 1; i++) {
//            stack1.push(stack2.pop());
//        }
//        return deleteval;
//    }

    public int deleteHead() {//官方解法：栈1只负责插入，栈2只负责删除，删除时若栈2为空则将栈1元素全部弹出至栈2，若此时栈2仍为空（说明栈1无元素），则返回-1
        if (stack2.size()!=0)
            return stack2.pop();
        else if (stack1.size()==0)
            return -1;
        else {
            int size=stack1.size();
            for (int i = 0; i < size - 1; i++) {
                stack2.push(stack1.pop());
            }
            return stack1.pop();
        }
    }
}

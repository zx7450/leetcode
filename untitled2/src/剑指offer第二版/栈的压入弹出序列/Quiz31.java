package 剑指offer第二版.栈的压入弹出序列;

import java.util.Stack;

/**
 * @author zx
 * @date 2022/2/22 9:18
 */
public class Quiz31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length==0)
            return true;
        int popflag=0;
        Stack<Integer> stack=new Stack<>();
        for (int num:pushed) {
            stack.push(num);
            while (!stack.isEmpty()&&stack.peek()==popped[popflag]) {
                stack.pop();
                popflag++;
            }
        }
        return stack.isEmpty();
    }
}

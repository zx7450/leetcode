package 栈与队列.逆波兰表达式求值;

import java.util.Stack;

public class Quiz150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<Integer>();
        for (String token :tokens) {
            if (token.equals("+")){//注意，num2才是第一个运算数
                int num1=stack.pop();
                int num2=stack.pop();
                stack.push(num2+num1);
            } else if (token.equals("-")){
                int num1=stack.pop();
                int num2=stack.pop();
                stack.push(num2-num1);
            } else if (token.equals("*")){
                int num1=stack.pop();
                int num2=stack.pop();
                stack.push(num2*num1);
            } else if (token.equals("/")){
                int num1=stack.pop();
                int num2=stack.pop();
                stack.push(num2/num1);
            } else
                stack.push(Integer.valueOf(token));
        }
        return stack.peek();
    }
}

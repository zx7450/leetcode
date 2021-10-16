package 栈与队列.有效的括号;

import java.util.Stack;

public class Quiz20 {
    public boolean isValid(String s) {
        int len=s.length();
        if (len==1)
            return false;
        Stack<Character> characterStack=new Stack<Character>();
        for (int i = 0; i < len; i++) {
            char ch=s.charAt(i);
            if (ch=='('||ch=='['||ch=='{')
                characterStack.push(ch);
            else if (ch==')')
                if (characterStack.size()==0||characterStack.peek()!='(')
                    return false;
                else
                    characterStack.pop();
            else if (ch==']')
                if (characterStack.size()==0||characterStack.peek()!='[')
                    return false;
                else
                    characterStack.pop();
            else
                if (characterStack.size()==0||characterStack.peek()!='{')
                    return false;
                else
                    characterStack.pop();
        }
        if (characterStack.size()==0)
            return true;
        return false;
    }
}

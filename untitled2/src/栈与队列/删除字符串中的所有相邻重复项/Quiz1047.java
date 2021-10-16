package 栈与队列.删除字符串中的所有相邻重复项;

import java.util.Stack;

public class Quiz1047 {
    public String removeDuplicates(String s) {
        int len=s.length();
        if (len==1)
            return s;
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch=s.charAt(i);
            int sblen=stringBuilder.length();
            if (sblen==0||stringBuilder.charAt(sblen-1)!=ch)
                stringBuilder.append(ch);
            else
                stringBuilder.deleteCharAt(sblen-1);
        }
        return stringBuilder.toString();
    }
}

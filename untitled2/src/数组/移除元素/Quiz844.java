package 数组.移除元素;

import java.util.Stack;

public class Quiz844 {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        int skips=0;
        int skipt=0;
        while (i>=0||j>=0){
            while (i>=0){//这个循环从后往前，寻找s中第一个需要比较的字符
                if (s.charAt(i)=='#'){
                    skips++;
                    i--;
                }
                else {
                    if (skips!=0){
                        skips--;
                        i--;
                    }
                    else break;
                }
            }
            while (j>=0){//同上，寻找t中第一个需要比较的字符
                if (t.charAt(j)=='#'){
                    skipt++;
                    j--;
                }
                else {
                    if (skipt!=0){
                        skipt--;
                        j--;
                    }
                    else break;
                }
            }
            if (i>=0&&j>=0){//仅当下标有意义时才进行比较
                if (s.charAt(i)!=t.charAt(j))//比较的字符不同，返回false
                    return false;
            }
            else {//有下标小于0，只有当同时小于0时才相等
                if (i>=0||j>=0)
                    return false;
            }
            i--;
            j--;
        }
        return true;
    }
}

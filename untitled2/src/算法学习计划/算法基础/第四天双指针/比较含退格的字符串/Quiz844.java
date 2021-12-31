package 算法学习计划.算法基础.第四天双指针.比较含退格的字符串;

import java.util.Stack;

/**
 * @author zx
 * @date 2021/12/30 10:43
 */
public class Quiz844 {
//    public boolean backspaceCompare(String s, String t) {
//        return recoverstring(s).equals(recoverstring(t));
//    }
//
//    public String recoverstring(String str) {
//        StringBuilder stringBuilder=new StringBuilder();
//        int strlen=str.length();
//        for (int i = 0; i < strlen; i++) {
//            char c=str.charAt(i);
//            if (c!='#')
//                stringBuilder.append(c);
//            else {
//                if (stringBuilder.length()>0)
//                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
//            }
//        }
//        return stringBuilder.toString();
//    }

    public boolean backspaceCompare(String s, String t) {//双指针，分别从s和t的末尾开始遍历
        int sflag=s.length()-1;
        int tflag=t.length()-1;
        int skips=0,skipt=0;
        while (sflag>=0||tflag>=0) {
            while (sflag>=0) {//找到s中第一个需要比较的字符
                if (s.charAt(sflag)=='#') {
                    skips++;
                    sflag--;
                } else {
                    if (skips!=0) {
                        skips--;
                        sflag--;
                    } else break;
                }
            }
            while (tflag>=0) {//找到s中第一个需要比较的字符
                if (t.charAt(tflag)=='#') {
                    skipt++;
                    tflag--;
                } else {
                    if (skipt!=0) {
                        skipt--;
                        tflag--;
                    } else break;
                }
            }
            if (sflag>=0&&tflag>=0){//仅当两者下表都大于0时才有比较的意义
                if (s.charAt(sflag)!=t.charAt(tflag))
                    return false;
            } else {//有下标小于0，只有两个下标都小于0的时候才有意义
                if (sflag>=0||tflag>=0)
                    return false;
            }
            sflag--;
            tflag--;
        }
        return true;
    }
}

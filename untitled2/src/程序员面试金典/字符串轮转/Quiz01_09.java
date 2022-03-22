package 程序员面试金典.字符串轮转;

/**
 * @author zx
 * @date 2022/3/22 11:12
 */
public class Quiz01_09 {
    public boolean isFlipedString(String s1, String s2) {
        return s1.length()==s2.length()&&(s2+s2).contains(s1);
    }
}

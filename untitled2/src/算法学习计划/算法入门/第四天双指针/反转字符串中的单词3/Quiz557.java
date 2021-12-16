package 算法学习计划.算法入门.第四天双指针.反转字符串中的单词3;

/**
 * @author zx
 * @date 2021/12/16 9:26
 */
public class Quiz557 {
    public String reverseWords(String s) {
        StringBuffer ans = new StringBuffer();
        int slen=s.length();
        int i=0;
        while (i<slen) {
            int start=i;
            while (i<slen&&s.charAt(i)!=' ')
                i++;
            int end=i-1;
            while (end>=start) {
                ans.append(s.charAt(end));
                end--;
            }
            if (i<slen) {
                ans.append(' ');
                i++;
            }
        }
        return ans.toString();
    }
}

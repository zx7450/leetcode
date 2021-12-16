package 算法学习计划.算法入门.第四天双指针.反转字符串;

/**
 * @author zx
 * @date 2021/12/16 9:24
 */
public class Quiz344 {
    public void reverseString(char[] s) {
        int slen=s.length;
        if (slen==1)
            return;
        int left=0;
        int right=slen-1;
        while (left<right) {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}

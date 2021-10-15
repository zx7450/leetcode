package 字符串.反转字符串;

public class Quiz344 {
    public void reverseString(char[] s) {
        if (s.length==1)
            return;
        int left=0,right=s.length-1;
        char temp;
        while (left<right){
            temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        return;
    }
}

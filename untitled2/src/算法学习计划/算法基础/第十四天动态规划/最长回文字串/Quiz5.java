package 算法学习计划.算法基础.第十四天动态规划.最长回文字串;

/**
 * @author zx
 * @date 2022/1/13 1:18
 */
public class Quiz5 {
    public String longestPalindrome(String s) {
        int slen=s.length();
        if (slen<2)
            return s;
        boolean[][] isPalindrome=new boolean[slen][slen];
        int maxlen=1;
        int beg=0;
        for (int i = 0; i < slen; i++) {
            isPalindrome[i][i]=true;
        }
        char[] charofs=s.toCharArray();
        for (int i = slen-1; i >= 0; i--) {
            for (int j = i; j < slen; j++) {
                if (charofs[i]==charofs[j]) {
                    if ((j-i)<=1)
                        isPalindrome[i][j]=true;
                    else
                        isPalindrome[i][j]=isPalindrome[i+1][j-1];
                }
                if (isPalindrome[i][j]&&j-i+1>maxlen) {
                    beg=i;
                    maxlen=j-i+1;
                }
            }
        }
        return s.substring(beg,beg+maxlen);
    }
}

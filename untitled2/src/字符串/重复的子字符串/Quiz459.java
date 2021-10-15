package 字符串.重复的子字符串;

public class Quiz459 {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        int[] next=new int[n];
        int j=0;
        next[0]=0;
        for (int i = 1; i < n; i++) {//next数组的构造
            while (j>0&&s.charAt(i)!=s.charAt(j)){
                j=next[j-1];
            }
            if (s.charAt(i)==s.charAt(j))
                j++;
            next[i]=j;
        }
        if (next[n-1]>0&&n%(n-next[n-1])==0)
            return true;
        return false;
    }
}

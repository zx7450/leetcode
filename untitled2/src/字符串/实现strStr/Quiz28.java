package 字符串.实现strStr;

public class Quiz28 {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        if (n==0)
            return 0;
        else if (m<n)
            return -1;
        int[] next=new int[n];
        int j=0;
        next[0]=0;
        for (int i = 1; i < n; i++) {//next数组的构造
            while (j>0&&needle.charAt(i)!=needle.charAt(j)){
                j=next[j-1];
            }
            if (needle.charAt(i)==needle.charAt(j))
                j++;
            next[i]=j;
        }
        j=0;
        for (int i = 0; i < m; i++) {
            while (j>0&&haystack.charAt(i)!=needle.charAt(j))
                j=next[j-1];
            if (haystack.charAt(i)==needle.charAt(j))
                j++;
            if (j==n)
                return (i-j+1);
        }
        return -1;
    }
}

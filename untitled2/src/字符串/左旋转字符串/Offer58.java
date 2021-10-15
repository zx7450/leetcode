package 字符串.左旋转字符串;

public class Offer58 {
//    public String reverseLeftWords(String s, int n) {//原题解法
//        String ansmove=s.substring(0,n);
//        String ans=s.substring(n,s.length());
//        return ans+ansmove;
//    }
    public String reverseLeftWords(String s, int n) {//代码随想录的不申请额外空间解法，思路：局部反转+整体反转，先反转两个字串，再反转整个字符串
        int len=s.length();
        StringBuilder stringBuilder=new StringBuilder(s);
        reverseStringBuffer(stringBuilder,0,n-1);
        reverseStringBuffer(stringBuilder,n,len-1);
        return stringBuilder.reverse().toString();
    }
        public void reverseStringBuffer(StringBuilder sb,int start,int end){
        while (start<end){
            char c=sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end,c);
            start++;
            end--;
        }
    }
}

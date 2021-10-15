package 字符串.翻转字符串里的单词;

import java.util.*;

public class Quiz151 {
//    public String reverseWords(String s) {//语言特性法，使用split+正则表达式
//        // 除去开头和末尾的空白字符
//        s = s.trim();
//        // 正则匹配连续的空白字符作为分隔符分割
//        List<String> wordList = Arrays.asList(s.split("\\s+"));
//        Collections.reverse(wordList);
//        return String.join(" ", wordList);
//    }
//    public String reverseWords(String s) {//分别编写三个相关函数解决
//        StringBuilder sWithoutSpace=trimAllSpace(s);
//        reverseStringBuffer(sWithoutSpace,0,sWithoutSpace.length()-1);
//        reverseEachword(sWithoutSpace);
//        return sWithoutSpace.toString();
//    }
//    public StringBuilder trimAllSpace(String s){
//        int left=0;
//        int right=s.length()-1;
//        while (s.charAt(left)==' ')//去除s开头多余的空格
//            left++;
//        while (s.charAt(right)==' ')//去除s末尾多余的空格
//            right--;
//        StringBuilder stringBuilder=new StringBuilder();
//        while (left<=right){//去除s中间多余的空格
//            char c=s.charAt(left);
//            if (c!=' ')
//                stringBuilder.append(c);
//            else if (stringBuilder.charAt(stringBuilder.length()-1)!=' ')
//                stringBuilder.append(c);
//            left++;
//        }
//        return stringBuilder;
//    }
//    public void reverseStringBuffer(StringBuilder sb,int start,int end){
//        while (start<end){
//            char c=sb.charAt(start);
//            sb.setCharAt(start, sb.charAt(end));
//            sb.setCharAt(end,c);
//            start++;
//            end--;
//        }
//    }
//    public void reverseEachword(StringBuilder sb){
//        int start=0,end=1;
//        int len=sb.length();
//        while (end<len){
//            while (end<len&&sb.charAt(end)!=' ')
//                end++;
//            reverseStringBuffer(sb,start,end-1);
//            start=end+1;
//            end=start+1;
//        }
//    }
    public String reverseWords(String s) {//双端队列法
        int start=0,end=s.length()-1;
        while (start<=end&&s.charAt(start)==' ')
            start++;
        while (start<=end&&s.charAt(end)==' ')
            end--;
        Deque<String> deque=new ArrayDeque<String>();
        StringBuilder word=new StringBuilder();
        while (start<=end){
            char c=s.charAt(start);
            if ((c==' ')&&(word.length()!=0)){
                deque.addFirst(word.toString());
                word.setLength(0);
            } else if (c!=' ')
                word.append(c);
            start++;
        }
        deque.addFirst(word.toString());
        return String.join(" ",deque);
    }
}

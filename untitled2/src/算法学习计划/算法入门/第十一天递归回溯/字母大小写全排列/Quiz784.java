package 算法学习计划.算法入门.第十一天递归回溯.字母大小写全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2021/12/23 9:46
 */
public class Quiz784 {
//    List<StringBuilder> res=new ArrayList<>();
//    StringBuilder path=new StringBuilder();
//    public List<String> letterCasePermutation(String s) {
//        backtracing(s,0);
//        List<String> ans=new ArrayList<>();
//        for (StringBuilder sb:res) {
//            ans.add(sb.toString());
//        }
//        return ans;
//    }
//
//    public void backtracing(String s,int shartpos) {
//        if (shartpos==s.length()) {
//            res.add(new StringBuilder(path));
//            return;
//        }
//        char c=s.charAt(shartpos);
//        if (Character.isLetter(c)) {
//            path.append(Character.toLowerCase(c));
//            backtracing(s,shartpos+1);
//            path.deleteCharAt(path.length()-1);
//            path.append(Character.toUpperCase(c));
//            backtracing(s,shartpos+1);
//            path.deleteCharAt(path.length()-1);
//        } else {
//            path.append(s.charAt(shartpos));
//            backtracing(s,shartpos+1);
//            path.deleteCharAt(path.length()-1);
//        }
//    }
    public List<String> letterCasePermutation(String s) {//官方
        List<StringBuilder> res=new ArrayList<>();
        res.add(new StringBuilder());
        for (char c:s.toCharArray()) {
            int n=res.size();
            if (Character.isLetter(c)){
                for (int i = 0; i < n; i++) {//先将之前存储的结果全部复制两份，再在每份中分别添加该位字符的大写或小写形式
                    res.add(new StringBuilder(res.get(i)));
                    res.get(i).append(Character.toLowerCase(c));
                    res.get(n+i).append(Character.toUpperCase(c));
                }
            } else {
                for (int i = 0; i < n; i++) {
                    res.get(i).append(c);
                }
            }
        }
        List<String> ans=new ArrayList<>();
        for (StringBuilder sb:res) {
            ans.add(sb.toString());
        }
        return ans;
    }
}

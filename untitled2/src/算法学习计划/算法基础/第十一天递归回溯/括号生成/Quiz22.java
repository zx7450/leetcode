package 算法学习计划.算法基础.第十一天递归回溯.括号生成;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2022/1/7 16:40
 */
public class Quiz22 {
    List<String> res=new ArrayList<>();
    StringBuilder path=new StringBuilder();
    public List<String> generateParenthesis(int n) {
        if (n==1) {
            res.add("()");
            return res;
        }
        backtracing(0,0,n);
        return res;
    }

    public void backtracing(int lefttotal,int righttotal,int n) {
        if (path.length()==(2*n)) {
            res.add(path.toString());
            return;
        }
        if (lefttotal<n) {
            path.append('(');
            backtracing(lefttotal+1,righttotal,n);
            path.deleteCharAt(path.length()-1);
        }
        if (righttotal<lefttotal) {
            path.append(')');
            backtracing(lefttotal,righttotal+1,n);
            path.deleteCharAt(path.length()-1);
        }
    }
}

package 算法学习计划.算法入门.第十一天递归回溯.组合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2021/12/23 9:20
 */
public class Quiz77 {
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracing(n,k,1);
        return result;
    }

    public void backtracing(int n,int k,int startpos){
        if (path.size()==k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startpos; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backtracing(n,k,i+1);
            path.remove(path.size()-1);
        }
    }
}

package 回溯算法.组合总和3;

import java.util.ArrayList;
import java.util.List;

public class Quiz216 {
    List<List<Integer>> result=new ArrayList<List<Integer>>();
    List<Integer> path=new ArrayList<Integer>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracing(n,k,1);
        return result;
    }

    public void backtracing(int n,int k,int startpos){
        if (n<0)//如果已选元素之和已经大于目标值则无需往下遍历，直接剪枝
            return;
        if (path.size()==k&&n==0){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startpos; i <= 9-(k-path.size())+1; i++) {
            path.add(i);
            backtracing(n-i,k,i+1);
            path.remove(path.size()-1);
        }
    }
}

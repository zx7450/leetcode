package 算法学习计划.算法基础.第八天深度优先广度优先.所有可能的路径;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zx
 * @date 2022/1/6 10:53
 */
public class Quiz797 {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    int n;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        n= graph.length;
        dfs(graph,0);
        return ans;
    }

    public void dfs(int[][] graph,int i) {
        path.add(i);
        if (i==(n-1)) {
            ans.add(new LinkedList<>(path));
            path.remove(path.size()-1);
            return;
        }
        for (int j = 0; j < graph[i].length; j++) {
            dfs(graph,graph[i][j]);
        }
        path.remove(path.size()-1);
    }
}

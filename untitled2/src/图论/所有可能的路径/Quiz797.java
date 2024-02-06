package 图论.所有可能的路径;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zx
 * @date 2024/2/4 8:56
 */
public class Quiz797 {
    static List<List<Integer>> res;
    static List<Integer> path;
    static int dest;

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        res = new ArrayList<>();
        path = new ArrayList<>();
        dest = graph.length - 1;
        path.add(0);
        dfs(graph, 0);
        return res;
    }

    public static void dfs(int[][] graph, int node) {
        if (node == dest) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < graph[node].length; i++) {
            path.add(graph[node][i]);
            dfs(graph, graph[node][i]);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[][] graph = new int[][]{{1, 2}, {3}, {3}, {}};
        System.out.println(allPathsSourceTarget(graph));
    }
}

package 程序员面试金典.节点间通路;

import java.util.*;

/**
 * @author zx
 * @date 2022/4/13 9:43
 */
public class Quiz04_01 {
    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        Map<Integer, List<Integer>> path=new HashMap<>();
        for (int[] pa:graph) {
            if (!path.containsKey(pa[0])) {
                path.put(pa[0],new ArrayList<>());
            }
            path.get(pa[0]).add(pa[1]);
        }
        return haspath(n,path,start,target);
    }

    public boolean haspath(int n, Map<Integer, List<Integer>> path, int start, int target) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(start);
        boolean[] vistted=new boolean[n];
        vistted[start]=true;
        while (!queue.isEmpty()) {
            List<Integer> nodepath=path.get(queue.poll());
            if (nodepath==null)
                continue;
            for (int node:nodepath) {
                if (node==target)
                    return true;
                if (vistted[node]==true)
                    continue;
                vistted[node]=true;
                queue.add(node);
            }
        }
        return false;
    }
}

package 图论.钥匙和房间;

import java.util.List;

/**
 * @author zx
 * @date 2024/2/11 17:11
 */
public class Quiz841 {
    boolean[] visited;
    int n;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        n = rooms.size();
        visited = new boolean[n];
        dfs(rooms, 0);
        for (int i = 0; i < n; i++) {
            if (!visited[i])
                return false;
        }
        return true;
    }

    public void dfs(List<List<Integer>> rooms, int cur) {
        if (visited[cur] || rooms.get(cur) == null)
            return;
        visited[cur] = true;
        List<Integer> keys = rooms.get(cur);
        for (int i = 0; i < keys.size(); i++) {
            dfs(rooms, keys.get(i));
        }
    }
}

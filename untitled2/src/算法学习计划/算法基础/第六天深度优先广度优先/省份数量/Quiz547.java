package 算法学习计划.算法基础.第六天深度优先广度优先.省份数量;

/**
 * @author zx
 * @date 2022/1/4 17:00
 */
public class Quiz547 {
    public int findCircleNum(int[][] isConnected) {
        int rowlen=isConnected.length;
        if (rowlen==1)
            return 1;
        boolean[] visit=new boolean[rowlen];
        int ans=0;
        for (int i = 0; i < rowlen; i++) {
            if (visit[i]==true)
                continue;
            ans++;
            dfs(isConnected,visit,i);
        }
        return ans;
    }

    public void dfs(int[][] isConnected,boolean[] visit,int i) {
        if (visit[i]==true)
            return;
        visit[i]=true;
        for (int j = 0; j < isConnected[i].length; j++) {
            if (j==i)
                continue;
            if (isConnected[i][j]==1)
                dfs(isConnected,visit,j);
        }
    }
}

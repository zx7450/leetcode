package 每日一题.统计最高分的节点数目;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2022/3/11 9:01
 */
public class Quiz2049 {
    List<Integer>[] childrens;
    long maxscore=0;
    int numsofmax=0;
    int parlen;
    public int countHighestScoreNodes(int[] parents) {
        parlen= parents.length;
        childrens=new List[parlen];
        for (int i = 0; i < parlen; i++) {
            childrens[i]=new ArrayList<Integer>();
        }
        for (int i = 0; i < parents.length; i++) {
            int p=parents[i];
            if (p!=-1)
                childrens[p].add(i);
        }
        dfs(0);
        return numsofmax;
    }

    public int dfs(int node){
        int size=parlen-1;
        long score=1;
        for (int c:childrens[node]) {
            int t=dfs(c);
            score*=t;
            size-=t;
        }
        if (node!=0)
            score*=size;
        if (score==maxscore)
            numsofmax++;
        else if (score>maxscore) {
            maxscore=score;
            numsofmax=1;
        }
        return parlen-size;
    }
}

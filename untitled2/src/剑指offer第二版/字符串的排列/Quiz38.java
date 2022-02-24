package 剑指offer第二版.字符串的排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2022/2/24 9:54
 */
public class Quiz38 {
    StringBuilder path;
    boolean[] visited;
    List<String> ans;
    int slen;
    public String[] permutation(String s) {
        slen=s.length();
        if (slen==1)
            return new String[]{s};
        char[] charofs=s.toCharArray();
        Arrays.sort(charofs);
        visited=new boolean[slen];
        ans=new ArrayList<>();
        path=new StringBuilder();
        backtracing(charofs);
        String[] anserarray=new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            anserarray[i]= ans.get(i);
        }
        return anserarray;
    }

    public void backtracing(char[] chars) {
        if (path.length()==slen) {
            ans.add(path.toString());
            return;
        }
        for (int i = 0; i < slen; i++) {
            if (i>0&&!visited[i-1]&&chars[i]==chars[i-1])
                continue;
            if (!visited[i]) {
                path.append(chars[i]);
                visited[i]=true;
                backtracing(chars);
                path.deleteCharAt(path.length()-1);
                visited[i]=false;
            }
        }
    }
}

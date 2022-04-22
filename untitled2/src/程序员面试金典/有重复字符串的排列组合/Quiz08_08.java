package 程序员面试金典.有重复字符串的排列组合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2022/4/22 9:34
 */
public class Quiz08_08 {
    StringBuilder path;
    List<String> ans;
    boolean[] visit;

    public String[] permutation(String S) {
        if (S.length() == 1)
            return new String[]{S};
        path = new StringBuilder();
        ans = new ArrayList<>();
        visit = new boolean[S.length()];
        char[] c = S.toCharArray();
        Arrays.sort(c);
        backtracing(c);
        return ans.toArray(new String[ans.size()]);
    }

    public void backtracing(char[] c) {
        if (path.length() == c.length) {
            ans.add(path.toString());
            return;
        }
        for (int i = 0; i < c.length; i++) {
            if (i > 0 && visit[i-1] == false && c[i] == c[i - 1])
                continue;
            if (!visit[i]) {
                path.append(c[i]);
                visit[i] = true;
                backtracing(c);
                visit[i] = false;
                path.deleteCharAt(path.length() - 1);
            }
        }
    }
}

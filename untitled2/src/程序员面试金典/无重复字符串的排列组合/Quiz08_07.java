package 程序员面试金典.无重复字符串的排列组合;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2022/4/22 9:25
 */
public class Quiz08_07 {
    StringBuilder path;
    List<String> ans;
    boolean[] visit;

    public String[] permutation(String S) {
        if (S.length() == 1)
            return new String[]{S};
        path = new StringBuilder();
        ans = new ArrayList<>();
        visit = new boolean[S.length()];
        backtracing(S);
        return ans.toArray(new String[ans.size()]);
    }

    public void backtracing(String s) {
        if (path.length() == s.length()) {
            ans.add(path.toString());
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (visit[i])
                continue;
            path.append(s.charAt(i));
            visit[i] = true;
            backtracing(s);
            visit[i] = false;
            path.deleteCharAt(path.length() - 1);
        }
    }
}

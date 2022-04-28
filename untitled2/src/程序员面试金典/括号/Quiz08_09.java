package 程序员面试金典.括号;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2022/4/23 10:04
 */
public class Quiz08_09 {
    int pairs;
    int leftsum;
    int rightsum;
    StringBuilder path;
    List<String> ans;

    public List<String> generateParenthesis(int n) {
        pairs = n;
        leftsum = 0;
        rightsum = 0;
        path = new StringBuilder();
        ans = new ArrayList<>();
        backtracing();
        return ans;
    }

    public void backtracing() {
        if (leftsum == pairs && rightsum == pairs) {
            ans.add(path.toString());
            return;
        }
        if (leftsum < pairs) {
            path.append("(");
            leftsum++;
            backtracing();
            path.deleteCharAt(path.length() - 1);
            leftsum--;
        }
        if (rightsum < pairs && rightsum < leftsum) {
            path.append(")");
            rightsum++;
            backtracing();
            path.deleteCharAt(path.length() - 1);
            rightsum--;
        }
    }
}

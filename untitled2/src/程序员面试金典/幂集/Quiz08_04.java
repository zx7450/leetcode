package 程序员面试金典.幂集;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2022/4/21 9:06
 */
public class Quiz08_04 {
    List<List<Integer>> ans;
    List<Integer> path;

    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        path = new ArrayList<>();
        backtracing(nums, 0);
        return ans;
    }

    public void backtracing(int[] nums, int startpos) {
        ans.add(new ArrayList<>(path));
        for (int i = startpos; i < nums.length; i++) {
            path.add(nums[i]);
            backtracing(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}

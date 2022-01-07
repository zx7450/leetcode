package 算法学习计划.算法基础.第十天递归回溯.全排列2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2022/1/7 9:19
 */
public class Quiz47 {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    boolean[] visit;
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length==1) {
            path.add(nums[0]);
            res.add(new ArrayList<>(path));
            return res;
        }
        visit=new boolean[nums.length];
        Arrays.sort(nums);
        backtracing(nums);
        return res;
    }

    public void backtracing(int[] nums) {
        if (path.size()==nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i!=0&&nums[i]==nums[i-1]&&visit[i-1]==false)
                continue;
            if (visit[i]==false) {
                path.add(nums[i]);
                visit[i] = true;
                backtracing(nums);
                path.remove(path.size() - 1);
                visit[i] = false;
            }
        }
    }
}

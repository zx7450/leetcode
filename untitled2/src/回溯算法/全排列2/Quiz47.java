package 回溯算法.全排列2;

import java.util.*;

/**
 * @author zx
 * @date 2021/11/01 9:12
 */
public class Quiz47 {
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length==1) {
            path.add(nums[0]);
            result.add(new ArrayList<>(path));
            return result;
        }
        used=new boolean[nums.length];
        Arrays.sort(nums);
        backtracing(nums);
        return result;
    }
    public void backtracing(int[] nums) {
        if (path.size()==nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i>0&&used[i-1]==false&&nums[i]==nums[i-1])
                continue;
            if (used[i]==false) {
                path.add(nums[i]);
                used[i] = true;
                backtracing(nums);
                path.remove(path.size() - 1);
                used[i] = false;
            }
        }
    }
}

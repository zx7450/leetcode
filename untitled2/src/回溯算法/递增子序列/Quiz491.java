package 回溯算法.递增子序列;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2021/10/31 21:09
 */
public class Quiz491 {
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracing(nums,0);
        return result;
    }
    public void backtracing(int[] nums,int startpos) {
        if (path.size()>=2)
            result.add(new ArrayList<>(path));
        if (startpos==nums.length)
            return;
        int[] used=new int[201];//用于记录本层某元素是否使用过（由于数据范围在-100到100，直接用数组标记即可）
        for (int i = startpos; i < nums.length; i++) {
            if (!path.isEmpty()&&nums[i]<path.get(path.size()-1)||used[nums[i]+100]==1)
                continue;
            path.add(nums[i]);
            used[nums[i]+100]=1;
            backtracing(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}

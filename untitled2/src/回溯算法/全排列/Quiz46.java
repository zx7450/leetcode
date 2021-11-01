package 回溯算法.全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2021/11/01 8:58
 */
public class Quiz46 {
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length==1){
            path.add(nums[0]);
            result.add(new ArrayList<>(path));
            return result;
        }
        used=new boolean[nums.length];
        backtracing(nums);
        return result;
    }
    public void backtracing(int[] nums){
        if (path.size()==nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            path.add(nums[i]);
            used[i]=true;
            backtracing(nums);
            path.remove(path.size()-1);
            used[i]=false;
        }
    }
}

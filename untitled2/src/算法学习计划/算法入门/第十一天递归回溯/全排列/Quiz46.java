package 算法学习计划.算法入门.第十一天递归回溯.全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2021/12/23 9:30
 */
public class Quiz46 {
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        int numlen=nums.length;
        if (numlen==1) {
            path.add(nums[0]);
            result.add(new ArrayList<>(path));
            return result;
        }
        used=new boolean[numlen];
        backtracing(nums);
        return result;
    }

    public void backtracing(int[] nums){
        if (path.size()==nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]==false) {
                used[i]=true;
                path.add(nums[i]);
                backtracing(nums);
                path.remove(path.size()-1);
                used[i]=false;
            }
        }
    }
}

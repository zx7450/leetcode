package 回溯算法.子集;

import java.util.ArrayList;
import java.util.List;

public class Quiz78 {
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtracing(nums,0);
        return result;
    }
    public void backtracing(int[] nums,int startindex) {
        result.add(new ArrayList<>(path));
        if (startindex==nums.length)
            return;
        for (int i = startindex; i < nums.length; i++) {
            path.add(nums[i]);
            backtracing(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}

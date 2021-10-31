package 回溯算法.子集2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz90 {
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtracing(nums,0);
        return result;
    }
    public void backtracing(int[] nums,int startpos){
        result.add(new ArrayList<>(path));
        if (startpos==nums.length)
            return;
        for (int i = startpos; i < nums.length; i++) {
            if (i>startpos&&nums[i]==nums[i-1])//i比开始位置大说明已经不是第一次遍历，此时若本位置值与前一位置的相等则应该去重，直接进入下一步
                continue;
            path.add(nums[i]);
            backtracing(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}

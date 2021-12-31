package 算法学习计划.算法基础.第三天双指针.三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2021/12/29 14:34
 */
public class Quiz15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int numlen=nums.length;
        Arrays.sort(nums);
        if (numlen<3||nums[0]>0||nums[numlen-1]<0)
            return ans;
        for (int i = 0; i < numlen; i++) {
            if (i>0&&nums[i]==nums[i-1])
                continue;
            int left=i+1;
            int right=numlen-1;
            while (left<right) {
                int sum=nums[i]+nums[left]+nums[right];
                if (sum<0)
                    left++;
                else if (sum>0)
                    right--;
                else {
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left<right&&nums[left]==nums[left+1])
                        left++;
                    while (left<right&&nums[right]==nums[right-1])
                        right--;
                    left++;
                    right--;
                }
            }
        }
        return ans;
    }
}

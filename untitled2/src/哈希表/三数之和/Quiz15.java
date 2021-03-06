package 哈希表.三数之和;

//该题不适合用哈希表法，只是为了与之前的题目做对比

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz15 {//未做完
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if (nums.length<3)
            return ans;
        Arrays.sort(nums);
        if (nums[0]>0||nums[nums.length-1]<0)
            return ans;
        for (int i = 0; i < nums.length; i++) {
            if (i>0&&nums[i]==nums[i-1])
                continue;
            int left=i+1;
            int right=nums.length-1;
            while (left<right){
                int sum=nums[left]+nums[right]+nums[i];
                if (sum<0)
                    left++;
                else if (sum>0)
                    right--;
                else{
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

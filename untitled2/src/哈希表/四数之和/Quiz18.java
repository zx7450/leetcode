package 哈希表.四数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        int len= nums.length;
        if (len<4)
            return ans;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (i>0&&nums[i]==nums[i-1])
                continue;
            for (int i1 = i+1; i1 < len; i1++) {
                if (i1>i+1&&nums[i1]==nums[i1-1])
                    continue;
                int left=i1+1;
                int right=len-1;
                while (left<right){
                    int sum=nums[i]+nums[i1]+nums[left]+nums[right];
                    if (sum<target)
                        left++;
                    else if (sum>target)
                        right--;
                    else {
                        ans.add(Arrays.asList(nums[i],nums[i1],nums[left],nums[right]));
                        while (left<right&&nums[left]==nums[left+1])
                            left++;
                        while (left<right&&nums[right]==nums[right-1])
                            right--;
                        left--;
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}

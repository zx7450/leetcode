package 剑指offer第二版.和为s的两个数字;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zx
 * @date 2022/3/8 10:13
 */
public class Quiz57 {
//    public int[] twoSum(int[] nums, int target) {//HashSet
//        int numlen=nums.length;
//        Set<Integer> numset=new HashSet<>();
//        int[] ans=new int[2];
//        for (int i = 0; i < numlen; i++) {
//            if (numset.contains(target-nums[i])) {
//                ans[0]=nums[i];
//                ans[1]=target-nums[i];
//                break;
//            }
//            numset.add(nums[i]);
//        }
//        return ans;
//    }
    public int[] twoSum(int[] nums, int target) {//双指针
        int left=0,right=nums.length-1;
        while (left<right) {
            int sum=nums[left]+nums[right];
            if (sum==target)
                break;
            else if (sum<target)
                left++;
            else
                right--;
        }
        return new int[]{nums[left],nums[right]};
    }
}

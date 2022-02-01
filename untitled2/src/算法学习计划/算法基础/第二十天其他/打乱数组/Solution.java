package 算法学习计划.算法基础.第二十天其他.打乱数组;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * @author zx
 * @date 2022/1/31 22:26
 */
public class Solution {//Quiz384
    int[] nums;
    int[] origin;
    public Solution(int[] nums) {
        this.nums=nums;
        this.origin=new int[nums.length];
        System.arraycopy(nums,0,origin,0,nums.length);
    }

    public int[] reset() {
        System.arraycopy(origin,0,nums,0,nums.length);
        return nums;
    }

    public int[] shuffle() {
        int[] changed=new int[nums.length];
        List<Integer> temp=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            temp.add(nums[i]);
        }
        Random random=new Random();
        for (int i = 0; i < nums.length; i++) {
            int j=random.nextInt(temp.size());
            changed[i]=temp.remove(j);
        }
        System.arraycopy(changed,0,nums,0,nums.length);
        return nums;
    }
}

package 剑指offer第二版.数组中重复的数字;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zx
 * @date 2021/12/24 10:03
 */
public class Quiz03 {
//    public int findRepeatNumber(int[] nums) {//排序加遍历
//        int numlen=nums.length;
//        if (numlen==2)
//            return nums[0];
//        Arrays.sort(nums);
//        for (int i = 1; i < numlen; i++) {
//            if (nums[i]==nums[i-1])
//                return nums[i];
//        }
//        return 0;
//    }

//    public int findRepeatNumber(int[] nums) {//哈希set
//        int numlen = nums.length;
//        if (numlen == 2)
//            return nums[0];
//        Set<Integer> set=new HashSet<>();
//        for (int i = 0; i < numlen; i++) {
//            if (set.contains(nums[i]))
//                return nums[i];
//            else
//                set.add(nums[i]);
//        }
//        return 0;
//    }

    public int findRepeatNumber(int[] nums) {//索引交换
        int numlen = nums.length;
        if (numlen == 2)
            return nums[0];
        int[] numstemp=new int[numlen];
        for (int i = 0; i < numlen;) {
            if (nums[i]==i){
                i++;
                continue;
            }
            if (nums[nums[i]]==nums[i])
                return nums[i];
            else {
                int temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }
        return 0;
    }
}

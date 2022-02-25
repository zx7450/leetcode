package 剑指offer第二版.数组中出现次数超过一半的数字;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zx
 * @date 2022/2/25 9:31
 */
public class Quiz39 {
//    public int majorityElement(int[] nums) {//暴力，哈希Map
//        int numlen=nums.length;
//        if (numlen==1||numlen==2)
//            return nums[0];
//        Map<Integer,Integer> numsmap=new HashMap<>();
//        for (int num:nums) {
//            numsmap.put(num,numsmap.getOrDefault(num,0)+1);
//            if (numsmap.get(num)==(numlen/2+1))
//                return num;
//        }
//        return 0;
//    }

    public int majorityElement(int[] nums) {//对数组进行排序，则下标为n/2的数一定是众数
        int numlen=nums.length;
        if (numlen==1||numlen==2)
            return nums[0];
        Arrays.sort(nums);
        return nums[numlen/2];
    }
}

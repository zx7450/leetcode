package 剑指offer第二版.扑克牌中的顺子;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zx
 * @date 2022/3/10 9:53
 */
public class Quiz61 {
    //    public boolean isStraight(int[] nums) {
//        Arrays.sort(nums);
//        int extracard=0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]==0)
//                extracard++;
//            else {
//                if (i>0&&nums[i-1]!=0&&nums[i]!=(nums[i-1]+1))
//                    if (nums[i]==nums[i-1]||extracard<nums[i]-nums[i-1]-1)
//                        return false;
//                    else
//                        extracard-=nums[i]-nums[i-1]-1;
//            }
//        }
//        return true;
//    }
    //若要组成顺子，则需满足两个条件：1、除王外不存在其他重复的牌；2、最大值-最小值小于5
//    public boolean isStraight(int[] nums) {//哈希表法
//        Set<Integer> hasoccur=new HashSet<>();
//        int max=0,min=14;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]==0)
//                continue;
//            else if (hasoccur.contains(nums[i]))
//                return false;
//            hasoccur.add(nums[i]);
//            if (nums[i]>max)
//                max=nums[i];
//            if (nums[i]<min)
//                min=nums[i];
//        }
//        return max-min<5?true:false;
//    }

    public boolean isStraight(int[] nums) {//排序+遍历
        Arrays.sort(nums);
        int min = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0)
                continue;
            else if (nums[i] == nums[i + 1])
                return false;
            if (min == 0)
                min = nums[i];
        }
        return nums[nums.length - 1] - min < 5 ? true : false;
    }
}

package 剑指offer第二版.数组中数字出现的次数2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zx
 * @date 2022/3/8 10:01
 */
public class Quiz56_2 {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> hascoour=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hascoour.put(nums[i],hascoour.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> occ: hascoour.entrySet()) {
            if (occ.getValue()==1)
                return occ.getKey();
        }
        return 0;
    }
}

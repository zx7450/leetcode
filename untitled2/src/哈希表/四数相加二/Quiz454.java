package 哈希表.四数相加二;

import java.util.HashMap;
import java.util.Map;

public class Quiz454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int len=nums1.length;
        if (len==1)
            if (nums1[0]+nums2[0]+nums3[0]+nums4[0]==0)
                return 1;
            else
                return 0;
        Map<Integer,Integer> sumOfnums1Andnums2=new HashMap<Integer, Integer>();//记录前两个数组元素和及出现次数
        for (int i = 0; i < len; i++) {
            for (int i1 = 0; i1 < len; i1++) {
                sumOfnums1Andnums2.put(nums1[i]+nums2[i1],sumOfnums1Andnums2.getOrDefault(nums1[i]+nums2[i1],0)+1);
            }
        }
        int ans=0;
        for (int i = 0; i < len; i++) {
            for (int i1 = 0; i1 < len; i1++) {
                ans+=sumOfnums1Andnums2.getOrDefault(-(nums3[i]+nums4[i1]),0);
            }
        }
        return ans;
    }
}

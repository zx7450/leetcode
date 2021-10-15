package 哈希表.两个数组的交集;

import java.util.*;

public class Quiz350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums2.length>nums1.length)
            return findans(nums1,nums2);
        else
            return findans(nums2,nums1);
    }
    public int[] findans(int[] nums1, int[] nums2){
        Map<Integer,Integer> numsInnums1=new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i++) {
            numsInnums1.put(nums1[i],numsInnums1.getOrDefault(nums1[i],0)+1);
        }
        int[] ans=new int[nums1.length];
        int index=0;
        for (int i = 0; i < nums2.length; i++) {
            int count=numsInnums1.getOrDefault(nums2[i],0);
            if (count>0){
                ans[index++]=nums2[i];
                count--;
                if (count>0)
                    numsInnums1.put(nums2[i],count);
                else
                    numsInnums1.remove(nums2[i]);
            }
        }
        return Arrays.copyOfRange(ans,0,index);
    }
}

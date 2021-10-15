package 哈希表.两个数组的交集;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Quiz349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> setOfNum1=new HashSet<Integer>();
        HashSet<Integer> setOfNum2=new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            setOfNum1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            setOfNum2.add(nums2[i]);
        }
        return getintersection(setOfNum1,setOfNum2);
    }
    public int[] getintersection(HashSet<Integer> set1,HashSet<Integer> set2){
        if (set1.size()>set2.size())
            return getintersection(set2,set1);
        HashSet<Integer> anstemp=new HashSet<Integer>();
        for (int num:set1){
            if (set2.contains(num))
                anstemp.add(num);
        }
        int[] ans=new int[anstemp.size()];
        int index=0;
        for (int num:anstemp)
            ans[index++]=num;
        return ans;
    }
}

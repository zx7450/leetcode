package 单调栈.下一个更大元素1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author zx
 * @date 2021/11/26 10:01
 */
public class Quiz496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int num1len=nums1.length;
        int num2len=nums2.length;
        int[] res=new int[num1len];
        Arrays.fill(res,-1);
        Map<Integer,Integer> pos=new HashMap<>();
        for (int i = 0; i < num1len; i++) {
            pos.put(nums1[i],i);
        }
        Stack<Integer> nextGreater=new Stack<>();
        nextGreater.push(0);
        for (int i = 1; i < num2len; i++) {
            while (!nextGreater.isEmpty()&&nums2[i]>nums2[nextGreater.peek()]) {
                int index=nextGreater.pop();
                if (pos.containsKey(nums2[index]))
                    res[pos.get(nums2[index])]=nums2[i];
            }
            nextGreater.push(i);
        }
        return res;
    }
}

package 单调栈.下一个更大元素2;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author zx
 * @date 2021/11/26 10:32
 */
public class Quiz503 {
    public int[] nextGreaterElements(int[] nums) {
        int numlen=nums.length;
        int[] ans=new int[numlen];
        Arrays.fill(ans,-1);
        Stack<Integer> pos=new Stack<>();
        for (int i = 0; i < 2 * numlen; i++) {
            while (!pos.isEmpty()&&nums[i%numlen]>nums[pos.peek()]) {
                ans[pos.pop()]=nums[i%numlen];
            }
            pos.push(i%numlen);
        }
        return ans;
    }
}

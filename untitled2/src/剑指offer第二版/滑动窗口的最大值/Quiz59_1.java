package 剑指offer第二版.滑动窗口的最大值;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author zx
 * @date 2022/3/9 9:44
 */
public class Quiz59_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int numlen=nums.length;
        if (numlen==0||k==0) return new int[0];
        Deque<Integer> deque=new LinkedList<>();
        for (int i = 0; i < k; i++) {//未形成窗口前的处理
            while (!deque.isEmpty()&&deque.peekLast()<nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
        }
        int[] ans=new int[numlen-k+1];
        ans[0]=deque.peekFirst();
        for (int i = k; i < numlen; i++) {//形成窗口后
            if (deque.peekFirst()==nums[i-k])
                deque.removeFirst();
            while (!deque.isEmpty()&&deque.peekLast()<nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
            ans[i-k+1]=deque.peekFirst();
        }
        return ans;
    }
}

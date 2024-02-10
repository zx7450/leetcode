package 栈与队列.滑动窗口最大值;

import java.util.*;

class Quiz239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 1)
            return nums;
        else if (k == 1)
            return nums;
        int l = 0, r = k - 1;
        Deque<Integer> maxVal = new ArrayDeque<>();
        //处理第一个窗口
        for (int i = 0; i <= r; i++) {
            if (!maxVal.isEmpty()) {
                if (maxVal.peekLast() < nums[i])
                    while (!maxVal.isEmpty() && maxVal.peekLast() < nums[i]) {
                        maxVal.pollLast();
                    }
            }
            maxVal.addLast(nums[i]);
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(maxVal.peekFirst());
        while (r < n - 1) {
            if (nums[l++] == maxVal.peekFirst())
                maxVal.pollFirst();
            r++;
            if (maxVal.peekLast() < nums[r]) {
                while (!maxVal.isEmpty() && maxVal.peekLast() < nums[r])
                    maxVal.pollLast();
            }
            maxVal.addLast(nums[r]);
            ans.add(maxVal.peekFirst());
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}

package 栈与队列.滑动窗口最大值;

import java.util.Deque;
import java.util.LinkedList;

class MyQueue{
    Deque<Integer> deque=new LinkedList<Integer>();
    void poll(int val){//出栈
        if (!deque.isEmpty()&&deque.peek()==val)
            deque.poll();
    }
    void add(int val){
        while (!deque.isEmpty()&&deque.getLast()<val)
            deque.removeLast();
        deque.add(val);
    }
    int peek(){
        return deque.peek();
    }
}
class Quiz239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1)
            return nums;
        int len = nums.length;
        MyQueue myQueue=new MyQueue();
        for (int i = 0; i < k; i++) {
            myQueue.add(nums[i]);
        }
        int[] ans=new int[len-k+1];
        int anslocat=0;
        ans[anslocat++]=myQueue.peek();
        int i=1,j=k;
        while (j<len){
            myQueue.poll(nums[i-1]);
            myQueue.add(nums[j]);
            j++;
            i++;
            ans[anslocat++]=myQueue.peek();
        }
        return ans;
    }
}

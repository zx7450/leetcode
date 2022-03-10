package 剑指offer第二版.队列的最大值;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2022/3/10 9:07
 */
public class MaxQueue {//Quiz59_2

    Queue<Integer> queue;
    Deque<Integer> deque;
    public MaxQueue() {
        queue=new LinkedList<>();
        deque=new LinkedList<>();
    }

    public int max_value() {
        if (deque.isEmpty())
            return -1;
        return deque.peekFirst();
    }

    public void push_back(int value) {
        queue.add(value);
        while (!deque.isEmpty()&&deque.peekLast()<value)
            deque.pollLast();
        deque.addLast(value);
    }

    public int pop_front() {
        if (queue.isEmpty())
            return -1;
        int ans=queue.poll();
        if (ans==deque.peekFirst())
            deque.pollFirst();
        return ans;
    }
}

package 剑指offer第二版.最小的k个数;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author zx
 * @date 2022/2/25 10:01
 */
public class Quiz40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] ans=new int[k];
        if (k==0)
            return ans;
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        int queuelen=0;
        for (int i = 0; i < arr.length; i++) {
            if (queuelen<k)
                priorityQueue.offer(arr[i]);
            else {
                if (priorityQueue.peek()>arr[i]) {
                    priorityQueue.poll();
                    priorityQueue.offer(arr[i]);
                }
            }
        }
        for (int i = 0; i < k; i++) {
            ans[i]=priorityQueue.poll();
        }
        return ans;
    }
}

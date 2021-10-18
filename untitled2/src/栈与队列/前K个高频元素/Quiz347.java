package 栈与队列.前K个高频元素;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Quiz347 {
    public int[] topKFrequent(int[] nums, int k) {
        int len=nums.length;
        if (len==1)
            return nums;
        Map<Integer,Integer> getnumfreq=new HashMap<Integer, Integer>();
        for (int i = 0; i < len; i++) {
            getnumfreq.put(nums[i], getnumfreq.getOrDefault(nums[i],0)+1);
        }
        Set<Map.Entry<Integer,Integer>> entries= getnumfreq.entrySet();
        PriorityQueue<Map.Entry<Integer,Integer>> queue=new PriorityQueue<>((o1,o2)->o1.getValue()-o2.getValue());
        for(Map.Entry<Integer,Integer> entry:entries){
            queue.add(entry);
            if (queue.size()>k)
                queue.poll();
        }
        int[] ans=new int[k];
        for (int i = 0; i < k; i++) {
            ans[i]=queue.poll().getKey();
        }
        return ans;
    }
}

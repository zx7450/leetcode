package 剑指offer第二版.数据流中的中位数;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author zx
 * @date 2022/2/26 10:36
 */
public class MedianFinder {//Quiz41
    /** initialize your data structure here. */
    Queue<Integer> smallnums,bignums;
    public MedianFinder() {
        smallnums=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });//大顶堆，存放数据流较小的那半部分
        bignums=new PriorityQueue<>();//小顶堆，存放数组最大的那半部分
    }

    public void addNum(int num) {
        if (smallnums.size()!=bignums.size()) {
            smallnums.add(num);
            bignums.add(smallnums.poll());
        } else {
            bignums.add(num);
            smallnums.add(bignums.poll());
        }
    }

    public double findMedian() {
        return smallnums.size()>bignums.size()?smallnums.peek():(smallnums.peek()+ bignums.peek())/2.0;
    }
}

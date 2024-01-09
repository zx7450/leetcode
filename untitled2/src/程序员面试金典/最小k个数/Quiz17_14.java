package 程序员面试金典.最小k个数;

import java.util.PriorityQueue;

/**
 * @author zx
 * @date 2024/1/9 15:10
 */
public class Quiz17_14 {
    public static int[] smallestK(int[] arr, int k) {
        int n = arr.length;
        if (k == 0) return new int[0];
        else if (k == n) return arr;
        PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> (y - x));
        for (int i = 0; i < n; i++) {
            if (queue.size() < k) queue.add(arr[i]);
            else {
                if (arr[i] >= queue.peek()) continue;
                else {
                    queue.poll();
                    queue.add(arr[i]);
                }
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = queue.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = smallestK(new int[]{1, 2, 3}, 0);
        for (int an : ans) {
            System.out.println(an + " ");
        }
    }
}

package 每日一题.移除石子使总数最小;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author zx
 * @date 2024/1/3 10:03
 */
public class Quiz1962 {
    public static int minStoneSum(int[] piles, int k) {
        if (piles.length == 1) {
            for (int i = 0; i < k; i++) {
                piles[0] -= piles[0] / 2;
            }
            return piles[0];
        }
        PriorityQueue<Integer> pilesque = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int pile : piles) {
            pilesque.add(pile);
        }
        for (int i = 0; i < k; i++) {
            int pile = pilesque.poll();
            pile -= pile / 2;
            pilesque.add(pile);
        }
        int ans = 0;
        while (!pilesque.isEmpty()) ans += pilesque.poll();
        return ans;
    }

    public static void main(String[] args) {
        int[] piles = new int[]{5, 4, 9};
        System.out.println(minStoneSum(piles, 2));
    }
}

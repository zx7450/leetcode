package 贪心算法.根据身高重建队列;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2021/11/06 15:21
 */
public class Quiz406 {
    public static int[][] reconstructQueue(int[][] people) {
        // 身高从大到小排（身高相同k小的站前面）
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });
        LinkedList<int[]> que = new LinkedList<>();

        for (int[] p : people) {
            que.add(p[1], p);   //Linkedlist.add(index, value)，會將value插入到指定index裡。
        }

        return que.toArray(new int[people.length][]);
    }

    public static void main(String[] args) {
        int[][] people = new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        System.out.println(reconstructQueue(people));
    }
}

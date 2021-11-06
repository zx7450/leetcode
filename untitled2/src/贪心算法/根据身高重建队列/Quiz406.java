package 贪心算法.根据身高重建队列;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2021/11/06 15:21
 */
public class Quiz406 {
    public int[][] reconstructQueue(int[][] people) {
        // 身高从大到小排（身高相同k小的站前面）
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });
        LinkedList<int[]> queue=new LinkedList<>();
        for (int[] temp:people)
            queue.add(temp[1],temp);//当我们放入第 i 个人时，只需要将其插入队列中，使得他的前面恰好有temp[1]个人即可。
        return queue.toArray(new int[people.length][2]);
    }
}

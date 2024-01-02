package 贪心算法.Dota2参议院;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2023/12/29 15:11
 */
public class Quiz649 {
    //法一：字符串直接模拟
//    public static String predictPartyVictory(String senate) {
//        int n = senate.length();
//        if (n < 3) {
//            return senate.charAt(0) == 'R' ? "Radiant" : "Dire";
//        }
//        int i = 0;
//        StringBuilder stringBuilder = new StringBuilder(senate);
//        while (n > 1) {
//            int j = (i == n - 1 ? 0 : i + 1);
//            while (stringBuilder.charAt(i) == stringBuilder.charAt(j) && j != i) {
//                j++;
//                if (j == n) j = 0;
//            }
//            if (j == i) return stringBuilder.charAt(i) == 'R' ? "Radiant" : "Dire";
//            stringBuilder.deleteCharAt(j);
//            if (j<i) {
//                i--;
//            }
//            n--;
//            i = (i == n - 1 ? 0 : i + 1);
//        }
//        return stringBuilder.charAt(i) == 'R' ? "Radiant" : "Dire";
//    }

    //法二：贪心+双队列
    public static String predictPartyVictory(String senate) {
        int n = senate.length();
        if (n < 3) {
            return senate.charAt(0) == 'R' ? "Radiant" : "Dire";
        }
        Queue<Integer> radientque = new LinkedList<>();
        Queue<Integer> direque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') radientque.add(i);
            else direque.add(i);
        }
        while (!radientque.isEmpty() && !direque.isEmpty()) {
            int r = radientque.poll(), d = direque.poll();
            if (r < d) radientque.add(r + n);
            else direque.add(d + n);
        }
        if (radientque.isEmpty()) return "Dire";
        else return "Radiant";
    }

    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RDD"));
    }
}

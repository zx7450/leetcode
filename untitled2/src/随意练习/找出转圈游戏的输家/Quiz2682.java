package 随意练习.找出转圈游戏的输家;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2024/1/8 10:00
 */
public class Quiz2682 {
    public static int[] circularGameLosers(int n, int k) {
        boolean[] hasreached = new boolean[n];
        int currpos = 0;
        int i = 0;
        while (true) {
            currpos = (currpos + (i++) * k) % n;
            if (hasreached[currpos]) break;
            hasreached[currpos] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (!hasreached[j]) ans.add(j + 1);
        }
        int[] res = new int[ans.size()];
        for (int j = 0; j < ans.size(); j++) {
            res[j] = ans.get(j);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(circularGameLosers(5, 2));
    }
}

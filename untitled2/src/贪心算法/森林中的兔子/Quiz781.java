package 贪心算法.森林中的兔子;

import java.util.Arrays;

/**
 * @author zx
 * @date 2024/1/26 16:55
 */
public class Quiz781 {
    public static int numRabbits(int[] answers) {
        int n = answers.length;
        if (n == 1)
            return answers[0] + 1;
        Arrays.sort(answers);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (answers[i] == 0) {
                ans++;
                continue;
            }
            int answer = answers[i];
            ans += answers[i] + 1;
            int j = i;
            while (j < n && answers[j] == answer && j <= answers[i] + i)
                j++;
            if (j >= n)
                break;
            i = --j;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] answers = new int[]{1, 1, 2};
        System.out.println(numRabbits(answers));
    }
}

package 贪心算法.分发糖果;

/**
 * @author zx
 * @date 2021/11/06 10:30
 */
public class Quiz135 {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if (n == 1)
            return 1;
        else if (n == 2)
            return ratings[0] == ratings[1] ? 2 : 3;
        int[] candy = new int[n];
        candy[0] = 1;
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1])
                candy[i] = candy[i - 1] + 1;
            else
                candy[i] = 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1])
                if (candy[i] <= candy[i + 1])
                    candy[i] = candy[i + 1] + 1;
        }
        int sum = 0;
        for (int i : candy) {
            sum += i;
        }
        return sum;
    }
}

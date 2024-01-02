package 贪心算法.种花问题;

/**
 * @author zx
 * @date 2023/12/29 11:35
 */
public class Quiz605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        int i = 0;
        while (i < flowerbed.length  && n > 0) {
            if (flowerbed[i] == 1) {
                i += 2;
                continue;
            } else {
                if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                    n--;
                    i += 2;
                } else i++;
            }
        }
        if (n == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = new int[]{1, 0, 0, 0, 1, 0, 0};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, 2));
    }
}

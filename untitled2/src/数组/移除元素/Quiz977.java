package 数组.移除元素;

public class Quiz977 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int negpos = -1;
        for (int i = 0; i < n; i++) {//找到最后一个负数的位置
            if (nums[i] < 0) {
                negpos = i;
            } else
                break;
        }
        int index = 0;//平方数组需要存储元素的下标
        int i = negpos;//负数部分
        int j = negpos + 1;//非负数部分
        int[] ans = new int[n];
        while (i >= 0 || j < n) {
            if (i < 0) {//说明其余部分已经没有负数
                ans[index] = nums[j] * nums[j];
                j++;
            } else if (j == n) {//说明其余部分已经没有正数
                ans[index] = nums[i] * nums[i];
                i--;
            } else if (nums[i] * nums[i] > nums[j] * nums[j]) {//负数的平方大于正数，此处不用绝对值函数会加快执行时间
                ans[index] = nums[j] * nums[j];
                j++;
            } else {//正数的绝对值大于负数
                ans[index] = nums[i] * nums[i];
                i--;
            }
            index++;
        }
        return ans;
    }
}

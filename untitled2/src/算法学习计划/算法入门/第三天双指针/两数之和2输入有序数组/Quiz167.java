package 算法学习计划.算法入门.第三天双指针.两数之和2输入有序数组;

/**
 * @author zx
 * @date 2021/12/15 9:55
 */
public class Quiz167 {
    public int[] twoSum(int[] numbers, int target) {
        int numlen=numbers.length;
        if (numlen==2)
            return new int[]{1,2};
        int left=0;
        int right=numlen-1;
        while (left<right) {
            if (numbers[left]+numbers[right]==target)
                return new int[]{left+1,right+1};
            else if (numbers[left]+numbers[right]<target)
                left++;
            else
                right--;
        }
        return new int[2];
    }
}

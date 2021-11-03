package 贪心算法.摆动序列;

/**
 * @author zx
 * @date 2021/11/03 10:46
 */
public class Quiz376 {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length==1)
            return 1;
        int maxlength=1;
        boolean posflag=true;
        boolean firststart=true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[i-1])
                continue;
            else {
                if (firststart==true) {
                    posflag = nums[i] > nums[i - 1] ? true : false;
                    firststart = false;
                    maxlength++;
                }
                else {
                    if (nums[i]>nums[i-1]&&posflag==false) {
                        maxlength++;
                        posflag=true;
                    } else if (nums[i]<nums[i-1]&&posflag==true) {
                        maxlength++;
                        posflag=false;
                    } else
                        continue;
                }
            }
        }
        return maxlength;
    }
}

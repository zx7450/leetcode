package 数组.移除元素;

public class Quiz283 {
    public void moveZeroes(int[] nums) {
        int fast=0;
        int slow=0;
        while (fast<nums.length){
            if(nums[slow]==0)
                if (nums[fast]==0)
                    fast++;
                else {
                    nums[slow]=nums[fast];
                    nums[fast]=0;
                    slow++;
                    fast++;
                }
            else {
                slow++;
                fast++;
            }
        }
    }
}

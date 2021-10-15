package 数组.移除元素;

public class Quiz26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0)
            return 0;
        else if (nums.length==1)
            return 1;
        int fast=1;
        int slow=0;
        int n=nums.length-1;
        int delenum=0;
        while (fast<=n){
            if (nums[slow]==nums[fast]){
                nums[fast]=10001;
                fast++;
                delenum++;
                continue;
            }
            slow=fast;
            fast++;
        }
        for (int i = 0; i <= n; i++) {
            if (nums[i]==10001){
                for (int i1 = i; i1 <= n; i1++) {
                    if (nums[i1]!=10001) {
                        nums[i]=nums[i1];
                        nums[i1]=10001;
                        break;
                    }
                }
            }
        }
        return n-delenum+1;
    }
}

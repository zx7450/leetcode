package 剑指offer第二版.数组中的逆序对;

/**
 * @author zx
 * @date 2022/3/3 9:30
 */
public class Quiz51 {
    int[] nums,tmp;
    public int reversePairs(int[] nums) {
        this.nums=nums;
        tmp=new int[nums.length];
        return mergeSort(0, nums.length-1);
    }

    public int mergeSort(int l,int r) {
        //终止条件
        if (l>=r) return 0;
        //递归划分
        int mid=(l+r)>>1;
        int res=mergeSort(l,mid)+mergeSort(mid+1,r);
        //合并
        int i=l,j=mid+1;//i,j分别指向已经排好序的左右两个子数组的首个元素位置
        for (int k = l; k <= r; k++) {//将l,r区间内元素放至辅助数组
            tmp[k]=nums[k];
        }
        for (int k = l; k <= r; k++) {
            if (i==mid+1)//说明左子数组已经完成合并
                nums[k]=tmp[j++];
            else if (j==r+1||tmp[i]<=tmp[j])
                nums[k]=tmp[i++];
            else {//说明存在mid-i+1个逆序数
                nums[k]=tmp[j++];
                res+=mid-i+1;
            }
        }
        return res;
    }
}

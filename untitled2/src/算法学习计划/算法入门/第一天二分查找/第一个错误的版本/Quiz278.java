package 算法学习计划.算法入门.第一天二分查找.第一个错误的版本;

/**
 * @author zx
 * @date 2021/12/13 16:05
 */
public class Quiz278 {
    public boolean isBadVersion(int version){//只是为了提供接口，实际由题目提供，不是这样实现
        return true;
    }
    public int firstBadVersion(int n) {
        if (n==1)
            return 1;
        int left=1;
        int right=n;
        while (left<right) {// 循环直至区间左右端点相同
            int mid=left + (right - left) / 2;
            if (isBadVersion(mid)==false)
                left=mid+1;// 答案在区间 [mid+1, right] 中
            else
                right=mid;// 答案在区间 [left, mid] 中
        }
        return left;
    }
}

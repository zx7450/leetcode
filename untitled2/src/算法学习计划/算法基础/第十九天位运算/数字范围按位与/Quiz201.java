package 算法学习计划.算法基础.第十九天位运算.数字范围按位与;

/**
 * @author zx
 * @date 2022/1/26 0:44
 */
public class Quiz201 {
    public int rangeBitwiseAnd(int left, int right) {//思路：对区间上下限通过右移取公共前缀，当上限等于下限时再左移相应的次数
        if (left==right)
            return left;
        int shift=0;
        while (left<right) {
            left>>=1;
            right>>=1;
            shift++;
        }
        return left<<shift;
    }
}

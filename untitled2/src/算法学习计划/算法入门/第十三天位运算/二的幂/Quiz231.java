package 算法学习计划.算法入门.第十三天位运算.二的幂;

/**
 * @author zx
 * @date 2021/12/25 9:25
 */
public class Quiz231 {
//    public boolean isPowerOfTwo(int n) {//循环法
//        if (n<=0)
//            return false;
//        else if (n==1)
//            return true;
//        while (n%2==0) {
//            n/=2;
//            if (n==1)
//                return true;
//        }
//        return false;
//    }

    public boolean isPowerOfTwo(int n) {//位运算
        return n>0&&(n&(n-1))==0;
    }
}

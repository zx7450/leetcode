package 剑指offer第二版.前n项和;

/**
 * @author zx
 * @date 2022/3/11 10:19
 */
public class Quiz64 {
    public int sumNums(int n) {//递归计算+逻辑符号短路（若其中一个条件不满足则不执行另一个操作）
        boolean x=n>1&&(n+=sumNums(n-1))>0;//后一个大于0无实际意义，仅用于计算结果，主要用前面的n>1来终止递归
        return n;
    }
}

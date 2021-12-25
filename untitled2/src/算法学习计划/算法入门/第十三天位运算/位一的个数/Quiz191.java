package 算法学习计划.算法入门.第十三天位运算.位一的个数;

/**
 * @author zx
 * @date 2021/12/25 9:53
 */
public class Quiz191 {
    public int hammingWeight(int n) {
        int num=0;
        for (int i = 0; i < 32; i++) {//当检查第i位时，让n与2^i进行与运算，当且仅当n的第i位为1时，运算结果不为0。
            if ((n&(1<<i))!=0)
                num++;
        }
        return num;
    }
}

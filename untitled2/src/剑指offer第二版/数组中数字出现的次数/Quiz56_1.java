package 剑指offer第二版.数组中数字出现的次数;

import java.util.Arrays;

/**
 * @author zx
 * @date 2022/3/7 9:11
 */
public class Quiz56_1 {
    public int[] singleNumbers(int[] nums) {
        int x=0,y=0,m=1,n=0;
        for (int num:nums)
            n^=num;//对所有数进行异或
        while ((n&m)==0)
            m<<=1;//找到异或结果中第一个不为0的位
        for (int num:nums) {//根据该位为0和不为0划分为两个子数组，子数组内分别进行异或运算，最后得出的x,y即为仅出现过一次的数
            if ((num&m)==0) x^=num;
            else y^=num;
        }
        return new int[]{x,y};
    }
}

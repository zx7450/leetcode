package 剑指offer第二版.不用加减乘除做加法;

/**
 * @author zx
 * @date 2022/3/14 9:36
 */
public class Quiz65 {
    public int add(int a, int b) {
        while (b!=0) {//当进位为0时跳出
            int c=(a&b)<<1;//c=进位
            a^=b;//非进位和
            b=c;//b=进位
        }
        return a;
    }
}

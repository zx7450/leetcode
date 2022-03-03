package 每日一题.各位相加;

/**
 * @author zx
 * @date 2022/3/3 9:09
 */
public class Quiz258 {
//    public int addDigits(int num) {//模拟
//        if (num<10)
//            return num;
//        int ans=0;
//        while (true) {
//            while (num!=0) {
//                ans+=num%10;
//                num/=10;
//            }
//            if (ans<10)
//                break;
//            num=ans;
//            ans=0;
//        }
//        return ans;
//    }

    public int addDigits(int num) {//规律，数根9个一组，1-9循环出现
        return (num-1)%9+1;
    }
}

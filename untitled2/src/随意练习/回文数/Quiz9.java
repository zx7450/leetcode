package 随意练习.回文数;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2023/12/29 10:04
 */
public class Quiz9 {
    //法1：转字符串
//    public boolean isPalindrome(int x) {
//        if (x < 0) return false;
//        else if (x < 10) return true;
//        String xcode = String.valueOf(x);
//        int i = 0, j = xcode.length() - 1;
//        while (i <= j) {
//            if (xcode.charAt(i) != xcode.charAt(j)) return false;
//            i++;
//            j--;
//        }
//        return true;
//    }

    //法二：逐位取余
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else if (x < 10) return true;
        else if (x % 10 == 0) return false;
//        List<Integer> xlist = new ArrayList<>();
//        for (; x != 0; x /= 10) {
//            xlist.add(x % 10);
//        }
//        int i = 0, j = xlist.size() - 1;
//        while (i <= j) {
//            if (xlist.get(i) != xlist.get(j)) return false;
//            i++;
//            j--;
//        }
//        return true;
        //可以不用数组
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return x == reverse || x == reverse / 10;
    }
}

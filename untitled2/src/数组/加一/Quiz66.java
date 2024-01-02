package 数组.加一;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author zx
 * @date 2024/1/2 16:23
 */
public class Quiz66 {
    //法1：模拟
//    public int[] plusOne(int[] digits) {
//        int len = digits.length;
//        if (len == 1) {
//            if (digits[0] != 9) {
//                digits[0]++;
//                return digits;
//            } else return new int[]{1, 0};
//        }
//        Deque<Integer> ans = new ArrayDeque<>();
//        boolean addflag = true;
//        int i = len - 1;
//        while (i >= 0 && addflag) {
//            digits[i]++;
//            if (digits[i] == 10) {
//                digits[i] = 0;
//            } else {
//                addflag = false;
//            }
//            ans.addFirst(digits[i--]);
//        }
//        if (addflag) {
//            ans.addFirst(1);
//        } else {
//            while (i > -1) {
//                ans.addFirst(digits[i--]);
//            }
//        }
//        int n = ans.size();
//        int[] res = new int[n];
//        for (int j = 0; j < n; j++) {
//            res[j] = ans.poll();
//        }
//        return res;
//    }
    //法2：找出最长的后缀9
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if (len == 1) {
            if (digits[0] != 9) {
                digits[0]++;
                return digits;
            } else return new int[]{1, 0};
        }
        int i = len - 1, sublen = 0;
        while (i >= 0) {
            if (digits[i] == 9) {
                sublen++;
                digits[i--] = 0;
            } else {
                digits[i]++;
                break;
            }
        }
        if (sublen == len) {
            int[] ans = new int[len + 1];
            ans[0] = 1;
            return ans;
        } else {
            return digits;
        }
    }

}

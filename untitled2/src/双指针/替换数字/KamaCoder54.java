package 双指针.替换数字;

import java.util.*;

/**
 * @author zx
 * @date 2024/2/8 22:49
 */
public class KamaCoder54 {
    public static String replaceNumber(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                ans.append("number");
            } else
                ans.append(c);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(replaceNumber(s));
    }
}

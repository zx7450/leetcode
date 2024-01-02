package 字符串.最后一个单词的长度;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author zx
 * @date 2024/1/2 16:00
 */
public class Quiz58 {
    //法一：一次遍历
//    public static int lengthOfLastWord(String s) {
//        int len = s.length();
//        if (len == 1) return s.charAt(0) == ' ' ? 0 : 1;
//        int currlen = 0;
//        Deque<Integer> wordlen = new ArrayDeque<>();
//        for (int i = 0; i < len; i++) {
//            if (s.charAt(i) == ' ') {
//                if (currlen == 0) continue;
//                else {
//                    wordlen.add(currlen);
//                    currlen = 0;
//                }
//            } else currlen++;
//        }
//        if (currlen != 0) wordlen.add(currlen);
//        return wordlen.pollLast();
//    }

    //法2:split
//    public static int lengthOfLastWord(String s) {
//        int len = s.length();
//        if (len == 1) return s.charAt(0) == ' ' ? 0 : 1;
//        int currlen = 0;
//        String[] words = s.split(" ");
//        return words[words.length - 1].length();
//    }

    //法3：反向遍历
    public static int lengthOfLastWord(String s) {
        int len = s.length();
        if (len == 1) return s.charAt(0) == ' ' ? 0 : 1;
        int ans = 0;
        boolean canEnd = false;
        int i = len - 1;
        while (i >= 0) {
            if (s.charAt(i) != ' ') {
                ans++;
                canEnd = true;
            } else {
                if (canEnd) break;
            }
            i--;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}

package 算法学习计划.算法入门.第六天滑动窗口.无重复字符的最长子串;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zx
 * @date 2021/12/18 9:13
 */
public class Quiz3 {
    //    public int lengthOfLongestSubstring(String s) {
//        int slen=s.length();
//        if (slen==0)
//            return 0;
//        else if (slen==1)
//            return 1;
//        HashSet<Character> chars=new HashSet<>();
//        int start=0,end=0;
//        int ans=0;
//        int sublenth=0;
//        while (end<slen) {
//            char c=s.charAt(end);
//            if (!chars.contains(c)) {
//                chars.add(c);
//                sublenth++;
//                end++;
//            } else {
//                if (sublenth>ans)
//                    ans=sublenth;
//                while (chars.contains(c)) {
//                    chars.remove(s.charAt(start));
//                    start++;
//                    sublenth--;
//                }
//            }
//        }
//        if (sublenth>ans)
//            ans=sublenth;
//        return ans;
//    }
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int n = s.length();
        int j = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (j + 1 < n && !set.contains(s.charAt(j + 1))) {
                set.add(s.charAt(j + 1));
                ++j;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}

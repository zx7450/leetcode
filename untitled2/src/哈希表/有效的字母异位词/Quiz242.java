package 哈希表.有效的字母异位词;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Quiz242 {
    public boolean isAnagram(String s, String t) {
        int sl = s.length(), tl = t.length();
        if (sl != tl)
            return false;
        int[] occurs = new int[26];
        for (int i = 0; i < sl; i++) {
            occurs[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < tl; i++) {
            if (occurs[t.charAt(i) - 'a'] == 0)
                return false;
            occurs[t.charAt(i) - 'a']--;
        }
        return true;
    }
}

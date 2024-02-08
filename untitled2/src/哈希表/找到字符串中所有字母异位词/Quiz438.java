package 哈希表.找到字符串中所有字母异位词;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2024/2/7 17:15
 */
public class Quiz438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int slen = s.length(), plen = p.length();
        if (slen < plen)
            return ans;
        int[] socc = new int[26], pocc = new int[26];
        for (int i = 0; i < plen; i++) {
            socc[s.charAt(i) - 'a']++;
            pocc[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(socc, pocc))
            ans.add(0);
        for (int i = 0; i < slen - plen; i++) {
            socc[s.charAt(i) - 'a']--;
            socc[s.charAt(i + plen) - 'a']++;
            if (Arrays.equals(socc, pocc))
                ans.add(i + 1);
        }
        return ans;
    }
}

package 算法学习计划.算法基础.第五天滑动窗口.找到字符串中所有字母异位词;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2022/1/4 10:26
 */
public class Quiz438 {
    public List<Integer> findAnagrams(String s, String p) {//思路：构造一个长度为与字符串p相同的滑动窗口，并维护其中每种字母的数量
        int slen=s.length(),plen=p.length();
        List<Integer> ans=new ArrayList<>();
        if (slen<plen)
            return ans;
        int[] schar=new int[26];
        int[] pchar=new int[26];
        for (int i = 0; i < plen; i++) {
            schar[s.charAt(i)-'a']++;
            pchar[p.charAt(i)-'a']++;
        }
        if (Arrays.equals(schar,pchar))
            ans.add(0);
        for (int i = 0; i < slen - plen; i++) {
            schar[s.charAt(i)-'a']--;
            schar[s.charAt(i+plen)-'a']++;
            if (Arrays.equals(schar,pchar))
                ans.add(i+1);
        }
        return ans;
    }
}

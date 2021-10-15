package 哈希表.有效的字母异位词;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Quiz438 {
    public List<Integer> findAnagrams(String s, String p) {
        int[] charp=new int[26];
        int[] chars=new int[26];
        int sl=s.length();
        int pl=p.length();
        if (sl<pl)
            return new ArrayList<Integer>();
        List<Integer> ans=new ArrayList<Integer>();
        for (int i = 0; i < pl; i++) {
            chars[s.charAt(i)-'a']++;
            charp[p.charAt(i)-'a']++;
        }
        if (Arrays.equals(charp,chars))
            ans.add(0);
        for (int i = pl; i < sl; i++) {
            chars[s.charAt(i-pl)-'a']--;
            chars[s.charAt(i)-'a']++;
            if (Arrays.equals(chars,charp))
                ans.add(i-pl+1);
        }
        return ans;
    }
}

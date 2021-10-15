package 哈希表.有效的字母异位词;

import java.util.HashMap;

public class Quiz242 {
    public boolean isAnagram(String s, String t) {
        int sl=s.length();
        int tl=t.length();
        if (sl!=tl)
            return false;
        else if (sl==tl&&sl==1)
            if (s.equals(t))
                return true;
            else
                return false;
        HashMap<Character,Integer> charnum=new HashMap<Character,Integer>();
        for (int i = 0; i < tl; i++) {
            char ch=t.charAt(i);
            charnum.put(ch,charnum.getOrDefault(ch,0)+1);
        }
        for (int i = 0; i < sl; i++) {
            char ch=s.charAt(i);
            charnum.put(ch,charnum.getOrDefault(ch,0)-1);
            if (charnum.get(ch)<0)
                return false;
        }
        return true;
    }
}

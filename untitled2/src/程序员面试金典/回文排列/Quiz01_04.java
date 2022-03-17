package 程序员面试金典.回文排列;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zx
 * @date 2022/3/17 9:39
 */
public class Quiz01_04 {
    public boolean canPermutePalindrome(String s) {
        int slen=s.length();
        if (slen<2)
            return true;
        Set<Character> hasoccur=new HashSet<>();
        for (int i = 0; i < slen; i++) {
            char c=s.charAt(i);
            if (!hasoccur.contains(c))
                hasoccur.add(c);
            else
                hasoccur.remove(c);
        }
        if (slen%2==0)
            return hasoccur.size()==0?true:false;
        else
            return hasoccur.size()==1?true:false;
    }
}

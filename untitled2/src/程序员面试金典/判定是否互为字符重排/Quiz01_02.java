package 程序员面试金典.判定是否互为字符重排;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zx
 * @date 2022/3/16 9:44
 */
public class Quiz01_02 {
    public boolean CheckPermutation(String s1, String s2) {
        int s1len=s1.length(),s2len=s2.length();
        if (s1len!=s2len)
            return false;
        Map<Character,Integer> charofs1=new HashMap<>();
        for (int i = 0; i < s1len; i++) {
            charofs1.put(s1.charAt(i), charofs1.getOrDefault(s1.charAt(i),0)+1);
        }
        for (int i = 0; i < s2len; i++) {
            charofs1.put(s2.charAt(i), charofs1.getOrDefault(s2.charAt(i),0)-1);
            if (charofs1.get(s2.charAt(i))<0)
                return false;
        }
        return true;
    }
}

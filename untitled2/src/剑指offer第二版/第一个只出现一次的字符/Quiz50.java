package 剑指offer第二版.第一个只出现一次的字符;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zx
 * @date 2022/3/2 10:11
 */
public class Quiz50 {
//    public char firstUniqChar(String s) {//哈希表
//        int slen=s.length();
//        if (slen==0)
//            return ' ';
//        else if (slen==1)
//            return s.charAt(0);
//        Map<Character,Integer> frq=new HashMap<>();
//        for (int i = 0; i < slen; i++) {
//            frq.put(s.charAt(i),frq.getOrDefault(s.charAt(i),0)+1);
//        }
//        for (int i = 0; i < slen; i++) {
//            if (frq.get(s.charAt(i))==1)
//                return s.charAt(i);
//        }
//        return ' ';
//    }

    public char firstUniqChar(String s) {//有序哈希表，即线性哈希表，特点是可以按照插入顺序排序
        int slen=s.length();
        if (slen==0)
            return ' ';
        else if (slen==1)
            return s.charAt(0);
        Map<Character,Boolean> hasouucr=new LinkedHashMap<>();
        char[] charofs=s.toCharArray();
        for (char c:charofs) {
            hasouucr.put(c,!hasouucr.containsKey(c));
        }
        for (Map.Entry<Character,Boolean> occ:hasouucr.entrySet()) {
            if (occ.getValue()) return occ.getKey();
        }
        return ' ';
    }
}

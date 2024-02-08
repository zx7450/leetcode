package 哈希表.字母异位词分组;

import java.util.*;

/**
 * @author zx
 * @date 2024/2/7 13:33
 */
public class Quiz49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anamap = new HashMap<>();
        for (String str : strs) {
            char[] charsofstr = str.toCharArray();
            Arrays.sort(charsofstr);
            String ana = new String(charsofstr);
            List<String> analist = anamap.getOrDefault(ana, new ArrayList<>());
            analist.add(str);
            anamap.put(ana, analist);
        }
        return new ArrayList<>(anamap.values());
    }
}

package 每日一题.词典中最长的单词;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zx
 * @date 2022/3/17 9:01
 */
public class Quiz720 {
    public String longestWord(String[] words) {
        Arrays.sort(words,(a,b)->{
            if (a.length()!=b.length())
                return a.length()-b.length();
            else
                return b.compareTo(a);
        });
        String ans="";
        Set<String> strings=new HashSet<>();
        strings.add("");
        for (int i = 0; i < words.length; i++) {
            String word=words[i];
            if (strings.contains(word.substring(0,word.length()-1))){
                strings.add(word);
                ans=word;
            }
        }
        return ans;
    }
}

package 回溯算法.电话号码的字母组合;

import java.util.ArrayList;
import java.util.List;

public class Quiz17 {
    String[] letterMap = {
            "", // 0
            "", // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz", // 9
    };
    StringBuilder stringBuilder=new StringBuilder();
    List<String> result=new ArrayList<String>();
    public List<String> letterCombinations(String digits) {
        if (digits.length()==0)
            return result;
        backtracing(digits,0);
        return result;
    }
    public void backtracing(String digits,int position) {
        if (position==digits.length()) {
            result.add(stringBuilder.toString());
            return;
        }
        int flag=digits.charAt(position)-'0';
        for (int i = 0; i < letterMap[flag].length(); i++) {
            stringBuilder.append(letterMap[flag].charAt(i));
            backtracing(digits,position+1);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}

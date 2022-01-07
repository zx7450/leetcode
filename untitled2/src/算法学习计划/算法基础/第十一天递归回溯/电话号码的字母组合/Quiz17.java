package 算法学习计划.算法基础.第十一天递归回溯.电话号码的字母组合;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2022/1/7 16:19
 */
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
    List<String> res=new ArrayList<>();
    StringBuilder path=new StringBuilder();
    int diglen;
    public List<String> letterCombinations(String digits) {
        diglen=digits.length();
        if (digits.length()==0)
            return res;
        backtracing(digits,0);
        return res;
    }

    public void backtracing(String digits,int start) {
        if (start==diglen) {
            res.add(path.toString());
            return;
        }
        int flag=digits.charAt(start)-'0';
        for (int i = 0; i < letterMap[flag].length(); i++) {
            path.append(letterMap[flag].charAt(i));
            backtracing(digits,start+1);
            path.deleteCharAt(path.length()-1);
        }
    }
}

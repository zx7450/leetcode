package 回溯算法.电话号码的字母组合;

import java.util.ArrayList;
import java.util.List;

public class Quiz17 {
    final String[] letterMap = {
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
    List<String> ans;
    StringBuilder path;

    int n;

    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        n = digits.length();
        if (n == 0)
            return ans;
        path = new StringBuilder();
        backtracing(digits, 0);
        return ans;
    }

    public void backtracing(String digits, int flag) {
        if (flag == n) {
            ans.add(path.toString());
            return;
        }
        int num = digits.charAt(flag) - '0';
        for (int i = 0; i < letterMap[num].length(); i++) {
            path.append(letterMap[num].charAt(i));
            backtracing(digits, flag + 1);
            path.deleteCharAt(path.length() - 1);
        }
    }
}

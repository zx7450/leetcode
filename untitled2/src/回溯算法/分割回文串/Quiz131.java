package 回溯算法.分割回文串;

import java.util.ArrayList;
import java.util.List;

public class Quiz131 {
    List<String> path;
    List<List<String>> result;
    int n;

    public List<List<String>> partition(String s) {
        path = new ArrayList<>();
        result = new ArrayList<>();
        n = s.length();
        if (n == 1) {
            path.add(s);
            result.add(new ArrayList<>(path));
            return result;
        }
        backtracing(s, 0);
        return result;
    }

    public void backtracing(String s, int l) {
        if (l == n) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = l; i < n; i++) {
            if (check(s, l, i)) {
                path.add(s.substring(l, i + 1));
                backtracing(s, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }

    public boolean check(String s, int l, int r) {
        if (l == r)
            return true;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--))
                return false;
        }
        return true;
    }

}

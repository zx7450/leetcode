package 程序员面试金典.汉诺塔问题;

import java.util.List;

/**
 * @author zx
 * @date 2022/4/22 8:59
 */
public class Quiz08_06 {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        moveplates(A, B, C, A.size());
    }

    public void moveplates(List<Integer> source, List<Integer> temp, List<Integer> target, int n) {
        if (n == 1) {
            target.add(source.remove(source.size() - 1));
            return;
        }
        moveplates(source, target, temp, n - 1);
        target.add(source.remove(source.size() - 1));
        moveplates(temp, source, target, n - 1);
    }
}

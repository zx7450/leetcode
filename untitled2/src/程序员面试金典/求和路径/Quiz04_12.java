package 程序员面试金典.求和路径;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zx
 * @date 2022/4/19 9:44
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Quiz04_12 {
    //    int ans=0;
//    public int pathSum(TreeNode root, int sum) {//暴搜
//        if (root == null)
//            return 0;
//        rootsum(root, sum);
//        pathSum(root.left, sum);
//        pathSum(root.right, sum);
//        return ans;
//    }
//
//    public void rootsum(TreeNode root, int sum) {
//        if (root == null)
//            return;
//        int val = root.val;
//        if (val == sum)
//            ans++;
//        rootsum(root.left, sum - val);
//        rootsum(root.right, sum - val);
//    }
    Map<Integer, Integer> presum;

    public int pathSum(TreeNode root, int sum) {
        presum = new HashMap<>();
        presum.put(0, 1);
        return dfs(root, 0, sum);
    }

    public int dfs(TreeNode root, int curr, int sum) {
        if (root == null)
            return 0;
        curr += root.val;
        int ans = presum.getOrDefault(curr - sum, 0);
        presum.put(curr, presum.getOrDefault(curr, 0) + 1);
        ans += dfs(root.left, curr, sum);
        ans += dfs(root.right, curr, sum);
        presum.put(curr, presum.get(curr) - 1);
        return ans;
    }
}

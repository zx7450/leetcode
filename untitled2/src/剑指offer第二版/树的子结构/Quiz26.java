package 剑指offer第二版.树的子结构;

/**
 * @author zx
 * @date 2022/2/21 9:14
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Quiz26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A==null||B==null)
            return false;
        return dfs(A, B);
    }

    public boolean dfs(TreeNode A, TreeNode B) {
        if (A==null) return false;
        return Compare(A, B)||dfs(A.left,B)||dfs(A.right,B);
    }

    public boolean Compare(TreeNode A, TreeNode B) {
        if (A==null&&B==null) return true;
        else if (A==null&&B!=null) return false;
        else if (A!=null&&B==null) return true;
        else if (A.val!=B.val) return false;
        else return Compare(A.left,B.left)&&Compare(A.right,B.right);
    }
}

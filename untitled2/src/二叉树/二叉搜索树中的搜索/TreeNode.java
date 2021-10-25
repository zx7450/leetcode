package 二叉树.二叉搜索树中的搜索;

public class TreeNode {//Quiz700
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
//    public TreeNode searchBST(TreeNode root, int val) {//递归法
//        if (root==null) return null;
//        if (root.val==val) return root;
//        else if (root.val>val) return searchBST(root.left,val);
//        else return searchBST(root.right,val);
//    }
    public TreeNode searchBST(TreeNode root, int val) {//迭代法
        if (root==null) return null;
        while (root!=null){
            if (root.val==val) return root;
            else if (root.val>val) root=root.left;
            else  root=root.right;
        }
        return null;
    }
}

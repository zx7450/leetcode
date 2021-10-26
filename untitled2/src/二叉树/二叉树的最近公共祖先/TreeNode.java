package 二叉树.二叉树的最近公共祖先;

public class TreeNode {//Quiz236
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null||root==p||root==q) return root;//若找到p或q则直接返回，未找到返回null
        TreeNode left=lowestCommonAncestor(root.left,p,q);//在左子树找p,q
        TreeNode right=lowestCommonAncestor(root.right,p,q);//在右子树找p,q
        if (left!=null&&right!=null) return root;//左右都有值，说明p,q分别在两颗子树上，根据递归堆栈原理，此时返回的即为层数最深的公共祖先
        else if (left==null) return right;//如果左子树上未找到p,q，说明p,q在右子树中，返回右子树即可
        else return left;//同理，如果右子树上未找到p,q，说明p,q在左子树中，返回左子树即可
    }

}

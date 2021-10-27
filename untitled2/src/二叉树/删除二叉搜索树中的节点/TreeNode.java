package 二叉树.删除二叉搜索树中的节点;

public class TreeNode {//Quiz450
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

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root==null) return null;
        if (root.val==key){//
            if (root.left==null) return root.right;//左子树为空，返回右子树
            else if (root.right==null) return root.left;//右子树为空，返回左子树
            else {//左右子树都非空，则将要删除结点的左子树移动到其右子树的最左下位置
                TreeNode curr=root.right;
                while (curr.left!=null)
                    curr=curr.left;
                curr.left=root.left;
                root=root.right;
                return root;
            }
        }
        if (root.val<key) root.right=deleteNode(root.right,key);
        if (root.val>key) root.left=deleteNode(root.left,key);
        return root;
    }
}

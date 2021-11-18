package 动态规划.打家劫舍3;

public class TreeNode {//Quiz337
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

    public int rob(TreeNode root) {//树形dp
        if (root==null)
            return 0;
        else if (root.left==null&&root.right==null)
            return root.val;
        int[] res=treedp(root);
        return Math.max(res[0],res[1]);
    }

    public int[] treedp(TreeNode root) {
        int[] res=new int[2];//二位数组，下标为1代表抢该间房子，下为0代表不抢该间房子
        if (root==null) return res;//节点为空，无论抢还是不抢都为0
        int[] leftans=treedp(root.left);
        int[] rightans=treedp(root.right);
        res[0]=Math.max(leftans[0],leftans[1])+Math.max(rightans[0],rightans[1]);//不抢该房子，则其孩子节点房子可抢可不抢
        res[1]=leftans[0]+rightans[0]+root.val;//抢该房子，则求不抢子节点情况下的最大价值加上本节点的价值
        return res;
    }
}

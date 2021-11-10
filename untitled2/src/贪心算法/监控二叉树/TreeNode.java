package 贪心算法.监控二叉树;

/**
 * @author zx
 * @date 2021/11/10 9:26
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    int camaracount=0;

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

    public int minCameraCover(TreeNode root) {
        if (backtracing(root)==0)//根节点未被覆盖到，需单独判断
            camaracount++;
        return camaracount;
    }


    public int backtracing(TreeNode root) {//0表示该节点无覆盖，1表示该节点放置了摄像头，2表示该节点有被覆盖
        if (root==null) return 2;//空结点设为放置了摄像头，则叶子节点就可以不放，叶子节点的父节点放，符合贪心策略
        int left=backtracing(root.left);
        int right=backtracing(root.right);
        if (left==2&&right==2) return 0;//左右节点都被覆盖到，那么本节点未被覆盖，设置为0
        if (left==0||right==0) {//存在没有被覆盖到的左右节点，那么该节点必须放摄像头
            camaracount++;
            return 1;
        }
        if (left==1||right==1) return 2;//左右孩子至少有一个被放置了摄像头，该节点就又被覆盖到
        return -1;//这个返回没用，不会执行到这里，只是为了设置一个默认返回
    }
}

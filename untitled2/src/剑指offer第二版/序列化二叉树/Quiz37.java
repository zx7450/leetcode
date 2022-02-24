package 剑指offer第二版.序列化二叉树;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2022/2/24 9:42
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Quiz37 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return reserialize(root, "");
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] dataarray = data.split(",");
        List<String> datalist = new ArrayList<>(Arrays.asList(dataarray));
        return redeserialize(datalist);
    }

    public String reserialize(TreeNode root, String str) {
        if (root == null)
            str += "null,";
        else {
            str += str.valueOf(root.val) + ",";
            str = reserialize(root.left, str);
            str = reserialize(root.right, str);
        }
        return str;
    }

    public TreeNode redeserialize(List<String> datalist) {
        if (datalist.get(0).equals("null")) {
            datalist.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(datalist.get(0)));
        datalist.remove(0);
        root.left = redeserialize(datalist);
        root.right = redeserialize(datalist);
        return root;
    }
}

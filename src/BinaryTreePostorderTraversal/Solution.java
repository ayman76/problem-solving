package BinaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;


class TreeNode<T> {
    T val;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode() {
    }

    TreeNode(T val) {
        this.val = val;
    }

    TreeNode(T val, TreeNode<T> left, TreeNode<T> right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution<T> {
    public List<T> postorderTraversal(TreeNode<T> root) {
        List<T> order = new ArrayList<>();
        PostOrderTraversalHelper(root, order);
        return order;
    }

    private void PostOrderTraversalHelper(TreeNode<T> node, List<T> list) {
        if (node != null) {
            PostOrderTraversalHelper(node.left, list);
            PostOrderTraversalHelper(node.right, list);
            list.add(node.val);
        }
    }
}

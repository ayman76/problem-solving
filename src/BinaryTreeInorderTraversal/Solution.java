package BinaryTreeInorderTraversal;

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
    public List<T> inorderTraversal(TreeNode<T> root) {
        List<T> order = new ArrayList<>();
        inorderTraversalHelper(root, order);
        return order;
    }

    private void inorderTraversalHelper(TreeNode<T> node, List<T> list) {
        if (node != null) {
            inorderTraversalHelper(node.left, list);
            list.add(node.val);
            inorderTraversalHelper(node.right, list);
        }
    }
}

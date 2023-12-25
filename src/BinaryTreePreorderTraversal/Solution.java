package BinaryTreePreorderTraversal;

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
    public List<T> preOrderTraversal(TreeNode<T> root) {
        List<T> order = new ArrayList<>();
        preOrderTraversalHelper(root, order);
        return order;
    }

    private void preOrderTraversalHelper(TreeNode<T> node, List<T> list) {
        if (node != null) {
            list.add(node.val);
            preOrderTraversalHelper(node.left, list);
            preOrderTraversalHelper(node.right, list);
        }
    }
}

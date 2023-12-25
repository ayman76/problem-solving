package ConstructStringfromBinaryTree;

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
    public String tree2str(TreeNode<T> root) {
        StringBuilder result = new StringBuilder();
        preOrderTraversalHelper(root, result);
        return result.toString();
    }

    private void preOrderTraversalHelper(TreeNode node, StringBuilder result) {
        if (node == null) {
            return;
        }
        result.append(node.val);
        if (node.left != null || node.right != null) {
            result.append("(");
            preOrderTraversalHelper(node.left, result);
            result.append(")");
        }
        if (node.right != null) {
            result.append("(");
            preOrderTraversalHelper(node.right, result);
            result.append(")");
        }

    }
}
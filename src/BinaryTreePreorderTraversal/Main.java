package BinaryTreePreorderTraversal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.right = new TreeNode<>(2);
        root.right.left = new TreeNode<>(3);

        Solution<Integer> solution = new Solution<>();
        List<Integer> inOrderTraversal = solution.preOrderTraversal(root);

        System.out.println(inOrderTraversal);


        TreeNode<String> root1 = new TreeNode<>("F");
        root1.left = new TreeNode<>("B");
        root1.left.left = new TreeNode<>("A");
        root1.left.right = new TreeNode<>("D");
        root1.left.right.left = new TreeNode<>("C");
        root1.left.right.right = new TreeNode<>("E");
        root1.right = new TreeNode<>("G");
        root1.right.right = new TreeNode<>("I");
        root1.right.right.left = new TreeNode<>("H");

        Solution<String> solution1 = new Solution<>();
        List<String> inOrderTraversal1 = solution1.preOrderTraversal(root1);

        System.out.println(inOrderTraversal1);


    }
}

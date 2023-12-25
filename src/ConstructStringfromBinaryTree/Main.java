package ConstructStringfromBinaryTree;

public class Main {

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.right = new TreeNode<>(2);
        root.right.left = new TreeNode<>(3);

        Solution<Integer> solution = new Solution<>();
        String result = solution.tree2str(root);

        System.out.println(result);


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
        String result1 = solution1.tree2str(root1);

        System.out.println(result1);

        TreeNode<Integer> root2 = new TreeNode<>(1);
        root2.left = new TreeNode<>(2);
        root2.left.left = null;
        root2.left.right = new TreeNode<>(4);
        root2.right = new TreeNode<>(4);

        result = solution.tree2str(root2);
        System.out.println(result);


    }
}

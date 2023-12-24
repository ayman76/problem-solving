package SpecialPositionsinaBinaryMatrix;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Example matrices
        int[][] mat1 = {
                {1, 0, 0},
                {0, 0, 1},
                {1, 0, 0}
        };
        System.out.println("Example 1: " + solution.numSpecial(mat1)); // Output: 1

        int[][] mat2 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        System.out.println("Example 2: " + solution.numSpecial(mat2)); // Output: 3
    }
}

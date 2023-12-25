package TransposeMatrix;

import static TransposeMatrix.Solution.printMatrix;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Original Matrix 1:");
        printMatrix(matrix1);
        int[][] transposeMatrix1 = solution.transpose(matrix1);
        System.out.println("\nTranspose of Matrix 1:");
        printMatrix(transposeMatrix1);

        System.out.println("\nOriginal Matrix 2:");
        printMatrix(matrix2);
        int[][] transposeMatrix2 = solution.transpose(matrix2);
        System.out.println("\nTranspose of Matrix 2:");
        printMatrix(transposeMatrix2);
    }
}

package DifferenceBetweenOnesandZerosinRowandColumn;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid1 = {{0, 1, 1}, {1, 0, 1}, {0, 0, 1}};
        int[][] grid2 = {{1, 1, 1}, {1, 1, 1}};

        System.out.println("Input Grid 1:");
        solution.print2dArray(grid1);
        System.out.println("\nDifference Matrix 1:");
        solution.print2dArray(solution.onesMinusZeros(grid1));

        System.out.println("\nInput Grid 2:");
        solution.print2dArray(grid2);
        System.out.println("\nDifference Matrix 2:");
        solution.print2dArray(solution.onesMinusZeros(grid2));
    }
}

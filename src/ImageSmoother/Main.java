package ImageSmoother;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Example 1
        int[][] img1 = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[][] result1 = solution.imageSmoother(img1);
        solution.printMatrix(result1);

        // Example 2
        int[][] img2 = {
                {100, 200, 100},
                {200, 50, 200},
                {100, 200, 100}
        };
        int[][] result2 = solution.imageSmoother(img2);
        solution.printMatrix(result2);
    }
}

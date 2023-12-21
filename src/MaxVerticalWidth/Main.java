package MaxVerticalWidth;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] points1 = {{8, 7}, {9, 9}, {7, 4}, {9, 7}};
        System.out.println(solution.maxWidthOfVerticalArea1(points1));

        int[][] points2 = {{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}};
        System.out.println(solution.maxWidthOfVerticalArea1(points2)); // Output: 3
    }
}

package MinimumTimetoMakeRopeColorful;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String colors1 = "abaac";
        int[] neededTime1 = {1, 2, 3, 4, 5};
        System.out.println(solution.minCost(colors1, neededTime1)); // Output: 3

        String colors2 = "abc";
        int[] neededTime2 = {1, 2, 3};
        System.out.println(solution.minCost(colors2, neededTime2)); // Output: 0

        String colors3 = "aabaa";
        int[] neededTime3 = {1, 2, 3, 4, 1};
        System.out.println(solution.minCost(colors3, neededTime3)); // Output: 2
    }
}

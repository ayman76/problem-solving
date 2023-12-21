package BuyTwoChocolates;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        // Example 1
        int[] prices1 = {1, 2, 2};
        int money1 = 3;
        System.out.println("Example 1: " + solution.buyChoco(prices1, money1)); // Output: 0

        // Example 2
        int[] prices2 = {3, 2, 3};
        int money2 = 3;
        System.out.println("Example 2: " + solution.buyChoco(prices2, money2)); // Output: 3
    }
}

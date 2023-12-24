package ElementAppearingMoreThan25PercentInSortedArray;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] arr1 = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        int result1 = solution.findSpecialInteger(arr1);
        System.out.println("Example 1: " + result1); // Output: 6

        int[] arr2 = {1, 1};
        int result2 = solution.findSpecialInteger(arr2);
        System.out.println("Example 2: " + result2); // Output: 1
    }
}

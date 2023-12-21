package MaximumProductDifferenceBetweenTwoPairs;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Example 1
        int[] nums1 = {5, 6, 2, 7, 4};
        int result1 = solution.maxProductDifference(nums1);
        System.out.println("Example 1: " + result1); // Output: 34

        // Example 2
        int[] nums2 = {4, 2, 5, 9, 7, 4, 8};
        int result2 = solution.maxProductDifference(nums2);
        System.out.println("Example 2: " + result2); // Output: 64
    }
}

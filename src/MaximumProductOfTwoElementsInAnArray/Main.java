package MaximumProductOfTwoElementsInAnArray;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {3, 4, 5, 2};
        System.out.println("Example 1: " + solution.maxProduct(nums1)); // Output: 12

        int[] nums2 = {1, 5, 4, 5};
        System.out.println("Example 2: " + solution.maxProduct(nums2)); // Output: 16

        int[] nums3 = {3, 7};
        System.out.println("Example 3: " + solution.maxProduct(nums3)); // Output: 12
    }
}

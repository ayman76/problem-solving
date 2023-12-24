package MinimumChangesToMakeAlternatingBinaryString;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Example 1
        String s1 = "0100";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + solution.minOperations(s1));
        System.out.println();

        // Example 2
        String s2 = "10";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + solution.minOperations(s2));
        System.out.println();

        // Example 3
        String s3 = "1111";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + solution.minOperations(s3));
        System.out.println();

        // Example 4
        String s4 = "10010100";
        System.out.println("Input: " + s4);
        System.out.println("Output: " + solution.minOperations(s4));
    }
}

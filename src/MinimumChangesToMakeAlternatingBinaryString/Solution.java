package MinimumChangesToMakeAlternatingBinaryString;

public class Solution {
    public int minOperations(String s) {
        // Get the length of the input string
        int n = s.length();

        // Initialize a counter to keep track of the number of positions that need flipping
        int count = 0;

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the current character is in the correct position for an alternating pattern
            if (s.charAt(i) - '0' == i % 2) {
                // If not, increment the counter
                count++;
            }
        }

        // Return the minimum of two values:
        // 1. count - the number of positions that need flipping
        // 2. n - count - the number of positions that are already in the correct place
        return Math.min(count, n - count);
    }
}

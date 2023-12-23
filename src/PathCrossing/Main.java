package PathCrossing;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String path1 = "NES";
        String path2 = "NESWW";

        System.out.println("Input: path = '" + path1 + "'");
        System.out.println("Output: " + solution.isPathCrossing(path1));  // Output: false

        System.out.println("\nInput: path = '" + path2 + "'");
        System.out.println("Output: " + solution.isPathCrossing(path2));  // Output: true
    }
}

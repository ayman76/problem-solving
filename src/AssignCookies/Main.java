package AssignCookies;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        System.out.println("Output for g = [1, 2, 3] and s = [1, 1]: " + solution.findContentChildren(g1, s1)); // Output: 1

        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        System.out.println("Output for g = [1, 2] and s = [1, 2, 3]: " + solution.findContentChildren(g2, s2)); // Output: 2
    }
}

package MaximumScoreAfterSplittingString;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "011101";
        System.out.println("Maximum score for '" + s1 + "': " + solution.maxScore(s1));

        String s2 = "00111";
        System.out.println("Maximum score for '" + s2 + "': " + solution.maxScore(s2));

        String s3 = "1111";
        System.out.println("Maximum score for '" + s3 + "': " + solution.maxScore(s3));
    }
}

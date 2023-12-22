package MaximumScoreAfterSplittingString;

public class Solution {
    public int maxScore(String s) {
        String leftSubString; // will calculate number of zeros
        String rightSubString; // will calculate number of ones
        int maxScore = 0;
        if (!s.isEmpty()) {
            for (int i = 1; i < s.length(); i++) {
                leftSubString = s.substring(0, i);
                rightSubString = s.substring(i);
                int leftScore = (int) leftSubString.chars().filter(ch -> ch == '0').count();
                int rightScore = (int) rightSubString.chars().filter(ch -> ch == '1').count();
                int score = leftScore + rightScore;
                if (score > maxScore) maxScore = score;
            }
        }
        return maxScore;
    }
}
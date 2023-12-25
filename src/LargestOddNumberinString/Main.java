package LargestOddNumberinString;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        String num1 = "52";
        System.out.println("Input: num = \"" + num1 + "\"");
        System.out.println("Output: \"" + solution.largestOddNumber(num1) + "\"");

        String num2 = "4206";
        System.out.println("\nInput: num = \"" + num2 + "\"");
        System.out.println("Output: \"" + solution.largestOddNumber(num2) + "\"");

        String num3 = "35427";
        System.out.println("\nInput: num = \"" + num3 + "\"");
        System.out.println("Output: \"" + solution.largestOddNumber(num3) + "\"");
    }
}

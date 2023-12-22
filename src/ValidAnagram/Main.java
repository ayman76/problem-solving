package ValidAnagram;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Is '" + t1 + "' an anagram of '" + s1 + "'? " + solution.isAnagram(s1, t1));

        String s2 = "rat";
        String t2 = "car";
        System.out.println("Is '" + t2 + "' an anagram of '" + s2 + "'? " + solution.isAnagram(s2, t2));
    }
}

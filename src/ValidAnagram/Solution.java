package ValidAnagram;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return String.copyValueOf(sArray).equals(String.copyValueOf(tArray));
    }
}

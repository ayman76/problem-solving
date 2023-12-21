package MaxVerticalWidth;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparing(a -> a[0]));
        System.out.println(Arrays.deepToString(points));
        int maxWidth = 0;

        for (int i = 1; i < points.length; i++) {
            int currentDiff = points[i][0] - points[i - 1][0];
            maxWidth = Math.max(maxWidth, currentDiff);
        }
        return maxWidth;
    }

    public int maxWidthOfVerticalArea1(int[][] points) {
        int length = points.length;
        int arr[] = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = points[i][0];
        }


        Arrays.sort(arr);
        int maxWidth = 0;

        for (int i = 1; i < arr.length; i++) {
            int currentDiff = arr[i] - arr[i - 1];
            maxWidth = Math.max(maxWidth, currentDiff);
        }
        return maxWidth;
    }
}
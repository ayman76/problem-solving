package PathCrossing;

import java.util.HashSet;



public class Solution {

    public boolean isPathCrossing(String path) {
        char[] pathChar = path.toCharArray();
        HashSet<String> visitedPoints = new HashSet<>();
        int x = 0;
        int y = 0;
        visitedPoints.add("0,0");
        for (char c : pathChar) {
            switch (c) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
            }
            String currentPoint = x + "," + y;
            if (visitedPoints.contains(currentPoint)) {
                return true;
            } else {
                visitedPoints.add(currentPoint);
            }
        }
        return false;
    }
}

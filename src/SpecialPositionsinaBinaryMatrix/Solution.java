package SpecialPositionsinaBinaryMatrix;

public class Solution {
    public int numSpecial(int[][] mat) {
        int counter = 0;
        int numRows = mat.length;
        int numCols = mat[0].length;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    if (checkRow(mat, i, j, numCols) && checkCol(mat, i, j, numRows)) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    private static boolean checkRow(int[][] mat, int row, int col, int numCols) {
        for (int x = 0; x < numCols; x++) {
            if (x != col && mat[row][x] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkCol(int[][] mat, int row, int col, int numRows) {
        for (int x = 0; x < numRows; x++) {
            if (x != row && mat[x][col] == 1) {
                return false;
            }
        }
        return true;
    }
}

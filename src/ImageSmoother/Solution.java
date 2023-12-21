package ImageSmoother;

public class Solution {

    public int[][] imageSmoother(int[][] img) {
        int numRows = img.length;
        int numCols = (numRows > 0) ? img[0].length : 0;
        int[][] outputMatrix = new int[numRows][numCols];
        System.out.println(outputMatrix[0].length + " " + outputMatrix[1].length);

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                outputMatrix[i][j] = calculateAverage(img, i, j, numRows, numCols);
            }
        }
        return outputMatrix;
    }

    private int calculateAverage(int[][] img, int row, int col, int numRows, int numCols) {
        int total = 0;
        int count = 0;

        for (int i = row - 1; i <= row + 1; i++){
            for (int j = col - 1; j <= col + 1; j++){
                if(isValidCell(i, j, numRows, numCols)){
                    total += img[i][j];
                    count++;
                }
            }
        }

        return total / count;
    }

    private boolean isValidCell(int row, int col, int numRows, int numCols) {
        return row >= 0 && row < numRows && col >= 0 && col < numCols;
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

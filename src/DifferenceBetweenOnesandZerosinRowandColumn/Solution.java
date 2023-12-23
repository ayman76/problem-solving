package DifferenceBetweenOnesandZerosinRowandColumn;

import java.util.Arrays;

public class Solution {

    public int[][] onesMinusZeros(int[][] grid) {
        int numRows = grid.length;
        int numCols = (numRows > 0) ? grid[0].length : 0;
        int[][] diffGrid = new int[numRows][numCols];

        int[] numOfOnesInRows = new int[numRows];
        int[] numOfOnesInCols = new int[numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (grid[i][j] == 1) {
                    numOfOnesInRows[i]++;
                    numOfOnesInCols[j]++;
                }
            }
        }


        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                diffGrid[i][j] = numOfOnesInRows[i] + numOfOnesInCols[j] - (numCols - numOfOnesInRows[i]) - (numRows - numOfOnesInCols[j]);
            }
        }

//        System.out.println(Arrays.toString(diffGrid));
//        System.out.println(Arrays.toString(numOfOnesInRows));
//        System.out.println(Arrays.toString(numOfOnesInCols));
        return diffGrid;
    }


    public void print2dArray(int[][] arr){
        System.out.println("2D Array as String:");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}

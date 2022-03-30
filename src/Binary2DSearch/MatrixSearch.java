package Binary2DSearch;

import java.util.Arrays;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] nums = {
                {10, 23, 34},
                {35, 39, 42},
                {50, 57, 62}
        };

        System.out.println(Arrays.toString(search(nums, 59)));
    }


    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row,col};
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        // if element is not found
        return new int[]{-1,-1};
    }
}

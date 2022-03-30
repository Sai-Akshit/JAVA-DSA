package problems;
//multiplication of two matrix

import java.util.Arrays;

public class MatrixMultiply {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2},
                {3,4}
        };

        int[][] matrix2 = {
                {5,6},
                {7,8}
        };

        int i11 = (matrix1[0][0] * matrix2[0][0]) + (matrix1[0][1] * matrix2[1][0]);
        int i12 = (matrix1[0][0] * matrix2[0][1]) + (matrix1[0][1] * matrix2[1][1]);
        int i21 = (matrix1[1][0] * matrix2[0][0]) + (matrix1[1][1] * matrix2[1][0]);
        int i22 = (matrix1[1][0] * matrix2[0][1]) + (matrix1[1][1] * matrix2[1][1]);

        System.out.println(Arrays.toString(new int[] {i11, i12}));
        System.out.println(Arrays.toString(new int[] {i21, i22}));
    }
}

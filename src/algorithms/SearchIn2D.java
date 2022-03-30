package algorithms;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] num = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11}
        };

        int target = 10;
        int[] ans = search(num,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target) {
        for (int row=0; row<arr.length; row++) {
            for (int col=0; col <= row; col++) {
                if (target == arr[row][col]) {
                    return new int[] {row,col};
                }
            }
        }
        //if not present
        return new int[]{-1,-1};
    }
}

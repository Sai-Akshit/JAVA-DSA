// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

package Leetcode;

public class CountNegative {
    static int countNegative(int[][] grid) {
        int count = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid.length; j++) {
                if (grid[i][j] < 0) {
                    count ++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] num = {
                {5,1,0},
                {-5,-5,-5}
        };
        System.out.println(countNegative(num));
    }

}

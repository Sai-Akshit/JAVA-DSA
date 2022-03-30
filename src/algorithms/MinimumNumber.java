package algorithms;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,-9};
        System.out.println(min(num));
    }
    static int min(int[] arr) {
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < num) {
                num = arr[i];
            }
        }
        return num;
    }
}

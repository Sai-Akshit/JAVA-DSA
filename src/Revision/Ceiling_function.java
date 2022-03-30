package Revision;
//
public class Ceiling_function {
    public static void main(String[] args) {
        int[] num = {-10, -7, -4, 0, 1, 4, 35, 37, 89};
        int target = 3;
        System.out.println(ceiling(num, target));


    }

    static int ceiling(int[] arr, int target) {
        // checking if length of the array is zero
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                // mid element is the answer
                return mid;
            }
        }
        // if the element is not found we should return the largest number greater than the element
        return start;
    }

}

package Revision;

public class Floor_function {
    public static void main(String[] args) {
        int[] num = {-10, -7 , -5, 0, 3, 6, 7, 19, 20, 25, 30, 45};
        int target = 2;
        System.out.println(floorFunction(num, target));
    }

    static int floorFunction(int[] arr, int target) {
        // if no elements are present in the array
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
                return mid;
            }
        }
        return end;
    }

}

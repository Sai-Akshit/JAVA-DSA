package Revision;
// ceiling function

public class binary_search {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,7, 8, 10, 12,14,30};
        int target = 25;
        System.out.println(binarySearch(num, target));

    }

    static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Enter a valid array!");
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end)/2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid-1;
            } else {
                // middle element is the answer
                return mid;
            }
        }

        // if the number is not found
        return start;
    }
}

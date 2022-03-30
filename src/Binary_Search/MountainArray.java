package Binary_Search;

public class MountainArray {
    static int mountainArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (end>=start) {
            // checking if the length of array is less than 3
            if (arr.length < 3) {
                return -1;
            }

            while(end >= start) {
                int mid = (start + end)/2;

            }
        }

        // if number is not present in the array
        return -1;
    }
}

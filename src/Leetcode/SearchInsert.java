package Leetcode;

public class SearchInsert {

    static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = end - (end - start)/2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                // if the target element is found we are returning the index
                return mid;
            }
        }

        // if the target element is not found
        return start;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
}

package Revision1;

public class Binary_search {

    static int binarySearch(int[] arr, int target) {
        int start = 0; //index of first element
        int end = arr.length - 1; //index of ending element

        while (start <= end) {
            int mid = start + (end - start) / 2; //finding mid-value in this way so that it does not exceed max int value
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        //if the element is not present
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {-10,-8,-4,0,2,3,4,10,16,22,57,89};
        int target = 10;
        System.out.println(binarySearch(num,target));
    }
}

package Binary_Search;
//amazon question
public class InfiniteArray {
    static int ans(int[] arr, int target) {
        //first we need to find the range
        //let us start with a box of size 2
        int start = 0;
        int end = 1;

        //checking the condition for end and target
        while(target>arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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
        int[] array = {3, 5, 7, 9, 10, 90};
        int target = 90;
        System.out.println(ans(array,target));
    }
}

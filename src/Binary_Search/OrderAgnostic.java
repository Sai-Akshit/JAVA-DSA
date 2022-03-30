package Binary_Search;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] num = {1,2,3,5,6,7,8,90,100};
        int[] num2 = {100,98,78,56,37,29,10,0,-98};
        int target = 100;
        System.out.println(orderAgnostic(num,target));
        System.out.println(orderAgnostic(num2,target));
    }
    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //finding whether array is sorted asc or desc
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                //if array is ascending
                if (target < arr[mid]) {
                    end = mid -1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    //ans found
                    return mid;
                }
            } else {
                //if array is descending
                if (target > arr[mid]) {
                    end = mid -1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    //ans found
                    return mid;
                }
            }
        }

        //if index is not found
        return -1;
    }
}

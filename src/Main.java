public class Main {
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Length of the array is 0");
            return -1;
        }
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        //if index is not found
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            // int mid = start + (end-start)/2;
            int mid = (start + end)/2;

            if (arr[mid] > target) {
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static boolean check(int a, int b) {
        if (a == b) {
            return true;
        }
        //else
        return false;
    }

    public static void main(String[] args) {
        int[] num = {10,203,40,-10,-90,120};
        int target = 10;
        System.out.println(linearSearch(num,target));
        System.out.println(binarySearch(num,target));
        System.out.println(check(linearSearch(num,target), binarySearch(num,target)));
    }
}


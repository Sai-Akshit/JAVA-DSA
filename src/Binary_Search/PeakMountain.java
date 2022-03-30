package Binary_Search;

public class PeakMountain {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,9,10,17,28,45,78,90,110,108};
        //System.out.println(peakValue_linear(array));
        System.out.println(peakValue_binary(array));
    }

    static int peakValue_linear(int[] arr) { //this function uses linear search to find the max. value
        //if array length = 0
        if (arr.length == 0) {
            return -1;
        }
        int maxValue = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element > maxValue) {
                maxValue = element;
            }
        }
        //returning max. value
        return maxValue;
    }

    static int peakValue_binary(int[] arr) {

        //checking length of array
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end)/2;

        while (start <= end) {
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                //ans found
                return mid;
            }
        }
        //return start or end because both are pointing to the largest number
        return start;
    }
}

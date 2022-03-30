package Binary_Search;
//finding floor of a number

public class FloorFunction {
    public static void main(String[] args) {
        int[] num = {-10,-8,-4,0,2,3,4,10,16,22,57,89};
        int target = 20;

        System.out.println(ceilingFunction(num,target));
    }

    //if we find the number, we are going to return the index
    //if the number is not found, we are going to return index of the biggest number < target
    static int ceilingFunction(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //if target < the smallest number in sorted array
        if (target < arr[0]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }

        //when we do not find the element
        return arr[end+1]; // here we are returning the number
//        return end+1;
    }
}

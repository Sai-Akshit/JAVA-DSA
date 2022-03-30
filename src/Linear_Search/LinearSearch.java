package Linear_Search;
//linear search algorithm for 1D arrays
public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {-10,-7,-5,-2,0,1,5,7,10,12,23,46,76,89,90,107};
        int target = 46;
        linearSearch(num,target);
    }

    static int linearSearch(int[] arr, int target) {
        //checking if the length of the array is 0
        if (arr.length == 0) {
            return -1;
        }

        //checking target value in array
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        //if element is not found in the given array
        return -1;
    }
}

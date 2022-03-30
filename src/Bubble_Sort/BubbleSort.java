package Bubble_Sort;

import java.util.Arrays;

public class BubbleSort {
    /* Time Complexity
     best case = O(n)
     worst case = O(n^2) */
    public static void main(String[] args) {
        int arr[] = {19,20,36,16,89,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        // run the steps n-1 times
        for (int i=0; i<arr.length; i++) {
            boolean swapped = false;
            // for each step, max item will come at the last respective index
            for (int j=1; j<arr.length-i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if we did not swap for a particular value of i, it means the array is sorted hence stop the function
            if (!swapped) { // swapped == false
                break;
            }
        }
    }
}

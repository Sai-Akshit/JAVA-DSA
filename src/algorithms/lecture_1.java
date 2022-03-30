package algorithms;
//this is a linear search algorithm for 1D arrays

public class lecture_1 {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9,10};
        int target = 100;
        int ans = linearSearch(num, target);

        //printing the answer
        System.out.println(ans);
    }

    static int linearSearch(int some_array[], int target) {
        //if length of array is zero
        if (some_array.length == 0) {
            return -1;
        }
        //checking for target value in array
        for (int index=0; index < some_array.length; index++ ) {
            int element = some_array[index];
            if (element == target) {
                return index;
            }
        }
        //if element is not present in the array
        return -1;
    }
}

package algorithms;

public class EvenDigit {
    public static void main(String[] args) {
        int[] num = {1,23,456,7890,983,8765};
        System.out.println(findNumbers(num));
    }

    //checking the number in the array
    static int findNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    //checking whether number is even or not
     static boolean even(int num) {
        /* we can also use an if condition
            if(digits(num) % 2 == 0) {
                return true;
           }
         */
        return digits(num) % 2 == 0;
    }

    //checking no.of digits in a number
    static int digits(int num) {
        //if number is -ve
        if (num < 0) {
            num = num * -1;
        }
        //if number is zero
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}

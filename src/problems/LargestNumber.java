package problems;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number 1: ");
        int a = scanner.nextInt();
        System.out.print("Number 2: ");
        int b = scanner.nextInt();
        System.out.print("Number 3: ");
        int c = scanner.nextInt();

        if (a>b) {
            if (a>c) {
                System.out.println("Largest Number is: " + a);
            } else {
                System.out.println("Largest Number is: " +c);
            }
        } else {
            if (b>c) {
                System.out.println("Largest Number is: " +b);
            } else {
                System.out.println("Largest Number is: " +c);
            }
        }
    }
}

package problems;

import java.util.Scanner;

public class threeDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter another floating-point number: ");
        double b = scanner.nextDouble();

        a = Math.round(a);
        b = Math.round(b);

        if (a == b) {
            System.out.println("They are same");
        } else {
            System.out.println("They are different");
        }
    }
}
